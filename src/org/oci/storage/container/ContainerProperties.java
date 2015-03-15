package org.oci.storage.container;

import java.util.Date;

/**
 * Stores information on container properties
 * @author mario_mh
 *
 */
public class ContainerProperties {
	
	private String region;
	private String etag;
	private Date lastModified;
	private String leaseDuration;
	private String leaseState;
	private String leaseStatus;

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the etag
	 */
	public String getEtag() {
		return etag;
	}

	/**
	 * @param etag the etag to set
	 */
	public void setEtag(String etag) {
		this.etag = etag;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the leaseDuration
	 */
	public String getLeaseDuration() {
		return leaseDuration;
	}

	/**
	 * @param leaseDuration the leaseDuration to set
	 */
	public void setLeaseDuration(String leaseDuration) {
		this.leaseDuration = leaseDuration;
	}

	/**
	 * @return the leaseState
	 */
	public String getLeaseState() {
		return leaseState;
	}

	/**
	 * @param leaseState the leaseState to set
	 */
	public void setLeaseState(String leaseState) {
		this.leaseState = leaseState;
	}

	/**
	 * @return the leaseStatus
	 */
	public String getLeaseStatus() {
		return leaseStatus;
	}

	/**
	 * @param leaseStatus the leaseStatus to set
	 */
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}
