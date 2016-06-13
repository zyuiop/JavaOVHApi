package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Users
 */

public interface User { 

	/**
	 * @return Creation date of the user
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return User name used to connect on your databases
	 */
	java.lang.String getUserName(); 

}
