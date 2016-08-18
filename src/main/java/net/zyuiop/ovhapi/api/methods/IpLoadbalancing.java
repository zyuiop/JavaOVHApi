package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /ipLoadbalancing APIs
 */

public interface IpLoadbalancing { 

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your server
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer getServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Ip getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	void putServiceNameBackendId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend param0, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * @param id Id of your backend
	 * @param linkId Id of your backend/server link
	*/
	void putServiceNameBackendIdServerLinkId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server param0, java.lang.String serviceName, long id, long linkId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend getServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of the task
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get all zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameProbeIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of servers you can attach to your iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.Ip[] getServiceNameAllowedServers(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your server
	*/
	void deleteServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a frontend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your frontend
	*/
	void deleteServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Add a server to a backend
	 * Facultative parameters ? true
	 * @param serverId Id of your server
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	 * @param ssl SSL ciphering. Probes will also be sent ciphered
	 * @param cookie Set the cookie value used when 'cookie' stickiness is set in backend
	 * @param proxyProtocolVersion Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 * @param chain Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 * @param weight Set weight on that server [1..256]. 1 if null
	 * @param backup Set server as backup
	 * @param probe Enable/disable probe
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server postServiceNameBackendIdServer(long serverId, java.lang.String serviceName, long id, boolean ssl, java.lang.String cookie, java.lang.String proxyProtocolVersion, java.lang.String chain, long weight, boolean backup, boolean probe) throws java.io.IOException;

	/**
	 * Add a server to a backend
	 * Facultative parameters ? false
	 * @param serverId Id of your server
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server postServiceNameBackendIdServer(long serverId, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your ssl
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl getServiceNameSslId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your server
	*/
	void putServiceNameServerId(net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your frontend
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend getServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getIpLoadbalancing() throws java.io.IOException;

	/**
	 * List all failover ip routed to this IPLB
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameFailover(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Apply the configuration to your iplb
	 * Facultative parameters ? false
	 * @param zone The zone(s) of your iplb
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Task postServiceNameRefresh(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	*/
	void deleteServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List of available zones for your server to attach to your iplb
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameAvailableServerZones(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your frontend
	*/
	void putServiceNameFrontendId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend param0, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Add a new frontend on your iplb
	 * Facultative parameters ? true
	 * @param zone Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param port Port(s) attached to your frontend. A numerical port, a dash-delimited ports range or comma-delimited ports
	 * @param serviceName The internal name of your IP load balancing
	 * @param redirectLocation HTTP redirection (Ex : http://www.ovh.com)
	 * @param ssl SSL deciphering
	 * @param defaultBackendId Default Backend of your frontend
	 * @param hsts HTTP Strict Transport Security
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend postServiceNameFrontend(java.lang.String zone, java.lang.String port, java.lang.String serviceName, java.lang.String redirectLocation, boolean ssl, long defaultBackendId, boolean hsts) throws java.io.IOException;

	/**
	 * Add a new frontend on your iplb
	 * Facultative parameters ? false
	 * @param zone Zone of your frontend. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	 * @param port Port(s) attached to your frontend. A numerical port, a dash-delimited ports range or comma-delimited ports
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend postServiceNameFrontend(java.lang.String zone, java.lang.String port, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new server on your iplb
	 * Facultative parameters ? false
	 * @param status Status of your server
	 * @param address Address of your server
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer postServiceNameServer(java.lang.String status, java.lang.String address, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a server from a backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	 * @param linkId Id of your backend/server link
	*/
	void deleteServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException;

	/**
	 * Ip subnet used by OVH to nat requests on your IPLB to your backends. You must ensure that your backends are not part of a network that overlap with this one
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getServiceNameNatIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of zone available for an IP load balancing
	 * Facultative parameters ? false
	*/
	java.lang.String[] getAvailableZones() throws java.io.IOException;

	/**
	 * Add a new ssl on your iplb
	 * Facultative parameters ? true
	 * @param certificate Certificate
	 * @param key Certificate key
	 * @param serviceName The internal name of your IP load balancing
	 * @param chain Certificate chain
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException;

	/**
	 * Add a new ssl on your iplb
	 * Facultative parameters ? false
	 * @param certificate Certificate
	 * @param key Certificate key
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new backend on your iplb
	 * Facultative parameters ? true
	 * @param zone Zone of your backend. You can check what zone are available on this API section : /ipLoadbalancing/{serviceName}/availableServerZones
	 * @param type Type of your backend
	 * @param serviceName The internal name of your IP load balancing
	 * @param balance Load balancing algorithm. 'roundrobin' if null
	 * @param probe Probe type. 'tcp' if null
	 * @param port Port attached to your backend [1..65000]. Inherited from frontend if null
	 * @param stickiness Stickiness type. No stickyness if null
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend postServiceNameBackend(java.lang.String zone, java.lang.String type, java.lang.String serviceName, java.lang.String balance, java.lang.String probe, long port, java.lang.String stickiness) throws java.io.IOException;

	/**
	 * Add a new backend on your iplb
	 * Facultative parameters ? false
	 * @param zone Zone of your backend. You can check what zone are available on this API section : /ipLoadbalancing/{serviceName}/availableServerZones
	 * @param type Type of your backend
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend postServiceNameBackend(java.lang.String zone, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param id Id of your backend
	 * @param linkId Id of your backend/server link
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server getServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException;

	/**
	 * Get the value for the given zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param zone Desired zone. You can check what zone are available on this API section : /ipLoadbalancing/availableZones
	*/
	net.zyuiop.ovhapi.api.objects.iploadbalancing.ip.ProbeIp getServiceNameProbeIpZone(java.lang.String serviceName, java.lang.String zone) throws java.io.IOException;

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

}
