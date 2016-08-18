package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/directadmin APIs
 */

public interface Directadmin { 

	/**
	 * Get the orderable DirectAdmin versions
	 * Facultative parameters ? false
	 * @param ip Your license Ip
	*/
	net.zyuiop.ovhapi.api.objects.license.DirectAdminOrderConfiguration[] getOrderableVersions(java.lang.String ip) throws java.io.IOException;

	/**
	 * Change the Operating System for a license
	 * Facultative parameters ? false
	 * @param os The operating system you want for this license
	 * @param serviceName The name of your DirectAdmin license
	*/
	net.zyuiop.ovhapi.api.objects.license.Task postServiceNameChangeOs(java.lang.String os, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	 * @param taskId This Task id
	*/
	net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseDirectadmin() throws java.io.IOException;

	/**
	 * Will tell if the ip can accept the license
	 * Facultative parameters ? false
	 * @param destinationIp The Ip on which you want to move this license
	 * @param serviceName The name of your DirectAdmin license
	*/
	net.zyuiop.ovhapi.api.objects.license.ChangeIpStatus getServiceNameCanLicenseBeMovedTo(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your DirectAdmin license
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your DirectAdmin license
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.license.directadmin.DirectAdmin param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Move this license to another Ip
	 * Facultative parameters ? false
	 * @param destinationIp The Ip on which you want to move this license
	 * @param serviceName The name of your DirectAdmin license
	*/
	net.zyuiop.ovhapi.api.objects.license.Task postServiceNameChangeIp(java.lang.String destinationIp, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your DirectAdmin license
	*/
	net.zyuiop.ovhapi.api.objects.license.directadmin.DirectAdmin getServiceName(java.lang.String serviceName) throws java.io.IOException;

}
