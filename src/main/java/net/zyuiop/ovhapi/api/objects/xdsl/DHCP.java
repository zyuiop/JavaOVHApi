package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * DHCP Configuration of the Modem
 */

public interface DHCP { 

	/**
	 * @return The subnet mask given to the clients
	 */
	java.lang.String getSubnetMask(); 

	/**
	 * @return State of the DHCP server of the modem
	 */
	boolean getServerEnabled(); 

	/**
	 * @return ID of the ongoing todo (NULL if none)
	 */
	long getTaskId(); 

	/**
	 * @return Lease time in seconds of client assigned address (-1 means infinite)
	 */
	long getLeaseTime(); 

	/**
	 * @return Secondary DNS servers to be given to the clients
	 */
	java.lang.String getSecondaryDNS(); 

	/**
	 * @return Last address of the pool assigned by the DHCP
	 */
	java.lang.String getEndAddress(); 

	/**
	 * @return Name of the DHCP
	 */
	java.lang.String getDhcpName(); 

	/**
	 * @return Primary DNS servers to be given to the clients
	 */
	java.lang.String getPrimaryDNS(); 

	/**
	 * @return First address of the pool assigned by the DHCP
	 */
	java.lang.String getStartAddress(); 

	/**
	 * @return The default gateway to be given to the clients
	 */
	java.lang.String getDefaultGateway(); 

	/**
	 * @return Domain name provided to the clients
	 */
	java.lang.String getDomainName(); 

}
