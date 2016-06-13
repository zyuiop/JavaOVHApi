package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Describe TOTP secret keys
 */

public interface TOTPSecret { 

	/**
	 * @return null
	 */
	java.lang.String getQrcodeHelper(); 

	/**
	 * @return null
	 */
	java.lang.String getSecret(); 

	/**
	 * @return null
	 */
	long getId(); 

}
