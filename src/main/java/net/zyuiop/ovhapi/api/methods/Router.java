package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /router APIs
 */

public interface Router { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	net.zyuiop.ovhapi.api.objects.router.PrivateLink getServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Remove an existing Private Link from your Router service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.router.Vpn getServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param ipNet Gateway IP / CIDR Netmask
	*/
	net.zyuiop.ovhapi.api.objects.router.Network getServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException;

	/**
	 * Delete an existing route from your router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	 * @param network Network allowed to be routed outside
	*/
	net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Router offer
	 * @param id null
	*/
	void putServiceNameVpnId(net.zyuiop.ovhapi.api.objects.router.Vpn param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Tasks for this Router
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your Router offer
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks for this Router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Routes set up in a Private Link
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	java.lang.String getServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * VPN associated with this Router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	long[] getServiceNameVpn(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Private links set up on this router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String getServiceNamePrivateLink(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new Private Link to your Router service
	 * Facultative parameters ? false
	 * @param peerServiceName serviceName of the router service you want to create a private link with
	 * @param name Your memory-friendly name for this private link
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String postServiceNamePrivateLink(java.lang.String peerServiceName, java.lang.String name, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest getServiceNamePrivateLinkPeerServiceNameRequest(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Accept, reject or cancel a pending request
	 * Facultative parameters ? false
	 * @param action null
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	java.lang.String postServiceNamePrivateLinkPeerServiceNameRequestManage(java.lang.String action, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Router offer
	 * @param ipNet Gateway IP / CIDR Netmask
	*/
	void putServiceNameNetworkIpNet(net.zyuiop.ovhapi.api.objects.router.Network param0, java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Router offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a network to your router
	 * Facultative parameters ? true
	 * @param ipNet Gateway IP / CIDR Netmask, (e.g. 192.168.1.254/24)
	 * @param description null
	 * @param serviceName The internal name of your Router offer
	 * @param vlanTag Vlan tag from range 1 to 4094 or NULL for untagged traffic
	*/
	net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName, long vlanTag) throws java.io.IOException;

	/**
	 * Add a network to your router
	 * Facultative parameters ? false
	 * @param ipNet Gateway IP / CIDR Netmask, (e.g. 192.168.1.254/24)
	 * @param description null
	 * @param serviceName The internal name of your Router offer
	*/
	net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a VPN to your router
	 * Facultative parameters ? true
	 * @param psk Your PSK key
	 * @param serverPrivNet Server's private network
	 * @param clientPrivNet Client's private network
	 * @param serviceName The internal name of your Router offer
	 * @param clientIp IP you will be connecting from / NULL (allow all)
	*/
	net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName, java.lang.String clientIp) throws java.io.IOException;

	/**
	 * Add a VPN to your router
	 * Facultative parameters ? false
	 * @param psk Your PSK key
	 * @param serverPrivNet Server's private network
	 * @param clientPrivNet Client's private network
	 * @param serviceName The internal name of your Router offer
	*/
	net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new outgoing route to your router
	 * Facultative parameters ? false
	 * @param network Network to be routed outside your router (CIDR format, e.g. 10.1.0.0./16
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	net.zyuiop.ovhapi.api.objects.router.Task postServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String network, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	 * @param network Network allowed to be routed outside
	*/
	net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute getServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getRouter() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	net.zyuiop.ovhapi.api.objects.router.Router getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Networks mounted on this Router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String getServiceNameNetwork(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this network from your router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param ipNet Gateway IP / CIDR Netmask
	*/
	net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException;

	/**
	 * Delete a VPN from your router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.router.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	void putServiceNamePrivateLinkPeerServiceName(net.zyuiop.ovhapi.api.objects.router.PrivateLink param0, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;

	/**
	 * Change your VPN's PSK
	 * Facultative parameters ? false
	 * @param psk Your PSK key
	 * @param serviceName The internal name of your Router offer
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.router.Task postServiceNameVpnIdSetPsk(java.lang.String psk, java.lang.String serviceName, long id) throws java.io.IOException;

}
