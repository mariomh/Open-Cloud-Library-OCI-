package org.oci.storage.object;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Class that stores information about multipart uploads
 * @author mario_mh
 *
 */
public class Multipart extends HashMap<String, String> {

	private File fileContents = null;
	private InputStream inputStream = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -333760321626310337L;

	/**
	 * @return the fileContents
	 */
	public File getFileContents() {
		return fileContents;
	}

	/**
	 * @param fileContents the fileContents to set
	 */
	public void setFileContents(File fileContents) {
		this.fileContents = fileContents;
	}

	/**
	 * @return the inputStream
	 */
	public InputStream getInputStream() {
		return inputStream;
	}

	/**
	 * @param inputStream the inputStream to set
	 */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

}
