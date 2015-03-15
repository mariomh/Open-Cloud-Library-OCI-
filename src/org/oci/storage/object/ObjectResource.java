package org.oci.storage.object;

import java.io.File;
import java.io.InputStream;

/**
 * Contains all necessary informations about an object (e.g the stream)
 * @author mario_mh
 *
 */
public class ObjectResource {
	
	private File fileResource = null;
	private InputStream streamResource = null;
	private long contentLength = -1L;
	private String contentType;
	private String objectName;
	private boolean allowFromAllAuthenticatedUsers;
	
	/**
	 * @return the fileResource
	 */
	public File getFileResource() {
		return fileResource;
	}
	
	/**
	 * @param fileResource the fileResource to set
	 */
	public void setFileResource(File fileResource) {
		this.fileResource = fileResource;
	}

	/**
	 * @return the streamResource
	 */
	public InputStream getStreamResource() {
		return streamResource;
	}

	/**
	 * @param streamResource the streamResource to set
	 */
	public void setStreamResource(InputStream streamResource) {
		this.streamResource = streamResource;
	}

	/**
	 * @return the contentLength
	 */
	public long getContentLength() {
		return contentLength;
	}

	/**
	 * @param contentLength the contentLength to set
	 */
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @param objectName the objectName to set
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * @return the allowFromAllAuthenticatedUsers
	 */
	public boolean isAllowFromAllAuthenticatedUsers() {
		return allowFromAllAuthenticatedUsers;
	}

	/**
	 * @param allowFromAllAuthenticatedUsers the allowFromAllAuthenticatedUsers to set
	 */
	public void setAllowFromAllAuthenticatedUsers(
			boolean allowFromAllAuthenticatedUsers) {
		this.allowFromAllAuthenticatedUsers = allowFromAllAuthenticatedUsers;
	}

}
