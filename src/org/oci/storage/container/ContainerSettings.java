package org.oci.storage.container;

import java.util.HashMap;

/**
 * Provides means to handle container settings
 * @author mario_mh
 *
 */
public abstract class ContainerSettings extends HashMap<String, Object> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3764437649002025070L;

	/**
	 * Gets the access control list associated with this container
	 * @return the access control list
	 */
	public abstract ContainerAccessControl getContainerAccessControl();
	
	/**
	 * Gets the cors settings associated with the container
	 * @return the cors settings
	 */
	public abstract ContainerCorsSettings getContainerCorsSettings();
	
	/**
	 * Gets the container lifecycle information
	 * @return the lifecycle information
	 */
	public abstract ContainerLifecycle getContainerLifecycle();
	
	/**
	 * Gets the container policy
	 * @return the container policy
	 */
	public abstract ContainerPolicy getContainerPolicy();
	
	/**
	 * Gets the container region
	 * @return the container region
	 */
	public abstract ContainerRegion getContainerRegion();
	
	/**
	 * Gets the logging settings
	 * @return the settings
	 */
	public abstract ContainerLoggingSettings getLoggingSettings();
	
	/**
	 * Gets the container notifications
	 * @return the container notifications
	 */
	public abstract ContainerNotifications getContainerNotifications();
	
	/**
	 * Gets tags associated with the container
	 * @return the container tags
	 */
	public abstract ContainerTags getContainerTags();
	
	/**
	 * Gets information about container object versions
	 * @return container object versions
	 */
	public abstract ContainerObjectVersions getContainerObjectVersions();
	
	/**
	 * Gets version settings associated with the container
	 * @return the version settings
	 */ 
	public abstract ContainerVersioningSettings getContainerVersioningSettings();
	
	/**
	 * Sets the container versioning settings
	 * @param cvs the settings
	 */
	public abstract void setContainerVersioningSettings(ContainerVersioningSettings cvs);
	
	/**
	 * Gets the container website configuration
	 * @return the website configuration
	 */
	public abstract ContainerWebsiteConfiguration getContainerWebsiteConfiguration();
	
	/**
	 * Gets the container properties
	 * @return the container properties
	 */
	public abstract ContainerProperties getContainerProperties();
	
	/**
	 * Deletes the Cors settings from the container
	 */
	public abstract void deleteContainerCorsSettings();
	
	/**
	 * Deletes the lifecycle settings in the container
	 */
	public abstract void deleteContainerLifecycleSettings();
	
	/**
	 * Deletes the container access control
	 */
	public abstract void deleteContainerAccessControl();
	
	/**
	 * Delets the container tags
	 */
	public abstract void deleteContainerTags();
	
	/**
	 * Delets the container website configuration
	 */
	public abstract void deleteContainerWebsiteConfiguration();
	
	/**
	 * Sets the container access control
	 * @param ctrl the access control settings
	 */
	public abstract void setContainerAccessControl(ContainerAccessControl ctrl);
	
	/**
	 * Sets the container Cors policy
	 * @param cors the cors policy
	 */
	public abstract void setContainerCorsPolicy(ContainerCorsSettings cors);
	
	/**
	 * Sets the container lifecycle properties
	 * @param cylce the properties
	 */
	public abstract void setContainerLifecycle(ContainerLifecycle cylce);
	
	/**
	 * Sets the container policy
	 * @param policy the policy
	 */
	public abstract void setContainerPolicy(ContainerPolicy policy);
	
	/**
	 * Sets the container logging settings
	 * @param logging the settings
	 */
	public abstract void setContainerLoggingSettings(ContainerLoggingSettings logging);
	
	/**
	 * Adds a container notification
	 * @param notify the notification settings
	 */
	public abstract void addContainerNotification(ContainerNotifications notify);
	
	/**
	 * Adds tags to the container
	 * @param tags the tags
	 */
	public abstract void addContainerTags(ContainerTags tags);
	
	/**
	 * enables the version logging on the container
	 * @param state the state
	 */
	public abstract void enableVersioning(boolean state);
	
	/**
	 * Sets the website configuration for the container
	 * @param config the settings
	 */
	public abstract void setWebsiteConfiguration(ContainerWebsiteConfiguration config);

}
