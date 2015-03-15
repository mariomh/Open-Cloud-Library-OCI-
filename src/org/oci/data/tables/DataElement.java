package org.oci.data.tables;

import java.util.AbstractMap;
import java.util.HashMap;

/**
 * Simple class that stores data
 * @author mario_mh
 *
 */
public class DataElement {
	
	private AbstractMap.SimpleEntry<String, Object> primaryKey;
	private HashMap<String, Object> secondaryKeys;
	private HashMap<String, Object> items;
	private HashMap<String, HashMap<String, Object>> complexElements;
	
	/**
	 * Creates a new data element with the specified key
	 * @param keyName
	 * @param keyValue
	 */
	public DataElement(String keyName, Object keyValue) {
		primaryKey = new AbstractMap.SimpleEntry<String, Object>(keyName, keyValue);
		secondaryKeys = new HashMap<String, Object>();
		items = new HashMap<String, Object>();
		complexElements = new HashMap<String, HashMap<String, Object>>();
	}
	
	/**
	 * Gets the primary key
	 * @return the primary key
	 */
	public AbstractMap.SimpleEntry<String, Object> getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * Gets the secondary keys
	 * @return the secondary keys
	 */
	public HashMap<String, Object> getSecondaryKeys() {
		return secondaryKeys;
	}

	/**
	 * Gets all items
	 * @return the items
	 */
	public HashMap<String, Object> getItems() {
		return items;
	}

	public HashMap<String, HashMap<String, Object>> getComplexElements() {
		return complexElements;
	}
	
}
