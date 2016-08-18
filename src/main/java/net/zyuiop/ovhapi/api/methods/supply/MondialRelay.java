package net.zyuiop.ovhapi.api.methods.supply;

/**
 * A class to interact with OVH's /supply/mondialRelay APIs
 */

public interface MondialRelay { 

	/**
	 * Find the 10 nearest MondialRelay points from address or city.
	 * Facultative parameters ? true
	 * @param country ISO country code
	 * @param city City
	 * @param address Address
	 * @param zipcode Zip Code
	*/
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn postSupplyMondialRelay(java.lang.String country, java.lang.String city, java.lang.String address, java.lang.String zipcode) throws java.io.IOException;

	/**
	 * Find the 10 nearest MondialRelay points from address or city.
	 * Facultative parameters ? false
	 * @param country ISO country code
	*/
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayReturn postSupplyMondialRelay(java.lang.String country) throws java.io.IOException;

}
