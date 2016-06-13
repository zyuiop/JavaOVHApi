package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud User
 */

public interface User { 

	/**
	 * @return null
	 */
	boolean getFullAdminRo(); 

	/**
	 * @return null
	 */
	long getUserId(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	boolean getCanManageIpFailOvers(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return null
	 */
	java.lang.String getEmail(); 

	/**
	 * @return null
	 */
	java.lang.String getActivationState(); 

	/**
	 * @return Check if the given Dedicated Cloud user can be enabled or disabled ?
	 */
	boolean getIsEnableManageable(); 

	/**
	 * @return null
	 */
	boolean getCanManageNetwork(); 

}
