package org.oci.data;

import java.util.List;

import org.oci.CloudBase;
import org.oci.CloudCredentials;

/**
 * Creates the datastore client
 * @author mario_mh
 *
 */
public abstract class DatastoreService extends CloudBase {

	/**
	 * Creates the datastore client
	 * @param credentials
	 */
	public DatastoreService(CloudCredentials credentials) {
		super(credentials);
	}
	
	/**
	 * Gets a list of Tables under the current service
	 * @return a list of tables
	 */
	public abstract List<String> listTables();
	
	/**
	 * Returns a table service to work on tables
	 * @param table the table name
	 * @return the table service
	 */
	public abstract TableService getTable(String table);

}
