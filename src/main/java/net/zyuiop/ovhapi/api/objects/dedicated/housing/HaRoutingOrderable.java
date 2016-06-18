package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing informations for High Availability routing service orderable for this housing bay
 */

public interface HaRoutingOrderable { 

	/**
	 * @return High Availability routing service offers
	 */
	java.lang.String[] getOffer(); 

	/**
	 * @return Is a routing service is orderable for this housing bay
	 */
	boolean getOrderable(); 

}
