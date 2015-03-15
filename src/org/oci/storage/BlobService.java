package org.oci.storage;

import java.util.List;

import org.oci.CloudCredentials;

/**
 * An abstract class handling the blob service
 * @author mario_mh
 *
 */
public abstract class BlobService {
	
	private CloudCredentials credentials;
	
	/**
	 * Instantiates the blob service
	 * @param cred
	 */
	public BlobService(CloudCredentials cred) {
		credentials = cred;
	}
	
	/**
	 * Gets the cloud credentials used for the service
	 * @return the cloud credentials
	 */
	public CloudCredentials getCredentials() {
		return this.credentials;
	}
	
	/**
	 * Gets a list of containers for the service
	 * @return a list of containers
	 */
	public abstract List<String> getContainers();
	
	/**
	 * Gets the service properties for the blob service
	 * @return the service properties
	 */
	public abstract BlobServiceProperties getBlobServiceProperties();
	
	/**
	 * Gets the service statistics used for the current blob service
	 * @return the service statistics
	 */
	public abstract BlobServiceStatistics getBlobServiceStatistics();
	
	/**
	 * Gets a specific container from the blob storage
	 * @param container the desired container
	 * @return the container
	 */
	public abstract ContainerService getContainer(String container);

}
