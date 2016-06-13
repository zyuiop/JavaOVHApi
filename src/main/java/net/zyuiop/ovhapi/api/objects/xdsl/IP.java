package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Informations about an IP address
 */

public interface IP { 

	/**
	 * @return The IP address
	 */
	java.lang.String getIp(); 

	/**
	 * @return null
	 */
	java.lang.String getVersion(); 

	/**
	 * @return status of the IP
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getRange(); 

	/**
	 * @return null
	 */
	java.lang.String getDnsList(); 

}
