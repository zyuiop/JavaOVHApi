package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a timeseries product pricing
 */

public interface TimeseriesPricing { 

	/**
	 * @return Price of the product in micro-centims
	 */
	long getPriceInUcents(); 

	/**
	 * @return Pricing model identifier
	 */
	java.lang.String getPricingMode(); 

	/**
	 * @return Duration for ordering the product
	 */
	java.lang.String getDuration(); 

	/**
	 * @return Description of the pricing
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Interval of renewal
	 */
	long getInterval(); 

	/**
	 * @return Minimum repeat for renewal
	 */
	long getMinimumRepeat(); 

	/**
	 * @return Maximum quantity that can be ordered
	 */
	long getMaximumQuantity(); 

	/**
	 * @return Maximum repeat for renewal
	 */
	long getMaximumRepeat(); 

	/**
	 * @return Minimum quantity that can be ordered
	 */
	long getMinimumQuantity(); 

	/**
	 * @return Price of the product
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
