package org.oci.exceptions;

public class OperationNotSucceededException extends RuntimeException  {
	
	private String operation;
	private String library;

	/**
	 * 
	 */
	private static final long serialVersionUID = 5125440821531322048L;

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the library
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * @param library the library to set
	 */
	public void setLibrary(String library) {
		this.library = library;
	}
	
	/**
	 * A throwable runtime exception for failed operations
	 * @param operation the operation
	 * @param library the used library
	 * @param inner the inner exception
	 */
	public OperationNotSucceededException(String operation, String library, Exception inner) {
		super(inner);
		this.operation = operation;
		this.library = library;
	}
	
	/**
	 * Gets a readable Message of why the operation failed
	 */
	public String getMessage() {
		return "The operation \"" + operation + "\" failed for " + library + ". Cause: " + getInnerCause();
	}
	
	/**
	 * Gets the inner cause of the exception
	 * @return the inner cause
	 */
	private String getInnerCause() {
		if(getCause()== null) return "";
		
		return getCause().getMessage();
	}

}
