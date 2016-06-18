package net.zyuiop.ovhapi.api.objects.hosting.web.database;

/**
 * Database Available and Default version
 */

public interface AvailableVersionStruct { 

	/**
	 * @return Database default version
	 */
	java.lang.String getDefault(); 

	/**
	 * @return Database available version
	 */
	java.lang.String[] getList(); 

}
