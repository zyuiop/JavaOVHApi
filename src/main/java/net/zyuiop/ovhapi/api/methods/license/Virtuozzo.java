package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/virtuozzo APIs
 */

public interface Virtuozzo { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	 * @param label This option designation
	*/
	net.zyuiop.ovhapi.api.objects.license.Option getServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the orderable Virtuozzo versions
	 * Facultative parameters ? false
	 * @param ip Your license Ip
	*/
	net.zyuiop.ovhapi.api.objects.license.VirtuozzoOrderConfiguration[] getOrderableVersions(java.lang.String ip) throws java.io.IOException;

	/**
	 * Move this license to another Ip
	 * Facultative parameters ? false
	 * @param destinationIp The Ip on which you want to move this license
	 * @param serviceName The name of your Virtuozzo license
	*/
	net.zyuiop.ovhapi.api.objects.license.Task postServiceNameChangeIp(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * release this Option
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	 * @param label This option designation
	*/
	net.zyuiop.ovhapi.api.objects.license.Task deleteServiceNameOptionLabel(java.lang.String serviceName, java.lang.String label) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your Virtuozzo license
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Will tell if the ip can accept the license
	 * Facultative parameters ? false
	 * @param destinationIp The Ip on which you want to move this license
	 * @param serviceName The name of your Virtuozzo license
	*/
	net.zyuiop.ovhapi.api.objects.license.ChangeIpStatus getServiceNameCanLicenseBeMovedTo(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	net.zyuiop.ovhapi.api.objects.license.virtuozzo.Virtuozzo getServiceName(java.lang.String serviceName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	 * @param taskId This Task id
	*/
	net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your Virtuozzo license
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.license.virtuozzo.Virtuozzo param0, java.lang.String serviceName) throws java.io.IOException;

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
	 * Returns an array of ips where the license can be moved to
	 * Facultative parameters ? false
	 * @param serviceName The name of your Virtuozzo license
	*/
	java.lang.String[] getServiceNameAllowedDestinationIp(java.lang.String serviceName) throws java.io.IOException;

}
