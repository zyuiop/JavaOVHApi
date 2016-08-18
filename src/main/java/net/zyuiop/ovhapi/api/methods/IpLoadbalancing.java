package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /ipLoadbalancing APIs
 */

public interface IpLoadbalancing { 

	/**
	 * Get all zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameProbeIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List all failover ip routed to this IPLB
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameFailover(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Backend/Servers links
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	 * @param cookie Filter the value of cookie property (like)
	*/
	long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id, java.lang.String cookie) throws java.io.IOException;

	/**
	 * Backend/Servers links
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id) throws java.io.IOException;




	/**
	 * Servers for this iplb
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param status Filter the value of status property (=)
	 * @param zone Filter the value of zone property (=)
	 * @param address Filter the value of address property (=)
	*/
	long[] getServiceNameServer(java.lang.String serviceName, java.lang.String status, java.lang.String zone, java.lang.String address) throws java.io.IOException;

	/**
	 * Servers for this iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getServiceNameServer(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * List of servers you can attach to your iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.Ip[] getServiceNameAllowedServers(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	void deleteServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Task for this iplb
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param action Filter the value of action property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String action) throws java.io.IOException;

	/**
	 * Task for this iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Frontends for this iplb
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param zone Filter the value of zone property (=)
	 * @param defaultBackendId Filter the value of defaultBackendId property (=)
	 * @param port Filter the value of port property (like)
	*/
	long[] getServiceNameFrontend(java.lang.String serviceName, java.lang.String zone, long defaultBackendId, java.lang.String port) throws java.io.IOException;

	/**
	 * Frontends for this iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getServiceNameFrontend(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Ip subnet used by OVH to nat requests on your IPLB to your backends. You must ensure that your backends are not part of a network that overlap with this one
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameNatIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getIpLoadbalancing() throws java.io.IOException;



	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Serverfarms for this iplb
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param zone Filter the value of zone property (=)
	*/
	long[] getServiceNameBackend(java.lang.String serviceName, java.lang.String zone) throws java.io.IOException;

	/**
	 * Serverfarms for this iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getServiceNameBackend(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * List of zone available for an IP load balancing
	 * Facultative parameters ? false
	*/
	java.lang.String[] getAvailableZones() throws java.io.IOException;


	/**
	 * List of available zones for your server to attach to your iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameAvailableServerZones(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Delete a frontend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your frontend
	*/
	void deleteServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Ssl for this iplb
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your IP load balancing
	 * @param serial Filter the value of serial property (like)
	 * @param type Filter the value of type property (=)
	*/
	long[] getServiceNameSsl(java.lang.String serviceName, java.lang.String serial, java.lang.String type) throws java.io.IOException;

	/**
	 * Ssl for this iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a server from a backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	 * @param linkId Id of your backend/server link
	*/
	void deleteServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException;

	/**
	 * Delete a ssl
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your ssl
	*/
	void deleteServiceNameSslId(java.lang.String serviceName, long id) throws java.io.IOException;



	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Delete a server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your server
	*/
	void deleteServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException;

}
