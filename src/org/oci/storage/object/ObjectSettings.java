package org.oci.storage.object;

/**
 * Provides settings for a specific object
 * @author mario_mh
 *
 */
public abstract class ObjectSettings {
	
	/**
	 * Gets the access control for the object
	 * @return the settings
	 */
	public abstract CloudObjectAccessControl getObjectAccessControl();
	
	/**
	 * Gets metadata associated with the object
	 * @return the metadata
	 */ 
	public abstract ObjectMeta getObjectMetadata();
	
	/**
	 * Sets metadata associated with the object
	 * @param data the metadata
	 */
	public abstract void setObjectMetadata(ObjectMeta data);
	
	/**
	 * Gets object properties associated with the object
	 * @return the object properties
	 */
	public abstract ObjectProperties getObjectProperties();
	
	/**
	 * Sets object metadata. This can only be done when the object is created
	 * @param props the properties
	 */
	public abstract void setObjectProperties(ObjectProperties props);
	
	/**
	 * Sets the access control for the object
	 * @param access the settings
	 */
	public abstract void setObjectAccessControl(CloudObjectAccessControl access);

}
