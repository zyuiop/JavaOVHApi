package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Sms Two-Factor Authentication
 */

public interface SmsAccount { 

	/**
	 * @return Status of this account
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The Id of the restriction
	 */
	long getId(); 

	/**
	 * @return Associated phone number
	 */
	java.lang.String getPhoneNumber(); 

}
