package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Firewall attached to this server
 */

public interface Firewall { 

	/**
	 * @return null
	 */
	java.lang.String getFirewall(); 

	/**
	 * @return transparent mode : device is invisible on the network; routed mode : the security appliance is considered to be a router hop in the network
	 */
	java.lang.String getMode(); 

	/**
	 * @return Firewall management IP
	 */
	java.lang.String getIp(); 

	/**
	 * @return Firewall model
	 */
	java.lang.String getModel(); 

	/**
	 * @return null
	 */
	boolean getEnabled(); 

}
