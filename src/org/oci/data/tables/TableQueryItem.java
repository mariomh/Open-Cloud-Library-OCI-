package org.oci.data.tables;

/**
 * Represents one table query item
 * @author mario_mh
 *
 */
public class TableQueryItem {

	private String columnName;
	private TableQueryOperator queryOperator;
	private Object queryParameter;
	private Object additionalQueryParameter;
	
	/**
	 * Creates a new query item
	 * @param columnName
	 * @param queryOperator
	 * @param queryParameter
	 */
	public TableQueryItem(String columnName, TableQueryOperator queryOperator, Object queryParameter) {
		setColumnName(columnName);
		setQueryOperator(queryOperator);
		setQueryParameter(queryParameter);
	}
	
	/**
	 * Creates a new query item
	 * @param columnName
	 * @param queryOperator
	 * @param queryParameter
	 * @param additionalQueryParameter
	 */
	public TableQueryItem(String columnName, TableQueryOperator queryOperator, Object queryParameter, Object additionalQueryParameter) {
		this(columnName, queryOperator, additionalQueryParameter);
		
		setAdditionalQueryParameter(additionalQueryParameter);
	}
	
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}
	
	/**
	 * @param columnName the columnName to set
	 */
	private void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @return the queryOperator
	 */
	public TableQueryOperator getQueryOperator() {
		return queryOperator;
	}

	/**
	 * @param queryOperator the queryOperator to set
	 */
	private void setQueryOperator(TableQueryOperator queryOperator) {
		this.queryOperator = queryOperator;
	}

	/**
	 * @return the queryParameter
	 */
	public Object getQueryParameter() {
		return queryParameter;
	}

	/**
	 * @param queryParameter the queryParameter to set
	 */
	private void setQueryParameter(Object queryParameter) {
		this.queryParameter = queryParameter;
	}

	/**
	 * @return the additionalQueryParameter
	 */
	public Object getAdditionalQueryParameter() {
		return additionalQueryParameter;
	}

	/**
	 * @param additionalQueryParameter the additionalQueryParameter to set
	 */
	private void setAdditionalQueryParameter(Object additionalQueryParameter) {
		this.additionalQueryParameter = additionalQueryParameter;
	}
}
