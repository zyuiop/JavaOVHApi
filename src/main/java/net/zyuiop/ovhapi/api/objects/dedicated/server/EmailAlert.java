package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Service monitoring Email alert
 */

public interface EmailAlert { 

	/**
	 * @return Alert destination
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Alert language
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return This monitoring id
	 */
	long getAlertId(); 

	/**
	 * @return Is this monitor enabled
	 */
	boolean getEnabled(); 

}
