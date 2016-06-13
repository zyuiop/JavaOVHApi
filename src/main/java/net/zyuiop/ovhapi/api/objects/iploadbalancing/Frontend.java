package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Frontend
 */

public interface Frontend { 

	/**
	 * @return Zone of you frontend
	 */
	java.lang.String getZone(); 

	/**
	 * @return SSL deciphering
	 */
	boolean getSsl(); 

	/**
	 * @return Frontend name
	 */
	java.lang.String getName(); 

	/**
	 * @return Port(s) attached to your frontend
	 */
	java.lang.String getPort(); 

	/**
	 * @return HTTP Strict Transport Security
	 */
	boolean getHsts(); 

	/**
	 * @return HTTP redirection (Ex : http://www.ovh.com)
	 */
	java.lang.String getRedirectLocation(); 

	/**
	 * @return Default Backend of your frontend
	 */
	long getDefaultBackendId(); 

	/**
	 * @return Type of your frontend
	 */
	java.lang.String getType(); 

	/**
	 * @return Id of your frontend
	 */
	long getId(); 

}
