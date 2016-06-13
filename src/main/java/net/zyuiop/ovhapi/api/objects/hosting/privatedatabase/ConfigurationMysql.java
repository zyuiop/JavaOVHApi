package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Mysql configuration
 */

public interface ConfigurationMysql { 

	/**
	 * @return Where was stored temporary files
	 */
	java.lang.String getTmpdir(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return If set to True, all changes to a table take effect immediately. If set to 0, you must use COMMIT to accept a transaction or ROLLBACK to cancel it
	 */
	boolean getAutoCommit(); 

	/**
	 * @return The size of the buffer pool, the memory area where InnoDB caches table and index data. ( size in MB )
	 */
	long getInnodbBufferPoolSize(); 

	/**
	 * @return The maximum size of one packet or any generated/intermediate string. ( size in MB )
	 */
	long getMaxAllowedPacket(); 

	/**
	 * @return The maximum permitted number of  simultaneous client connections
	 */
	long getMaxConnections(); 

	/**
	 * @return If set to False, InnoDB storage engine is available. If you do not use it, you can disable it to save memory
	 */
	boolean getSkipInnodb(); 

}
