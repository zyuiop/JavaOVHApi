package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a timeseries product
 */

public interface TimeseriesProduct { 

	/**
	 * @return Name of the product
	 */
	java.lang.String getProductName(); 

	/**
	 * @return Timeseries offer identifier
	 */
	java.lang.String getPlanCode(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing[] getPrices(); 

}
