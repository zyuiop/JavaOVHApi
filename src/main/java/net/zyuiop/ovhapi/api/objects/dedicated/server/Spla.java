package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * SPLA licenses management
 */

public interface Spla { 

	/**
	 * @return Last update timestamp
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Status of license
	 */
	java.lang.String getStatus(); 

	/**
	 * @return License id
	 */
	long getId(); 

	/**
	 * @return License type
	 */
	java.lang.String getType(); 

	/**
	 * @return License serial number
	 */
	java.lang.String getSerialNumber(); 

}
