package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Price informations with label
 */

public interface Price { 

	/**
	 * @return Label corresponding to a price
	 */
	java.lang.String getLabel(); 

	/**
	 * @return Price of the product
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
