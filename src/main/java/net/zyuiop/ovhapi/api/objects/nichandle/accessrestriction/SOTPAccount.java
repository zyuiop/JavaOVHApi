package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * SOTP Two-Factor Authentication
 */

public interface SOTPAccount { 

	/**
	 * @return Number of remaining codes
	 */
	long getRemaining(); 

	/**
	 * @return Status of this account
	 */
	java.lang.String getStatus(); 

}
