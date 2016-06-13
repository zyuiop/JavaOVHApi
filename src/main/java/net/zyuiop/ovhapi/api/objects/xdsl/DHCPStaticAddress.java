package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * DHCP Static Address
 */

public interface DHCPStaticAddress { 

	/**
	 * @return ID of the ongoing todo (NULL if none)
	 */
	long getTaskId(); 

	/**
	 * @return The IP address of the device
	 */
	java.lang.String getIPAddress(); 

	/**
	 * @return The MAC address of the device
	 */
	java.lang.String getMACAddress(); 

	/**
	 * @return Name of the DHCP Static lease
	 */
	java.lang.String getName(); 

}
