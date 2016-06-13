package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Option of Offer
 */

public interface OfferOption { 

	/**
	 * @return Name of the option
	 */
	java.lang.String getName(); 

	/**
	 * @return Number of slots, couting included slots
	 */
	long getQuantity(); 

}
