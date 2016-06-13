package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing current housing options
 */

public interface Options { 

	/**
	 * @return Number of APC connected to this housing bay
	 */
	long getApcCount(); 

	/**
	 * @return High Availability routing service offer
	 */
	java.lang.String getHighAvailabilityRouting(); 

	/**
	 * @return Is this housing bay have handsneyes service
	 */
	boolean getHandsneyes(); 

}
