package net.zyuiop.ovhapi.api.objects.nichandle.emailchange;

/**
 * Task running an email change on an account
 */

public interface Task { 

	/**
	 * @return End date of that request
	 */
	java.util.Date getDateDone(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return Creation date of that request
	 */
	java.util.Date getDateRequest(); 

	/**
	 * @return Current state of the request
	 */
	java.lang.String getState(); 

	/**
	 * @return The email address to change for
	 */
	java.lang.String getNewEmail(); 

}
