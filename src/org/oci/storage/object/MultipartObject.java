package org.oci.storage.object;

import java.util.List;

/**
 * Provides methods to handle multipart uploads
 * @author mario_mh
 *
 */
public abstract class MultipartObject {
	
	/**
	 * Uploads a part
	 * @param part the part to upload
	 */
	public abstract void uploadPart(Multipart part);
	
	/**
	 * Copies an existing multi part
	 * @param part the part to copy
	 */
	public abstract void copyPart(Multipart part);
	
	/**
	 * Aborts a multi part upload
	 */
	public abstract void abortMutlitpartUpload();
	
	/**
	 * Completes a multi part upload
	 */
	public abstract void completeMultipartUpload();
	
	/**
	 * Lists all existing parts 
	 * @return the parts
	 */
	public abstract List<Multipart> listParts();

}
