package org.oci.storage.container;

/**
 * Stores information about the logging configuration of the container
 * @author mario_mh
 *
 */
public class ContainerLoggingSettings {
	
	private String targetName;
	private String prefix;
	
	/**
	 * @return the targetName
	 */
	public String getTargetName() {
		return targetName;
	}
	
	/**
	 * @param targetName the targetName to set
	 */
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
