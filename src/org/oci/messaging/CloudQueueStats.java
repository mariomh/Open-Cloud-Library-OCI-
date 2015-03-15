package org.oci.messaging;

import java.util.HashMap;

/**
 * Stores information about the queue statistics
 * @author mario_mh
 *
 */
public class CloudQueueStats extends HashMap<String, Object> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -883827607332350521L;

	/**
	 * Adds a new Queue Stat entry
	 * @param name the name of the stat
	 * @param value the value
	 */
	public void AddStat(String name, Object value) {
		this.put(name, value);
	}

}
