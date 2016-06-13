package net.zyuiop.ovhapi.api.objects.license.cpanel;

/**
 * Your Cpanel license
 */

public interface Cpanel { 

	/**
	 * @return The internal name of your license
	 */
	java.lang.String getDomain(); 

	/**
	 * @return The license id on license provider side
	 */
	java.lang.String getLicenseId(); 

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
	 * @return This license creation date
	 */
	java.util.Date getCreation(); 

	/**
	 * @return Shall we delete this on expiration ?
	 */
	boolean getDeleteAtExpiration(); 

}
