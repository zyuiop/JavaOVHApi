package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 *  ip address linked with this virtual mac address
 */

public interface VirtualMacManagement { 

	/**
	 * @return Friendly name of your Virtual Machine behind this IP/MAC
	 */
	java.lang.String getVirtualMachineName(); 

	/**
	 * @return IP address
	 */
	java.lang.String getIpAddress(); 

}
