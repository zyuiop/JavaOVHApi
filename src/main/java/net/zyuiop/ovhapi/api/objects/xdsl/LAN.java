package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * LAN Configuration of the Modem
 */

public interface LAN { 

	/**
	 * @return The subnet mask of the LAN interface of the modem
	 */
	java.lang.String getSubnetMask(); 

	/**
	 * @return ID of the ongoing todo (NULL if none)
	 */
	long getTaskId(); 

	/**
	 * @return The IP address of the LAN interface of the modem
	 */
	java.lang.String getIPAddress(); 

	/**
	 * @return Name of the LAN
	 */
	java.lang.String getLanName(); 

	/**
	 * @return How the LAN interface of the modem is gettig its address
	 */
	java.lang.String getAddressingType(); 

}
