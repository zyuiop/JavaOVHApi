package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/cloudLinux APIs
 */

public interface CloudLinux { 

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseCloudLinux() throws java.io.IOException;



	/**
	 * Tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your CloudLinux license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * Tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your CloudLinux license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your CloudLinux license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;



}
