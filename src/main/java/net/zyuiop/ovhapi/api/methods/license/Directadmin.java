package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/directadmin APIs
 */

public interface Directadmin { 


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseDirectadmin() throws java.io.IOException;






	/**
	 * Returns an array of ips where the license can be moved to
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	*/
	java.lang.String[] getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your DirectAdmin license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;



}
