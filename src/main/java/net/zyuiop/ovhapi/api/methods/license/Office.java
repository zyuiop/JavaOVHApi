package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/office APIs
 */

public interface Office { 








	/**
	 * Accounts associated to this office tenant
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseOffice() throws java.io.IOException;

	/**
	 * Domain associated to this office tenant
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	java.lang.String[] getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException;



}
