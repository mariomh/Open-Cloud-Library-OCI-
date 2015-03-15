package org.oci.exceptions;

/**
 * Unchecked exception for operations that are not supported on a specific account
 * @author mario_mh
 *
 */
public class NotSupportedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String operation = "";
	private String library = "";
	
	/**
	 * Creates a new Throwable exception
	 * @param operation the unsupported exception
	 * @param library the library used for it
	 */
	public NotSupportedException(String operation, String library) {
		this.operation = operation;
		this.library = library;
	}
	
	/**
	 * Returns a string presentation of the exception
	 */
	public String getMessage() {
		return "The operation \"" + operation + "\" is not supported for " + library;
	}

}
