package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Connected Device
 */

public interface ConnectedDevice { 

	/**
	 * @return How did the device got its IP address
	 */
	java.lang.String getAddressSource(); 

	/**
	 * @return The date time of the last update of thoses informations
	 */
	java.util.Date getInformationDate(); 

	/**
	 * @return MAC address of the device
	 */
	java.lang.String getMacAddress(); 

	/**
	 * @return The IP address of the device
	 */
	java.lang.String getIpAddress(); 

	/**
	 * @return The state of this device on the modem
	 */
	boolean getActive(); 

	/**
	 * @return Host name given by the device to the modem
	 */
	java.lang.String getHostName(); 

	/**
	 * @return The remaining time in seconds of the DHCP lease of this device (-1 means infinite)
	 */
	long getLeaseTimeRemaining(); 

	/**
	 * @return On which interface is connected the device
	 */
	java.lang.String getInterfaceType(); 

}
