package org.oci.storage.container;

/**
 * Stores information on container version settings
 * @author mario_mh
 *
 */
public class ContainerVersioningSettings {
	
	private String status;
	private boolean mfaDeleteEnabled;
	
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
	 * @return the mfaDeleteEnabled
	 */
	public boolean isMfaDeleteEnabled() {
		return mfaDeleteEnabled;
	}

	/**
	 * @param mfaDeleteEnabled the mfaDeleteEnabled to set
	 */
	public void setMfaDeleteEnabled(boolean mfaDeleteEnabled) {
		this.mfaDeleteEnabled = mfaDeleteEnabled;
	}

}
