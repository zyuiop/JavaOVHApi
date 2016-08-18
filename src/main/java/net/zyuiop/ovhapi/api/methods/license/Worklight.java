package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/worklight APIs
 */

public interface Worklight { 



	/**
	 * Tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your WorkLight license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * Tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your WorkLight license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your WorkLight license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseWorklight() throws java.io.IOException;

	/**
	 * Returns an array of ips where the license can be moved to
	 * Facultative parameters ? false
	 * @param serviceName The name of your WorkLight license
	*/
	java.lang.String[] getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException;


}
