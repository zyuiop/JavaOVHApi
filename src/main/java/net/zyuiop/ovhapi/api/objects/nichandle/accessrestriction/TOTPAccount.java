package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * TOTP Two-Factor Authentication
 */

public interface TOTPAccount { 

	/**
	 * @return Status of this account
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The Id of the restriction
	 */
	long getId(); 

}
