package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Mysql configuration
 */

public interface ConfigurationWhitelists { 

	/**
	 * @return The comment for this whitelisting
	 */
	java.lang.String getComment(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return The IP to whitelist on your private database
	 */
	java.lang.String getIp(); 

	/**
	 * @return Authorize this IP to access service port
	 */
	boolean getService(); 

	/**
	 * @return Authorize this IP to access sftp port
	 */
	boolean getSftp(); 

}
