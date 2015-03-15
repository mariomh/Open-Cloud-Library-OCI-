package org.oci.storage;

import org.oci.storage.object.MultipartObject;
import org.oci.storage.object.ObjectResource;
import org.oci.storage.object.ObjectSettings;

/**
 * Provides operations on objects
 * @author mario_mh
 *
 */
public abstract class ObjectService {
	
	private String objectName;
	
	/**
	 * Instantiates a new cloud object
	 * @param name the name
	 */
	public ObjectService(String name) {
		setObjectName(name);
	}
	
	/**
	 * Creates the object from a resource
	 * @param resource the resource type
	 */
	public abstract void create(ObjectResource resource);
	
	/**
	 * Gets the object itself
	 * @return the object
	 */
	public abstract ObjectResource getObject();
	
	/**
	 * Restores an object
	 * @param version the object version id
	 */
	public abstract void restoreObject(String version);
	
	/**
	 * Copies an object with a specific target
	 * @param target
	 */
	public abstract void copyObject(String target);
	
	/**
	 * Creates a snapshot from the object
	 */
	public abstract void snapshotObject();
	
	/**
	 * Provides methods to handle multipart files
	 * @return a class operating on multipart files
	 */
	public abstract MultipartObject getMultipart();
	
	/**
	 * Handels settings for the object
	 * @return the settings
	 */
	public abstract ObjectSettings getSettings();

	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @param objectName the objectName to set
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
