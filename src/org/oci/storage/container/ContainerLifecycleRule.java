package org.oci.storage.container;

import java.util.Date;
import java.util.HashMap;

/**
 * Stores information about the container lifecycle rules
 * @author mario_mh
 *
 */
public class ContainerLifecycleRule extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1910008410544252168L;
	
	private int containerExpiresInDays;
	private String id;
	private Date expirationDate;
	private int noncurrentVersionExpirationInDays;
	private String prefix;
	private String status;
	private int noncurrentVersionTransitionDays;
	private Date transitionExpirationDate;
	private int transitionExpirationInDays;
	private String noncurrentVersionTransitionStorageClass;
	private String transitionStorageClass;
	
	/**
	 * @return the containerExpiresInDays
	 */
	public int getContainerExpiresInDays() {
		return containerExpiresInDays;
	}
	
	/**
	 * @param containerExpiresInDays the containerExpiresInDays to set
	 */
	public void setContainerExpiresInDays(int containerExpiresInDays) {
		this.containerExpiresInDays = containerExpiresInDays;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the noncurrentVersionExpirationInDays
	 */
	public int getNoncurrentVersionExpirationInDays() {
		return noncurrentVersionExpirationInDays;
	}

	/**
	 * @param noncurrentVersionExpirationInDays the noncurrentVersionExpirationInDays to set
	 */
	public void setNoncurrentVersionExpirationInDays(
			int noncurrentVersionExpirationInDays) {
		this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
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

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the noncurrentVersionTransitionDays
	 */
	public int getNoncurrentVersionTransitionDays() {
		return noncurrentVersionTransitionDays;
	}

	/**
	 * @param noncurrentVersionTransitionDays the noncurrentVersionTransitionDays to set
	 */
	public void setNoncurrentVersionTransitionDays(
			int noncurrentVersionTransitionDays) {
		this.noncurrentVersionTransitionDays = noncurrentVersionTransitionDays;
	}

	/**
	 * @return the transitionExpirationDate
	 */
	public Date getTransitionExpirationDate() {
		return transitionExpirationDate;
	}

	/**
	 * @param transitionExpirationDate the transitionExpirationDate to set
	 */
	public void setTransitionExpirationDate(Date transitionExpirationDate) {
		this.transitionExpirationDate = transitionExpirationDate;
	}

	/**
	 * @return the transitionExpirationInDays
	 */
	public int getTransitionExpirationInDays() {
		return transitionExpirationInDays;
	}

	/**
	 * @param transitionExpirationInDays the transitionExpirationInDays to set
	 */
	public void setTransitionExpirationInDays(int transitionExpirationInDays) {
		this.transitionExpirationInDays = transitionExpirationInDays;
	}

	/**
	 * @return the noncurrentVersionTransitionStorageClass
	 */
	public String getNoncurrentVersionTransitionStorageClass() {
		return noncurrentVersionTransitionStorageClass;
	}

	/**
	 * @param noncurrentVersionTransitionStorageClass the noncurrentVersionTransitionStorageClass to set
	 */
	public void setNoncurrentVersionTransitionStorageClass(
			String noncurrentVersionTransitionStorageClass) {
		this.noncurrentVersionTransitionStorageClass = noncurrentVersionTransitionStorageClass;
	}

	/**
	 * @return the transitionStorageClass
	 */
	public String getTransitionStorageClass() {
		return transitionStorageClass;
	}

	/**
	 * @param transitionStorageClass the transitionStorageClass to set
	 */
	public void setTransitionStorageClass(String transitionStorageClass) {
		this.transitionStorageClass = transitionStorageClass;
	}
	
}
