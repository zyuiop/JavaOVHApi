package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Line service
 */

public interface Line { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	java.lang.String getOffers(); 

	/**
	 * @return null
	 */
	long getSimultaneousLines(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
