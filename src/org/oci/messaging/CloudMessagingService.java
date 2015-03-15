package org.oci.messaging;

import org.oci.CloudCredentials;

/**
 * This interface provides abstract methods for cloud messaging
 * @author mario_mh
 *
 */
public abstract class CloudMessagingService {
	
	/**
	 * Lists all available queues for the account
	 * @return a list of queue names
	 */
	public abstract String[] listQueues();
	
	/**
	 * Get information about a specific queue
	 * @param queueName the name of the queue to get details on
	 * @return informations about a queue
	 */
	public abstract CloudQueueInformation getQueueDetails(String queueName);

	/**
	 * Get the URI of a queue
	 * @param queueName
	 * @return
	 */
	public abstract String getQueueUri(String queueName);
	
	/**
	 * Adds an attribute to a queue
	 * @param queueName the name of the queue
	 * @param key the key
	 * @param value the value
	 */
	public abstract void addAttributeToQueue(String queueName, String key, String value);
	
	/**
	 * Set the queue permissions for a specific queue
	 * @param queueName the name of the queue
	 * @param perm the permission set
	 */
	public abstract void setQueuePermissions(String queueName, CloudQueuePermissions perm);
	
	/**
	 * Deletes a specific queue
	 * @param queueName the name of the queue
	 */
	public abstract void deleteQueue(String queueName);
	
	/**
	 * Creates a new queue
	 * @param queueName the name of the queue
	 */
	public abstract void createQueue(String queueName);
	
	/**
	 * Gets the statistics of a queue (if supported)
	 * @param queueName the name of the queue
	 * @return the statistics for the queue
	 */
	public abstract CloudQueueStats getQueueStatistics(String queueName);
	
	/**
	 * Gets the message queue for operations on the queue
	 * @param queueName the name of the queue
	 * @return the queue
	 */
	public abstract CloudQueueService getQueue(String queueName);
	
	/**
	 * Sets the access credentials used for the specific account
	 * @param cred the credentials
	 */
	public abstract void setAccessCredentials(CloudCredentials cred);
	
	/**
	 * Gets the access credentials used for the specific account
	 * @return the access credentials
	 */
	public abstract CloudCredentials getAccessCredentials();
}
