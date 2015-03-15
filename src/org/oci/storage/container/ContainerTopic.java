package org.oci.storage.container;

/**
 * Stores topic notification informations
 * @author mario_mh
 *
 */
public class ContainerTopic {
	
	private String topic;
	private String notification;
	
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the notification
	 */
	public String getEvent() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setEvent(String notification) {
		this.notification = notification;
	}

}
