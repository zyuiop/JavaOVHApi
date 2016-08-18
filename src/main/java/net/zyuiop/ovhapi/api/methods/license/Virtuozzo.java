package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/virtuozzo APIs
 */

public interface Virtuozzo { 




	/**
	 * tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your Virtuozzo license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseVirtuozzo() throws java.io.IOException;


	/**
	 * Options linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your Virtuozzo license
	 * @param label Filter the value of label property (=)
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName, java.lang.String label) throws java.io.IOException;

	/**
	 * Options linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Returns an array of ips where the license can be moved to
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String[] getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;


}
