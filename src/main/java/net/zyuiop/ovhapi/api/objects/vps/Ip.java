package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Information about an IP address for a VPS Virtual Machine
 */

public interface Ip { 

	/**
	 * @return null
	 */
	java.lang.String getMacAddress(); 

	/**
	 * @return null
	 */
	java.lang.String getVersion(); 

	/**
	 * @return The effective ip address of the Ip object
	 */
	java.lang.String getIpAddress(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	java.lang.String getGeolocation(); 

	/**
	 * @return null
	 */
	java.lang.String getReverse(); 

}
