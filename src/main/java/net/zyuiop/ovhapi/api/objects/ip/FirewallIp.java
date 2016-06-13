package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP on firewall
 */

public interface FirewallIp { 

	/**
	 * @return null
	 */
	java.lang.String getIpOnFirewall(); 

	/**
	 * @return null
	 */
	boolean getEnabled(); 

	/**
	 * @return Current state of your ip on firewall
	 */
	java.lang.String getState(); 

}
