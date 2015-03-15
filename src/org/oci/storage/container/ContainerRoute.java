package org.oci.storage.container;

/**
 * Presents a route for the website configuration on containers
 * @author mario_mh
 *
 */
public class ContainerRoute {
	
	private String httpErrorCodeReturnedEquals;
	private String keyPrefixEquals;
	private String hostName;
	private String httpRedirectCode;
	private String protocol;
	private String replaceKeyPrefixWith;
	private String replaceKeyWith;
	
	/**
	 * @return the keyPrefixEquals
	 */
	public String getKeyPrefixEquals() {
		return keyPrefixEquals;
	}
	
	/**
	 * @param keyPrefixEquals the keyPrefixEquals to set
	 */
	public void setKeyPrefixEquals(String keyPrefixEquals) {
		this.keyPrefixEquals = keyPrefixEquals;
	}

	/**
	 * @return the httpErrorCodeReturnedEquals
	 */
	public String getHttpErrorCodeReturnedEquals() {
		return httpErrorCodeReturnedEquals;
	}

	/**
	 * @param httpErrorCodeReturnedEquals the httpErrorCodeReturnedEquals to set
	 */
	public void setHttpErrorCodeReturnedEquals(
			String httpErrorCodeReturnedEquals) {
		this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the httpRedirectCode
	 */
	public String getHttpRedirectCode() {
		return httpRedirectCode;
	}

	/**
	 * @param httpRedirectCode the httpRedirectCode to set
	 */
	public void setHttpRedirectCode(String httpRedirectCode) {
		this.httpRedirectCode = httpRedirectCode;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @return the replaceKeyPrefixWith
	 */
	public String getReplaceKeyPrefixWith() {
		return replaceKeyPrefixWith;
	}

	/**
	 * @param replaceKeyPrefixWith the replaceKeyPrefixWith to set
	 */
	public void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
		this.replaceKeyPrefixWith = replaceKeyPrefixWith;
	}

	/**
	 * @return the replaceKeyWith
	 */
	public String getReplaceKeyWith() {
		return replaceKeyWith;
	}

	/**
	 * @param replaceKeyWith the replaceKeyWith to set
	 */
	public void setReplaceKeyWith(String replaceKeyWith) {
		this.replaceKeyWith = replaceKeyWith;
	}

}
