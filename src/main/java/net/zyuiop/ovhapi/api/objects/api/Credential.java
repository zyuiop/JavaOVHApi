package net.zyuiop.ovhapi.api.objects.api;

/**
 * API Credential
 */

public interface Credential { 

	/**
	 * @return States whether this credential has been created by yourself or by the OVH support team
	 */
	boolean getOvhSupport(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getApplicationId(); 

	/**
	 * @return null
	 */
	long getCredentialId(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.auth.AccessRule getRules(); 

	/**
	 * @return null
	 */
	java.util.Date getExpiration(); 

	/**
	 * @return null
	 */
	java.util.Date getLastUse(); 

	/**
	 * @return null
	 */
	java.util.Date getCreation(); 

}
