package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Log entry of an auth attempt to the radius server
 */

public interface RadiusConnectionLog { 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getLogin(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return null
	 */
	java.lang.String getMessage(); 

}
