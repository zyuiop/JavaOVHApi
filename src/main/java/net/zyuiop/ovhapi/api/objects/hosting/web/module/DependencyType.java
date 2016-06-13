package net.zyuiop.ovhapi.api.objects.hosting.web.module;

/**
 * Dependency parameters. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
 */

public interface DependencyType { 

	/**
	 * @return The password associated with the user
	 */
	java.lang.String getPassword(); 

	/**
	 * @return The name of this dependency
	 */
	java.lang.String getName(); 

	/**
	 * @return The user to use to connect to this dependency
	 */
	java.lang.String getUser(); 

	/**
	 * @return Type
	 */
	java.lang.String getType(); 

	/**
	 * @return The server on where your dependency is hosted
	 */
	java.lang.String getServer(); 

	/**
	 * @return The port on where to contact this dependency
	 */
	long getPort(); 

	/**
	 * @return The prefix to set to the data to distinguish between the data from the module and the rest
	 */
	java.lang.String getPrefix(); 

}
