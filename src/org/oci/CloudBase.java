package org.oci;

/**
 * Abstract base class for Cloud objects
 * @author mario_mh
 *
 */
public abstract class CloudBase {

	private CloudCredentials cred = null;
	
	/**
	 * Abstract base class for Cloud objects
	 * @param credentials
	 */
	public CloudBase(CloudCredentials credentials) {
		setCredentials(credentials);
	}

	/**
	 * @return the credentials
	 */
	public CloudCredentials getCredentials() {
		return cred;
	}

	/**
	 * @param cred the credentials to set
	 */
	public void setCredentials(CloudCredentials cred) {
		this.cred = cred;
	}
	
}
