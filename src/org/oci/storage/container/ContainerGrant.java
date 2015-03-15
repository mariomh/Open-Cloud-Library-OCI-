package org.oci.storage.container;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Stores informations about a grant
 * @author mario_mh
 *
 */
public class ContainerGrant extends HashMap<String, String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4549049541630782839L;
	
	private String granteeIdentifier;
	private String granteeTypeIdentifier;
	private ContainerGranteeType granteeType;
	private String grantName;
	private List<String> grants;
	
	/**
	 * Stores informations about a grant
	 */
	public ContainerGrant() {
		grants = new LinkedList<String>();
	}
	
	/**
	 * @return the granteeIdentifier
	 */
	public String getGranteeIdentifier() {
		return granteeIdentifier;
	}
	
	/**
	 * @param granteeIdentifier the granteeIdentifier to set
	 */
	public void setGranteeIdentifier(String granteeIdentifier) {
		this.granteeIdentifier = granteeIdentifier;
	}

	/**
	 * @return the granteeTypeIdentifier
	 */
	public String getGranteeTypeIdentifier() {
		return granteeTypeIdentifier;
	}

	/**
	 * @param granteeTypeIdentifier the granteeTypeIdentifier to set
	 */
	public void setGranteeTypeIdentifier(String granteeTypeIdentifier) {
		this.granteeTypeIdentifier = granteeTypeIdentifier;
	}

	/**
	 * @return the grantName
	 */
	public String getGrantName() {
		return grantName;
	}

	/**
	 * @param grantName the grantName to set
	 */
	public void setGrantName(String grantName) {
		this.grantName = grantName;
	}

	/**
	 * @return the granteeType
	 */
	public ContainerGranteeType getGranteeType() {
		return granteeType;
	}

	/**
	 * @param granteeType the granteeType to set
	 */
	public void setGranteeType(ContainerGranteeType granteeType) {
		this.granteeType = granteeType;
	}

	/**
	 * @return the grants
	 */
	public List<String> getGrants() {
		return grants;
	}

	/**
	 * @param grants the grants to set
	 */
	public void setGrants(List<String> grants) {
		this.grants = grants;
	}

}
