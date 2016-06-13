package net.zyuiop.ovhapi.api.objects.auth;

/**
 * Credential request to get access to the API
 */

public interface Credential { 

	/**
	 * @return null
	 */
	java.lang.String getValidationUrl(); 

	/**
	 * @return null
	 */
	java.lang.String getConsumerKey(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
