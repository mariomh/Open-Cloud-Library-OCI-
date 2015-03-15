package org.oci.storage.container;

import java.util.LinkedList;
import java.util.List;

/**
 * Stores information about the CORS settings
 * @author mario_mh
 *
 */
public class ContainerCorsRule {
	
	private int maxAgeSeconds;
	private String id;
	private List<String> allowedHeaders;
	private List<String> allowedMethods;
	private List<String> allowedOrigins;
	private List<String> exposedHeaders;
	
	/**
	 * Stores information about the CORS settings
	 */
	public ContainerCorsRule() {
		setAllowedHeaders(new LinkedList<String>());
		setAllowedMethods(new LinkedList<String>());
		setAllowedOrigins(new LinkedList<String>());
		setExposedHeaders(new LinkedList<String>());
	}

	/**
	 * @return the maxAgeSeconds
	 */
	public int getMaxAgeSeconds() {
		return maxAgeSeconds;
	}

	/**
	 * @param maxAgeSeconds the maxAgeSeconds to set
	 */
	public void setMaxAgeSeconds(int maxAgeSeconds) {
		this.maxAgeSeconds = maxAgeSeconds;
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
	 * @return the allowedHeaders
	 */
	public List<String> getAllowedHeaders() {
		return allowedHeaders;
	}

	/**
	 * @param allowedHeaders the allowedHeaders to set
	 */
	public void setAllowedHeaders(List<String> allowedHeaders) {
		this.allowedHeaders = allowedHeaders;
	}

	/**
	 * @return the allowedMethods
	 */
	public List<String> getAllowedMethods() {
		return allowedMethods;
	}

	/**
	 * @param allowedMethods the allowedMethods to set
	 */
	public void setAllowedMethods(List<String> allowedMethods) {
		this.allowedMethods = allowedMethods;
	}

	/**
	 * @return the allowedOrigins
	 */
	public List<String> getAllowedOrigins() {
		return allowedOrigins;
	}

	/**
	 * @param allowedOrigins the allowedOrigins to set
	 */
	public void setAllowedOrigins(List<String> allowedOrigins) {
		this.allowedOrigins = allowedOrigins;
	}

	/**
	 * @return the exposedHeaders
	 */
	public List<String> getExposedHeaders() {
		return exposedHeaders;
	}

	/**
	 * @param exposedHeaders the exposedHeaders to set
	 */
	public void setExposedHeaders(List<String> exposedHeaders) {
		this.exposedHeaders = exposedHeaders;
	}

}
