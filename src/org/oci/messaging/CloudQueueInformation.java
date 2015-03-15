package org.oci.messaging;

import java.util.Map;

/**
 * Provides information about a queue
 * @author mario_mh
 *
 */
public class CloudQueueInformation {
	
	private Map<String, String> map;
	
	/**
	 * Creates a new instance of this class
	 * @param attributes the attribute collection
	 */
	public CloudQueueInformation(Map<String, String> attributes) {
		this.map = attributes;
	}
	
	/**
	 * Gets the Attributes for the queue
	 * @return a map of attributes
	 */
	public Map<String, String> getAttributes() {
		return this.map;
	}

}
