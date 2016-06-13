package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Status and Mondial Relay Point Details
 */

public interface MondialRelayReturn { 

	/**
	 * @return Request status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Error
	 */
	java.lang.String getError(); 

	/**
	 * @return Relay points list and reference address
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult getResult(); 

}
