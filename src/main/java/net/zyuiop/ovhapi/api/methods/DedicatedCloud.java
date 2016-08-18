package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /dedicatedCloud APIs
 */

public interface DedicatedCloud { 









	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedCloud() throws java.io.IOException;


	/**
	 * Hosts associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdHost(java.lang.String serviceName, long datacenterId) throws java.io.IOException;



	/**
	 * Get the name of the commercial ranges compliant with your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameCommercialRangeCompliance(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Filers associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdFiler(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Dedicated Cloud vlans
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameVlan(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of commercial Ranges available in a Dedicated Cloud
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCommercialRange() throws java.io.IOException;

	/**
	 * Get the countries you can select in /order/dedicatedCloud/{serviceName}/ip
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameOrderableIpCountries(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Datacenters associated with this Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * This Dedicated Cloud vrack
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException;









	/**
	 * Tasks associated with this Dedicated Cloud
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Networks allowed to access to this Dedicated Cloud management interface
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameAllowedNetwork(java.lang.String serviceName) throws java.io.IOException;












	/**
	 * User rights in a given Datacenters
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	long[] getServiceNameUserUserIdRight(java.lang.String serviceName, long userId) throws java.io.IOException;






	/**
	 * Tasks associated with this User
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this User
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId) throws java.io.IOException;


	/**
	 * Filers mounted on all Datacenters of your Dedicated Cloud Vsphere
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameFiler(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Get the name of the commercial ranges orderable in your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameCommercialRangeOrderable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks associated with this Datacenter
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId) throws java.io.IOException;













	/**
	 * Dedicated Cloud users
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param name Filter the value of name property (like)
	*/
	long[] getServiceNameUser(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Dedicated Cloud users
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;


}
