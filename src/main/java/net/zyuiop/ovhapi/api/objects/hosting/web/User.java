package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting users
 */

public interface User { 

	/**
	 * @return User ssh status
	 */
	java.lang.String getSshState(); 

	/**
	 * @return Home directory
	 */
	java.lang.String getHome(); 

	/**
	 * @return User IIS rights
	 */
	java.lang.String getIisRemoteRights(); 

	/**
	 * @return Is this user primary
	 */
	boolean getIsPrimaryAccount(); 

	/**
	 * @return Login used to connect on FTP
	 */
	java.lang.String getLogin(); 

	/**
	 * @return User status
	 */
	java.lang.String getState(); 

	/**
	 * @return User WebDav rights
	 */
	java.lang.String getWebDavRights(); 

}
