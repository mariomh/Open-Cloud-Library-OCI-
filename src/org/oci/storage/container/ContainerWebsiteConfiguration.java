package org.oci.storage.container;

import java.util.LinkedList;
import java.util.List;

/**
 * Provides a website configuration for the container
 * @author mario_mh
 *
 */
public class ContainerWebsiteConfiguration {
	
	private boolean redirect;
	private String hostName;
	private String httpRedirectCode;
	private String protocol;
	private String replaceKeyPrefixWith;
	private String replaceKeyWith;
	private String errorDocument;
	private String indexDocumentSuffix;
	private List<ContainerRoute> routingRules;
	
	/**
	 * Provides a Website configuration for the container
	 */
	public ContainerWebsiteConfiguration() {
		routingRules = new LinkedList<ContainerRoute>();
	}

	/**
	 * @return the redirect
	 */
	public boolean isRedirect() {
		return redirect;
	}

	/**
	 * @param redirect the redirect to set
	 */
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
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

	/**
	 * @return the errorDocument
	 */
	public String getErrorDocument() {
		return errorDocument;
	}

	/**
	 * @param errorDocument the errorDocument to set
	 */
	public void setErrorDocument(String errorDocument) {
		this.errorDocument = errorDocument;
	}

	/**
	 * @return the indexDocumentSuffix
	 */
	public String getIndexDocumentSuffix() {
		return indexDocumentSuffix;
	}

	/**
	 * @param indexDocumentSuffix the indexDocumentSuffix to set
	 */
	public void setIndexDocumentSuffix(String indexDocumentSuffix) {
		this.indexDocumentSuffix = indexDocumentSuffix;
	}

	/**
	 * @return the routingRules
	 */
	public List<ContainerRoute> getRoutingRules() {
		return routingRules;
	}

	/**
	 * @param routingRules the routingRules to set
	 */
	public void setRoutingRules(List<ContainerRoute> routingRules) {
		this.routingRules = routingRules;
	}

}
