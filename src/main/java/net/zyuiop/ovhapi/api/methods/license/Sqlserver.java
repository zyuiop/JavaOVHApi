package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/sqlserver APIs
 */

public interface Sqlserver { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The name of your SQL Server license
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the orderable Sql Server versions
	 * Facultative parameters ? false
	 * @param ip Your license Ip
	*/
	net.zyuiop.ovhapi.api.objects.license.SqlServerOrderConfiguration getOrderableVersions(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks linked to this license
	 * Facultative parameters ? true
	 * @param serviceName The name of your SQL Server license
	 * @param status Filter the value of status property (=)
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String action) throws java.io.IOException;

	/**
	 * Tasks linked to this license
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLicenseSqlserver() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	*/
	net.zyuiop.ovhapi.api.objects.license.sqlserver.SqlServer getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The name of your SQL Server license
	 * @param taskId This Task id
	*/
	net.zyuiop.ovhapi.api.objects.license.Task getServiceNameTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

}
