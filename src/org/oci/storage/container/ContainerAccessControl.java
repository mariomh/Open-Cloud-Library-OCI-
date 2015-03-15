package org.oci.storage.container;

import java.util.LinkedList;
import java.util.List;

/**
 * Stores Access Control Informations on the account
 * @author mario_mh
 *
 */
public class ContainerAccessControl {
	
	private ContainerOwner owner;
	private List<ContainerGrant> grants;
	private String publicAccess;
	
	/**
	 * Stores Access Control Informations on the account
	 */
	public ContainerAccessControl() {
		grants = new LinkedList<ContainerGrant>();
	}

	/**
	 * @return the owner
	 */
	public ContainerOwner getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(ContainerOwner owner) {
		this.owner = owner;
	}

	/**
	 * @return the grants
	 */
	public List<ContainerGrant> getGrants() {
		return grants;
	}

	/**
	 * @param grants the grants to set
	 */
	public void setGrants(List<ContainerGrant> grants) {
		this.grants = grants;
	}

	/**
	 * @return the publicAccess
	 */
	public String getPublicAccess() {
		return publicAccess;
	}

	/**
	 * @param publicAccess the publicAccess to set
	 */
	public void setPublicAccess(String publicAccess) {
		this.publicAccess = publicAccess;
	}

}
