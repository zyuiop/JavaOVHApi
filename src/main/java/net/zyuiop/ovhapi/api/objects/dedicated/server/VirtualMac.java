package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A virtual MAC address associated to one or more IPs
 */

public interface VirtualMac { 

	/**
	 * @return Virtual MAC address in 00:00:00:00:00:00 format
	 */
	java.lang.String getMacAddress(); 

	/**
	 * @return Virtual MAC address type
	 */
	java.lang.String getType(); 

}
