package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about an sms pack offer
 */

public interface PackOffer { 

	/**
	 * @return null
	 */
	double getSmsQuantity(); 

	/**
	 * @return null
	 */
	double getGiftQuantity(); 

	/**
	 * @return null
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return null
	 */
	double getTotalPrice(); 

	/**
	 * @return null
	 */
	long getQuantity(); 

	/**
	 * @return null
	 */
	double getGiftPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getCountryDestination(); 

	/**
	 * @return null
	 */
	double getPrice(); 

}
