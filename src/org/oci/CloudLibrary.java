package org.oci;

import org.oci.data.DatastoreService;
import org.oci.messaging.CloudMessagingService;
import org.oci.storage.BlobService;

/**
 * Abstract base class for the cloud library
 * @author mario_mh
 *
 */
public abstract class CloudLibrary {
	
	private CloudCredentials cred;
	
	/**
	 * Creates a new Cloud Library with the specified access credentials
	 * @param accessCredentials
	 */
	public CloudLibrary(CloudCredentials accessCredentials) {
		setAccessCredentials(accessCredentials);
	}

	/**
	 * @return the access credentials
	 */
	public CloudCredentials getAccessCredentials() {
		return cred;
	}

	/**
	 * @param accessCredentials the access credentials to set
	 */
	public void setAccessCredentials(CloudCredentials accessCredentials) {
		this.cred = accessCredentials;
	}
	
	/**
	 * Gets the specified Messaging client
	 * @return
	 */
	public abstract CloudMessagingService getMessageClient();
	
	/**
	 * Gets the blob service
	 * @return the blob service
	 */
	public abstract BlobService getStorageClient();
	
	/**
	 * Gets the datastore service
	 * @return the datastore service
	 */
	public abstract DatastoreService getDatastoreService();

}
