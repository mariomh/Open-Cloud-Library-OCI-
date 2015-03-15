package org.oci.data.tables;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a single table query
 * @author mario_mh
 *
 */
public class TableScanQuery {
	
	private List<String> columnNames;
	
	private List<TableQueryStructure> structure;
	
	/**
	 * Creates a new Table scan
	 */
	public TableScanQuery() {
		this.structure = new LinkedList<TableQueryStructure>();
		setColumnNames(new LinkedList<String>());
	}
	
	/**
	 * Adds a column name to the query
	 * @param colName
	 * @return
	 */
	public TableScanQuery addColumn(String colName) {
		
		columnNames.add(colName);
		
		return this;
	}
	
	/**
	 * Appends a new query to the table query
	 * @param operator
	 * @return
	 */
	public TableScanQuery appendQuery(TableQueryItem item) {
		return appendQuery(TableQueryOperation.AND, item);
	}
	
	/**
	 * Gets the table queries
	 * @return the list of queries
	 */
	public List<TableQueryStructure> getQueryParameters() {
		return this.structure;
	}
	
	/**
	 * Appends a new query to the table query
	 * @param op
	 * @param operator
	 * @return
	 */
	public TableScanQuery appendQuery(TableQueryOperation op, TableQueryItem item) {
		
		structure.add(new TableQueryStructure(item, op));
		
		return this;
	}

	/**
	 * @return the columnNames
	 */
	public List<String> getColumnNames() {
		return columnNames;
	}

	/**
	 * @param columnNames the columnNames to set
	 */
	private void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}

}
