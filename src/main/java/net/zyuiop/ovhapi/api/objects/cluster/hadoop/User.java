package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * User allowed to access interfaces on your cluster
 */

public interface User { 

	/**
	 * @return Whether or not the User is allowed to access to the Cloudera Manager interface
	 */
	boolean getClouderaManager(); 

	/**
	 * @return Whether or not the User is allowed to access to the Hue interface
	 */
	boolean getHue(); 

	/**
	 * @return Whether or not the User is allowed to access to the WebUI interfaces
	 */
	boolean getHttpFrontend(); 

	/**
	 * @return The username of the User
	 */
	java.lang.String getUsername(); 

}
