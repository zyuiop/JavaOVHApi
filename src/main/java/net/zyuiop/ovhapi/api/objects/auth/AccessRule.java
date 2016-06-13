package net.zyuiop.ovhapi.api.objects.auth;

/**
 * Access rule required for the application
 */

public interface AccessRule { 

	/**
	 * @return null
	 */
	java.lang.String getMethod(); 

	/**
	 * @return null
	 */
	java.lang.String getPath(); 

}
