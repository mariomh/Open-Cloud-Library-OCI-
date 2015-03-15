package org.oci;

import java.util.HashMap;

/**
 * Stores the credentials for a cloud account
 * @author mario_mh
 *
 */
public class CloudCredentials {

	private HashMap<CredentialProperty, Object> properties;
	
	/**
	 * Creates a new instance of cloud credentials
	 */
	public CloudCredentials() {
		this.properties = new HashMap<CredentialProperty, Object>();
	}
	
	/**
	 * Adds a new credential property
	 * @param prop the property to set
	 * @param value the value to add
	 */
	public void setCredentialProperty(CredentialProperty prop, Object value) {
		this.properties.put(prop, value);
	}
	
	/**
	 * Returns the credential property
	 * @param prop the property
	 * @return the credential property value
	 */
	public Object getCredentialProperty(CredentialProperty prop) {
		return this.properties.get(prop);
	}
	
	/**
	 * Returns the credential property as String
	 * @param prop the property
	 * @return the credential property value
	 */
	public String getCredentialPropertyAsString(CredentialProperty prop) {
		return getCredentialProperty(prop).toString();
	}
}
