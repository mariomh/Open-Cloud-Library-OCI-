package org.oci.data.tables;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Stores information on the table settings
 * @author mario_mh
 *
 */
public class TableSettings {

	private List<Column> columns;
	private HashMap<String, Object> settings;
	
	/**
	 * Creates the table settings
	 */
	public TableSettings() {
		this.setColumns(new LinkedList<Column>());
		this.setSettings(new HashMap<String, Object>());
	}

	/**
	 * @return the columns
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	private void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	/**
	 * @return the settings
	 */
	public HashMap<String, Object> getSettings() {
		return settings;
	}

	/**
	 * @param settings the settings to set
	 */
	private void setSettings(HashMap<String, Object> settings) {
		this.settings = settings;
	}
	
}
