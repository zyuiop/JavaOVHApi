package net.zyuiop.ovhapi.api.objects.license.plesk;

/**
 * Your Plesk license
 */

public interface Plesk { 

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
	 * @return This license key
	 */
	java.lang.String getKey(); 

	/**
	 * @return The internal name of your license
	 */
	java.lang.String getDomain(); 

	/**
	 * @return This license Information key
	 */
	java.lang.String getInformationKey(); 

	/**
	 * @return This license product key
	 */
	java.lang.String getProductKey(); 

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

	/**
	 * @return The amount of domain this license can manage
	 */
	java.lang.String getDomainNumber(); 

}
