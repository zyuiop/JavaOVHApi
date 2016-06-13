package net.zyuiop.ovhapi.api.objects.service;

/**
 * Map a possible renew for a specific service
 */

public interface RenewType { 

	/**
	 * @return period of renew in month
	 */
	long getPeriod(); 

	/**
	 * @return The service forced to be renewed
	 */
	boolean getForced(); 

	/**
	 * @return The service is automatically renewed
	 */
	boolean getAutomatic(); 

	/**
	 * @return The service will be deleted at expiration
	 */
	boolean getDeleteAtExpiration(); 

}
