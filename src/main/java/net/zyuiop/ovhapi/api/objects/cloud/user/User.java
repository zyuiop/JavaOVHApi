package net.zyuiop.ovhapi.api.objects.cloud.user;

/**
 * User
 */

public interface User { 

	/**
	 * @return User creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return User status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return User id
	 */
	long getId(); 

	/**
	 * @return User description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Username
	 */
	java.lang.String getUsername(); 

}
