package net.zyuiop.ovhapi.api.methods.hosting;

/**
 * A class to interact with OVH's /hosting/windows APIs
 */

public interface Windows { 

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHostingWindows() throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.windows.Service getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

}
