package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/windows APIs
 */

public interface Windows { 

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseWindows() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	 * @param label This option designation
	*/
	net.zyuiop.ovhapi.api.objects.license.Option getServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	net.zyuiop.ovhapi.api.objects.license.windows.Windows getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * release this Option
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	 * @param label This option designation
	*/
	net.zyuiop.ovhapi.api.objects.license.Task deleteServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException;

	/**
	 * Link your own sql server license to this Windows license
	 * Facultative parameters ? false
	 * @param licenseId Your license serial number
	 * @param version Your license version
	 * @param serviceName The name of your Windows license
	*/
	net.zyuiop.ovhapi.api.objects.license.Task postServiceNameSqlServer(java.lang.String licenseId, java.lang.String version, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your Windows license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the orderable Windows versions
	 * Facultative parameters ? false
	 * @param ip Your license Ip
	*/
	net.zyuiop.ovhapi.api.objects.license.WindowsOrderConfiguration getOrderableVersions(java.lang.String ip) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your Windows license
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	 * @param taskId This Task id
	*/
	net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your Windows license
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.license.windows.Windows param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * options attached to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your Windows license
	*/
	java.lang.String getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;

}
