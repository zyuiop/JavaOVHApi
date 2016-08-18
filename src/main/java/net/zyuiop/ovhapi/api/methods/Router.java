package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /router APIs
 */

public interface Router { 



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
	 * VPN associated with this Router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	long[] getServiceNameVpn(java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Routes set up in a Private Link
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	java.lang.String[] getServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;




	/**
	 * Private links set up on this router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String[] getServiceNamePrivateLink(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Accept, reject or cancel a pending request
	 * Facultative parameters ? false
	 * @param action null
	 * @param serviceName The internal name of your Router offer
	 * @param peerServiceName Service name of the other side of this link
	*/
	java.lang.String postServiceNamePrivateLinkPeerServiceNameRequestManage(java.lang.String action, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getRouter() throws java.io.IOException;







	/**
	 * Networks mounted on this Router
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String[] getServiceNameNetwork(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Add a new Private Link to your Router service
	 * Facultative parameters ? false
	 * @param peerServiceName serviceName of the router service you want to create a private link with
	 * @param name Your memory-friendly name for this private link
	 * @param serviceName The internal name of your Router offer
	*/
	java.lang.String postServiceNamePrivateLink(java.lang.String peerServiceName, java.lang.String name, java.lang.String serviceName) throws java.io.IOException;


}
