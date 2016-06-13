package net.zyuiop.ovhapi.api.objects.license.directadmin;

/**
 * Your DirectAdmin license
 */

public interface DirectAdmin { 

	/**
	 * @return The client id on license provider side
	 */
	long getClientId(); 

	/**
	 * @return The ip on which this license is attached
	 */
	java.lang.String getIp(); 

	/**
	 * @return This license version
	 */
	java.lang.String getVersion(); 

	/**
	 * @return This license state
	 */
	java.lang.String getStatus(); 

	/**
	 * @return This license operating system
	 */
	java.lang.String getOs(); 

	/**
	 * @return The internal name of your license
	 */
	java.lang.String getDomain(); 

	/**
	 * @return The license id on license provider side
	 */
	java.lang.String getLicenseId(); 

	/**
	 * @return This license creation date
	 */
	java.util.Date getCreation(); 

	/**
	 * @return Shall we delete this on expiration ?
	 */
	boolean getDeleteAtExpiration(); 

}
