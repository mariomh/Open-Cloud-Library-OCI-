package org.oci.data.tables;

/**
 * Represents a single column
 * @author mario_mh
 *
 */
public class Column {

	private String columnName;
	private ColumnType columnType;
	private boolean isPrimaryKey;
	private ColumnKeyType keyType;
	
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}
	
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @return the columnType
	 */
	public ColumnType getColumnType() {
		return columnType;
	}

	/**
	 * @param columnType the columnType to set
	 */
	public void setColumnType(ColumnType columnType) {
		this.columnType = columnType;
	}

	/**
	 * @return the isPrimaryKey
	 */
	public boolean isPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * @param isPrimaryKey the isPrimaryKey to set
	 */
	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	/**
	 * @return the keyType
	 */
	public ColumnKeyType getKeyType() {
		return keyType;
	}

	/**
	 * @param keyType the keyType to set
	 */
	public void setKeyType(ColumnKeyType keyType) {
		this.keyType = keyType;
	}
	
}
