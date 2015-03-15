package org.oci.storage;

import java.util.List;

import org.oci.CloudCredentials;
import org.oci.storage.container.ContainerProperties;
import org.oci.storage.container.ContainerSettings;
import org.oci.storage.object.Multipart;

/**
 * Abstract base class for the container service
 * @author mario_mh
 *
 */
public abstract class ContainerService {

	private CloudCredentials credentials;
	private String container;
	
	/**
	 * Creates the container service
	 * @param cred the access credentials
	 * @param container the container name
	 */
	public ContainerService(CloudCredentials cred, String container) {
		this.credentials = cred;
		this.container = container;
	}
	
	/**
	 * Gets the cloud credentials used by the service
	 * @return the cloud credentials
	 */
	public CloudCredentials getCredentials() {
		return this.credentials;
	}
	
	/**
	 * Gets the settings for the container
	 * @return the settings
	 */
	public abstract ContainerSettings getSettings();
	
	/**
	 * Lists all objects that exist in a container
	 * @return the objects in a container
	 */
	public abstract List<String> listObjects();
	
	/**
	 * Deletes a container
	 */
	public abstract void deleteContainer();
	
	/**
	 * checks if a container exists
	 * @return true if the container exists, otherwise false
	 */
	public abstract boolean doesContainerExist();
	
	/**
	 * Shows all multipart uploads currently in progress
	 * @return the multipart uploads
	 */
	public abstract List<Multipart> getMultipartUploads();
	
	/**
	 * Creates a container with the specified properties
	 * @param props
	 */
	public abstract void create(ContainerProperties props);
	
	/**
	 * Gets a cloud object
	 * @param object the name of the object
	 * @return the cloud object
	 */
	public abstract ObjectService getObject(String object);
	
	/**
	 * deletes a cloud object
	 * @param object
	 */
	public abstract void deleteCloudObject(String object);
	
	/**
	 * deletes several cloud objects
	 * @param objects the objects to delete
	 */
	public abstract void deleteCloudObjects(String[] objects);
	
	/**
	 * deletes a cloud object
	 * @param object the object to delete
	 */
	public abstract void deleteCloudObject(ObjectService object);
	
	/**
	 * deltes several cloud objects
	 * @param objects the objects
	 */
	public abstract void deleteCloudObjects(ObjectService[] objects);

	/**
	 * @return the container
	 */
	public String getContainerName() {
		return container;
	}
}
