package net.zyuiop.ovhapi.api.objects.order;

/**
 * Prices of an order
 */

public interface OrderPrices { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getWithoutTax(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTax(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getWithTax(); 

}
