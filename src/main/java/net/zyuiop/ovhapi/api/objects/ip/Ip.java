package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP
 */

public interface Ip { 

	/**
	 * @return IP block organisation Id
	 */
	java.lang.String getOrganisationId(); 

	/**
	 * @return null
	 */
	java.lang.String getCountry(); 

	/**
	 * @return Routage information
	 */
	net.zyuiop.ovhapi.api.objects.ip.RoutedTo getRoutedTo(); 

	/**
	 * @return null
	 */
	java.lang.String getIp(); 

	/**
	 * @return null
	 */
	boolean getCanBeTerminated(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return Custom description on your ip
	 */
	java.lang.String getDescription(); 

}
