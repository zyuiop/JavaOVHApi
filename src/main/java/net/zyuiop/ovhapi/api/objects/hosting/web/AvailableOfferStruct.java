package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Struct which describs an boost offer from a service
 */

public interface AvailableOfferStruct { 

	/**
	 * @return Available boost offer
	 */
	java.lang.String getOffer(); 

	/**
	 * @return The price in month for this boost offer
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
