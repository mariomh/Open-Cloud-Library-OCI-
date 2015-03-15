package org.oci.data.tables;

import java.util.LinkedList;
import java.util.List;

/**
 * Stores a queryable column key information
 * @author mario_mh
 *
 */
public class ColumnKey extends Column {
	
	/**
	 * Creates a new column key with the specified value
	 * @param key the column key name
	 * @param value the column value
	 * @return a new column key
	 */
	public static ColumnKey createKey(String key, Object value) {
		ColumnKey c = new ColumnKey();
		c.setColumnName(key);
		c.setValue(value);
		
		return c;
	}
	
	/**
	 * Creates a new list with exactly one key
	 * @param key the key
	 * @param value the value
	 * @return a list of exactly one key
	 */
	public static List<ColumnKey> createSingleKeyList(String key, Object value) {
		List<ColumnKey> k = new LinkedList<ColumnKey>();
		
		k.add(createKey(key, value));
		
		return k;
	}

	private Object value;

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
}
