package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Virtual service
 */

public interface OvhConfig { 

	/**
	 * @return Configuration you want for http firewall
	 */
	java.lang.String getHttpFirewall(); 

	/**
	 * @return Version of engine you want
	 */
	java.lang.String getEngineName(); 

	/**
	 * @return If this configuration is an old configuration
	 */
	boolean getHistorical(); 

	/**
	 * @return Config path, relative to your home directory
	 */
	java.lang.String getPath(); 

	/**
	 * @return Environment configuration you want
	 */
	java.lang.String getEnvironment(); 

	/**
	 * @return If .ovhConfig exists
	 */
	boolean getFileExist(); 

	/**
	 * @return When ovhconfig was created, or found for the first time, on the hosting servers
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Configuration's id
	 */
	long getId(); 

	/**
	 * @return Name of engine you want
	 */
	java.lang.String getEngineVersion(); 

}
