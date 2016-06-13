package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Available option for the offer
 */

public interface OfferAvailableOption { 

	/**
	 * @return Name of the option
	 */
	java.lang.String getName(); 

	/**
	 * @return Number of slots included by default in this offer
	 */
	long getIncluded(); 

	/**
	 * @return Number of months paid for
	 */
	long getDuration(); 

	/**
	 * @return Number of optional slots that can be puchased
	 */
	long getOptional(); 

	/**
	 * @return Price of an additional slot. You pay this price everytime the duration is expired
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getOptionalPrice(); 

}
