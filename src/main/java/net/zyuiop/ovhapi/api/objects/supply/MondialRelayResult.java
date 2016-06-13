package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Status and Mondial Relay Point Details
 */

public interface MondialRelayResult { 

	/**
	 * @return Reference address for finding RelayPoints
	 */
	java.lang.String getReferenceAddress(); 

	/**
	 * @return Array of relay points
	 */
	net.zyuiop.ovhapi.api.objects.supply.MondialRelay getRelayPoints(); 

}
