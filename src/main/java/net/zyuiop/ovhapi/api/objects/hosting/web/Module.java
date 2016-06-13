package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting modules installed
 */

public interface Module { 

	/**
	 * @return The language of the module
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return The dependencies to which the module has access. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
	 */
	net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType getDependencies(); 

	/**
	 * @return Where the module is installed, relative to your home directory
	 */
	java.lang.String getPath(); 

	/**
	 * @return ID of the module associated with this installation
	 */
	long getModuleId(); 

	/**
	 * @return The URL from where your module can be reached
	 */
	java.lang.String getTargetUrl(); 

	/**
	 * @return Date of the last module's upgrade
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Date of the installation of the module
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Login for the admin account
	 */
	java.lang.String getAdminName(); 

	/**
	 * @return Installation ID
	 */
	long getId(); 

	/**
	 * @return The admin folder, relative to the module's installation path
	 */
	java.lang.String getAdminFolder(); 

}
