package org.oci.messaging;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

public class CloudQueuePermissions {
	
	private String permissionName;
	private List<String> accounts;
	private List<String> permissions;
	private GregorianCalendar expiry;
	private TimeZone timezone;
	
	/**
	 * Handles the queue permissions
	 */
	public CloudQueuePermissions() {
		this.accounts = new LinkedList<String>();
		this.permissions = new LinkedList<String>();
	}
	
	/**
	 * @return the permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}
	
	/**
	 * @param permissionName the permissionName to set
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @return the accounts
	 */
	public List<String> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the permissions
	 */
	public List<String> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	/**
	 * @return the expiry
	 */
	public GregorianCalendar getExpiry() {
		return expiry;
	}

	/**
	 * @param expiry the expiry to set
	 */
	public void setExpiry(GregorianCalendar expiry) {
		this.expiry = expiry;
	}

	/**
	 * @return the timezone
	 */
	public TimeZone getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}

}
