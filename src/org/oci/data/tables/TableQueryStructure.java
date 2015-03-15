package org.oci.data.tables;

/**
 * Stores the table query structure
 * @author mario_mh
 *
 */
public class TableQueryStructure {
	
	private TableQueryItem item;
	private TableQueryOperation operator;
	
	/**
	 * Creates a new table query structure item
	 * @param item
	 * @param operator
	 */
	public TableQueryStructure(TableQueryItem item, TableQueryOperation operator) {
		setItem(item);
		setOperation(operator);
	}
	
	/**
	 * @return the item
	 */
	public TableQueryItem getItem() {
		return item;
	}
	
	/**
	 * @param item the item to set
	 */
	private void setItem(TableQueryItem item) {
		this.item = item;
	}

	/**
	 * @return the operator
	 */
	public TableQueryOperation getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	private void setOperation(TableQueryOperation operator) {
		this.operator = operator;
	}

}
