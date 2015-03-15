package org.oci.storage;

import java.util.Date;

/**
 * Stores general blob service statistics
 * @author mario_mh
 *
 */
public class BlobServiceStatistics {
	
	private Date lastSyncTime;
	private String geoReplicationStatus;
	
	/**
	 * @return the lastSyncTime
	 */
	public Date getLastSyncTime() {
		return lastSyncTime;
	}
	
	/**
	 * @param lastSyncTime the lastSyncTime to set
	 */
	public void setLastSyncTime(Date lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	/**
	 * @return the geoReplicationStatus
	 */
	public String getGeoReplicationStatus() {
		return geoReplicationStatus;
	}

	/**
	 * @param geoReplicationStatus the geoReplicationStatus to set
	 */
	public void setGeoReplicationStatus(String geoReplicationStatus) {
		this.geoReplicationStatus = geoReplicationStatus;
	}

}
