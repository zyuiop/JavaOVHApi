package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of dedicated order properties
 */

public interface DedicatedSettings { 

	/**
	 * @return Unit of the duration selected
	 */
	java.lang.String getDurationUnit(); 

	/**
	 * @return Pricing mode selected for the purchase of the product
	 */
	java.lang.String getPricingMode(); 

	/**
	 * @return Quantity of product desired
	 */
	long getQuantity(); 

	/**
	 * @return Identifier of a dedicated server offer
	 */
	java.lang.String getPlanCode(); 

	/**
	 * @return Duration selected for the purchase of the product
	 */
	long getDuration(); 

}
