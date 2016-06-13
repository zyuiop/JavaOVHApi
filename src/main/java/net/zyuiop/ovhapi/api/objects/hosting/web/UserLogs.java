package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting users logs
 */

public interface UserLogs { 

	/**
	 * @return Date of the user creation
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Description field for you
	 */
	java.lang.String getDescription(); 

	/**
	 * @return The userLogs login used to connect to logs.ovh.net
	 */
	java.lang.String getLogin(); 

}
