package net.zyuiop.ovhapi.api.objects.cloud.user;

/**
 * UserDetail
 */

public interface UserDetail { 

	/**
	 * @return User password
	 */
	java.lang.String getPassword(); 

	/**
	 * @return User creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return 
	 */
	java.lang.String getUserStatusEnum(); 

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
