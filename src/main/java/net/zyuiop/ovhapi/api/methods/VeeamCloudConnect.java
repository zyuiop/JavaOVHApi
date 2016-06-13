package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /veeamCloudConnect APIs
 */

public interface VeeamCloudConnect { 



	/**
	 * Tasks associated with Cloud Tenant
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param name Filter the value of name property (like)
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String name, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with Cloud Tenant
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Veeam Backup Repository linked to this Veeam Cloud Connect account
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String getServiceNameBackupRepository(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List the possible upgrades on your Veeam Cloud Connect account
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String getServiceNameOrderableUpgrade(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getVeeamCloudConnect() throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;


}
