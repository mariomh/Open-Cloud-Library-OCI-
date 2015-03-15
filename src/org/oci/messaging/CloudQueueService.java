package org.oci.messaging;

/**
 * This interface provides operations for a specific queue
 * @author mario_mh
 *
 */
public abstract class CloudQueueService {
	
	/**
	 * Send a specific message to a queue
	 * @param msg the message to send
	 */
	public abstract void sendMessage(CloudMessage msg);
	
	/**
	 * Take the first message from the queue. This changes the visibility so that other clients can't retrieve the message.
	 * @return the message
	 */
	public abstract CloudMessage popMessage();

	/**
	 * Takes the first message from the queue without changing it's visibility.
	 * @return
	 */
	public abstract CloudMessage peekMessage();
	
	/**
	 * Deletes a message from the queue
	 * @param msg the message
	 */
	public abstract void deleteMessage(CloudMessage msg);
	
	/**
	 * changes the visibility of a message
	 * @param msg the message this operation applies to
	 * @param vis the visibility
	 */
	public abstract void changeMessageVisibility(CloudMessage msg, MessageVisibility vis);
	
	/***
	 * Batch operation to send one or more messages to the queue 
	 * @param msgs the messages
	 */
	public abstract void sendMessages(CloudMessage[] msgs);
	
	/**
	 * Batch operation to delete one or more messages from the queue
	 * @param msgs the messages
	 */
	public abstract void deleteMessages(CloudMessage[] msgs);
	
	/**
	 * Get more messages. Maximum is 10.
	 * @param num The number of messages. Maximum is 10
	 * @return the Messages
	 */
	public abstract CloudMessage[] popMessages(int num);
}
