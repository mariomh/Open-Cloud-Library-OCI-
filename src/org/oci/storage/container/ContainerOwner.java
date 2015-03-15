package org.oci.storage.container;

/**
 * Stores information on ACL owners
 * @author mario_mh
 *
 */
public class ContainerOwner {
	
	private String ownerName;
	private String id;
	
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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

}
