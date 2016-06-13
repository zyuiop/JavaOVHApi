package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server IPMI interface
 */

public interface Ipmi { 

	/**
	 * @return true, if IPMI is ivailable on this server
	 */
	boolean getActivated(); 

}
