package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms operator informations
 */

public interface Hlr { 

	/**
	 * @return The country
	 */
	java.lang.String getCountry(); 

	/**
	 * @return The operator name
	 */
	java.lang.String getOperator(); 

	/**
	 * @return The network name
	 */
	java.lang.String getNetwork(); 

	/**
	 * @return The region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return The countryCode prefix number
	 */
	java.lang.String getCountryCode(); 

}
