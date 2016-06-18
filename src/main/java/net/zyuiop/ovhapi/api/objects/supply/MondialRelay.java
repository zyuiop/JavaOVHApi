package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Mondial Relay Point Details
 */

public interface MondialRelay { 

	/**
	 * @return Relay country
	 */
	java.lang.String getCountry(); 

	/**
	 * @return Distance between address and relay point
	 */
	double getDistance(); 

	/**
	 * @return Relay point latitude
	 */
	double getLat(); 

	/**
	 * @return Relay point name
	 */
	java.lang.String getName(); 

	/**
	 * @return Relay point opening hours
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayOpening getOpening(); 

	/**
	 * @return Zipcode
	 */
	java.lang.String getZipcode(); 

	/**
	 * @return URL of short map
	 */
	java.lang.String getMapUrl(); 

	/**
	 * @return City
	 */
	java.lang.String getCity(); 

	/**
	 * @return Relay point picture\s URL
	 */
	java.lang.String getPictureUrl(); 

	/**
	 * @return Mondial Relay point ID
	 */
	java.lang.String getId(); 

	/**
	 * @return Relay point address
	 */
	java.lang.String getAddress(); 

	/**
	 * @return Relay point longitude
	 */
	double getLng(); 

	/**
	 * @return Relay point closing dates
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod[] getClosing(); 

}
