package org.oci;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.oci.exceptions.OperationNotSucceededException;

/**
 * This creates a new instance of the specified cloud library
 * @author mario_mh
 *
 */
public class CloudFactory {
	
	/**
	 * Creates the cloud library with the specified cloud credentials
	 * @param kind the type of cloud library
	 * @param credentials the account key
	 * @return the library
	 */
	public static CloudLibrary create(CloudPlatform kind, CloudCredentials credentials) {
		return create(kind.name(), credentials);
	}
	
	/**
	 * Creates the cloud library with the specified cloud credentials
	 * @param kind the type of cloud library
	 * @param credentials the account key
	 * @return the library
	 */
	private static CloudLibrary create(String kind, CloudCredentials credentials) {	
		
		CloudLibrary lib = null;
		String className = "";
		
		if(kind.equals(CloudPlatform.AmazonWebServices.name())) {
			className = "org.oci.aws.AWSCloudService";
		}
		else if(kind.equals(CloudPlatform.MicrosoftAzure.name())) {
			className = "org.oci.wa.AzureCloudService";
		}
		else if(kind.equals(CloudPlatform.GoogleAppEngine.name()))
			className = "org.oci.gae.GoogleCloudService";
		else if(kind.equals(CloudPlatform.IBMBluemix.name())) {
			className = "org.oci.ibm.IbmCloudService";
		}
		else {
			throw new IllegalArgumentException("The provided cloud library kind is invalid");
		}
		
		try {
			Constructor<?> con = Class.forName(className).getConstructor(CloudCredentials.class);
			lib = (CloudLibrary)con.newInstance(credentials);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			throw new OperationNotSucceededException("create", "none", e);
		}
		
		return lib;
	}
}
