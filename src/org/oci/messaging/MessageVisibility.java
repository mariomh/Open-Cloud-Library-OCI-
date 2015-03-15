package org.oci.messaging;

/**
 * Provides information about the message visibility
 * @author mario_mh
 *
 */
public class MessageVisibility {
	
	private int timeOut = 0;

	/**
	 * @return the timeOut
	 */
	public int getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut the timeOut to set
	 */
	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}

}
