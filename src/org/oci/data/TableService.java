package org.oci.data;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.oci.CloudBase;
import org.oci.CloudCredentials;
import org.oci.data.tables.ColumnKey;
import org.oci.data.tables.ComplexElement;
import org.oci.data.tables.DataElement;
import org.oci.data.tables.FieldElement;
import org.oci.data.tables.KeyElement;
import org.oci.data.tables.TableScanQuery;
import org.oci.data.tables.TableSettings;

/**
 * Provides methods to work on tables
 * @author mario_mh
 *
 */
public abstract class TableService extends CloudBase {

	/**
	 * Creates a table service
	 * @param credentials
	 */
	public TableService(CloudCredentials credentials) {
		super(credentials);
	}
	
	/**
	 * Creates a table with the given settings
	 * @param settings
	 */
	public abstract void createTable(TableSettings settings);
	
	/**
	 * Updates the table settings
	 * @param settings the settings
	 */
	public abstract void updateTable(TableSettings settings);
	
	/**
	 * Gets the table settings
	 * @return the settings
	 */
	public abstract TableSettings getSettings();
	
	/**
	 * Deletes the table
	 */
	public abstract void deleteTable();
	
	/**
	 * Write an item to the selected table
	 * @param items the items to write
	 */
	public abstract void writeItem(DataElement element);
	
	/**
	 * Updates an item to the selected table
	 * @param element the item to update
	 */
	public abstract void updateItem(DataElement element);
	
	/**
	 * Deletes an item
	 * @param element the element to delete
	 */
	public abstract void deleteItem(DataElement element);
	
	/**
	 * Deletes an entity
	 * @param entity the entity to delete
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public void deleteItem(Object entity) throws IllegalArgumentException, IllegalAccessException {
		deleteItem(createElement(entity));
	}
	
	/**
	 * Updates an item to the selected table
	 * @param entity the item to update
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public void updateItem(Object entity) throws IllegalArgumentException, IllegalAccessException {
		
		DataElement dat = createElement(entity);
		
		updateItem(dat);
	}
	
	/**
	 * Gets a single item from the database with the provided key
	 * @param key
	 * @return
	 */
	public abstract DataElement getItem(List<ColumnKey> key);
	
	/**
	 * Gets a single item from the database as an object
	 * @param key
	 * @param type
	 * @return 
	 * @return the object
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 */
	public <T> T getItemAs(List<ColumnKey> key, T type) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, InstantiationException {
		
		DataElement elem = getItem(key);
		
		return createElement(type, elem);
	}

	@SuppressWarnings("unchecked")
	private <T> T createElement(T elementType, DataElement elem)
			throws IllegalAccessException, InstantiationException {
		
		Object type = elementType.getClass().newInstance();
		
		for(Field f : type.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			
			if(f.isAnnotationPresent(KeyElement.class)) {
				
				KeyElement keyE = f.getAnnotation(KeyElement.class);
				
				if(keyE.isPrimary())
					if(elem.getPrimaryKey().getValue() != null)
						f.set(type, elem.getPrimaryKey().getValue());
					else {
						String kname = "";
						
						if(keyE.keyName().equals(""))
							kname = f.getName();
						else
							kname = keyE.keyName();
						
						f.set(type, elem.getItems().get(kname));
					}
				else {
					
					String kname = "";
					
					if(keyE.keyName().equals(""))
						kname = f.getName();
					else
						kname = keyE.keyName();
					
					// Windows Azure workaround - WA doesn't know keys else then row/partition key :(
					if(elem.getSecondaryKeys().containsKey("rowKey-wa"))
						f.set(type, elem.getSecondaryKeys().get("rowKey-wa"));
					else {
					
						if(elem.getSecondaryKeys().get(kname) != null)
							f.set(type, elem.getSecondaryKeys().get(kname));
						else
							f.set(type, elem.getItems().get(kname));
						
					}
				}
			}
			else if(f.isAnnotationPresent(FieldElement.class)) {
				
				FieldElement fe = f.getAnnotation(FieldElement.class);
				String name = "";
				
				if(fe.fieldName().equals("")) 
					name = f.getName();
				else
					name = fe.fieldName();
					
				f.set(type, saveSet(elem.getItems().get(name), f));
			}
			else if(f.isAnnotationPresent(ComplexElement.class)) {
				
				ComplexElement ce = f.getAnnotation(ComplexElement.class);
				
				String name = "";
				
				if(ce.elementName().equals(""))
					name = f.getName();
				else name = ce.elementName();
				
				if(f.get(type) == null) {
					f.set(type, f.getType().newInstance());
				}
				
				Object subObject = f.get(type);
				
				for(Field sf : subObject.getClass().getDeclaredFields()) {
					sf.setAccessible(true);
					
					if(sf.isAnnotationPresent(FieldElement.class)) {
						
						FieldElement subF = sf.getAnnotation(FieldElement.class);
						
						String sna = "";
						
						if(subF.fieldName().equals(""))
							sna = sf.getName();
						else
							sna = subF.fieldName();
						
						if(elem.getComplexElements() != null) {
							HashMap<String, Object> hm = elem.getComplexElements().get(name);
							
							Object o = null;
							
							if(hm != null)
								o = hm.get(sna);
							
							sf.set(subObject, saveSet(o, f));
						}
					}
				}
			}
		}
		return (T) type;
	}
	
	/**
	 * Provides a save method to set values on a field
	 * @param o the value to set
	 * @param f the target field
	 * @return the save object
	 */
	private Object saveSet(Object o, Field f) {
		
		if(o == null) {
			if(f.getType().getName().equals("int") ||
			   f.getType().getName().equals("long") ||
			   f.getType().getName().equals("double") ||
			   f.getType().getName().equals("float"))
					o = 0;
		}

		return o;
	}

	/**
	 * Gets several items from the database based on a query
	 * @param query
	 * @return
	 */
	public abstract List<DataElement> scan(TableScanQuery query);
	
	public <T> List<T> scan(TableScanQuery query, T type) throws IllegalAccessException, InstantiationException {
		
		List<T> items = new LinkedList<T>();
		List<DataElement> de = scan(query);
		
		for(DataElement d : de) {
			
			items.add(createElement(type, d));
		}
		
		return items;
	}
	
	/**
	 * Write an item to the selected table
	 * @param entity the item
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public void writeItem(Object entity) throws IllegalArgumentException, IllegalAccessException {
		
		DataElement dat = createElement(entity);
		
		writeItem(dat);
	}
	
	/**
	 * Creates an Element to write to
	 * @param entity the data entity
	 * @return the data entity
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	private DataElement createElement(Object entity) throws IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> c = entity.getClass();
		
		DataElement dat = null;
		
		HashMap<String, Object> secKeys = new HashMap<String, Object>();
		HashMap<String, Object> values = new HashMap<String, Object>();
		HashMap<String, HashMap<String, Object>> complexTypes = new  HashMap<String, HashMap<String, Object>>();
		
		for(Field f : c.getDeclaredFields()) {
			
			f.setAccessible(true);
			
			if(f.isAnnotationPresent(KeyElement.class)) {
				
				KeyElement key = f.getAnnotation(KeyElement.class);
				String keyItemName = "";
				
				if(key.keyName().equals("")) {
					keyItemName = f.getName();
				}
				else keyItemName = key.keyName();
				
				if(key.isPrimary()) {
					dat = new DataElement(keyItemName, f.get(entity));
				}
				else secKeys.put(keyItemName, f.get(entity));
				
			}
			else if(f.isAnnotationPresent(FieldElement.class)) {
				
				FieldElement field = f.getAnnotation(FieldElement.class);
				String fieldName = "";
				
				if(field.fieldName().equals("")) {
					fieldName = f.getName();
				}
				else fieldName = field.fieldName();
				
				values.put(fieldName, f.get(entity));
			}
			else if(f.isAnnotationPresent(ComplexElement.class)) {
				
				ComplexElement ce = f.getAnnotation(ComplexElement.class);
				
				String ceName = "";
				
				if(ce.elementName().equals("")) {
					ceName = f.getName();
				} 
				else ceName = ce.elementName();
				
				Class<? extends Object> compl = f.get(entity).getClass();
				
				HashMap<String, Object> items = new HashMap<String, Object>();
				
				for(Field fs : compl.getDeclaredFields()) {
					
					fs.setAccessible(true);
					
					if(fs.isAnnotationPresent(FieldElement.class)) {
						
						FieldElement sub = fs.getAnnotation(FieldElement.class);
						String subName = "";
						
						if(sub.fieldName().equals("")) {
							subName = fs.getName();
						}
						else subName = sub.fieldName();
						
						items.put(subName, fs.get(f.get(entity)));
					}
				}
				
				complexTypes.put(ceName, items);
			}
		}
		
		if(dat!=null) {
			dat.getSecondaryKeys().putAll(secKeys);
			dat.getItems().putAll(values);
			dat.getComplexElements().putAll(complexTypes);
			
			return dat;
		}
		else throw new IllegalArgumentException("A primary key must be specified");
	}
}
