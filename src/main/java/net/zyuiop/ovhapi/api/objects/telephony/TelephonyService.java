package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Telephony service
 */

public interface TelephonyService { 

	/**
	 * @return null
	 */
	java.lang.String getFeatureType(); 

	/**
	 * @return The identifier to use to port the number
	 */
	java.lang.String getRio(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Current outplan
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getCurrentOutplan(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	java.lang.String getProperties(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	long getSimultaneousLines(); 

	/**
	 * @return null
	 */
	java.lang.String getOffers(); 

}
