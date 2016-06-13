package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * A shopping cart
 */

public interface Cart { 

	/**
	 * @return Cart identifier
	 */
	java.lang.String getCartId(); 

	/**
	 * @return Description of your cart
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Expiration time
	 */
	java.util.Date getExpire(); 

	/**
	 * @return Indicates if the cart has already been validated
	 */
	boolean getReadOnly(); 

	/**
	 * @return Items of your cart
	 */
	long[] getItems(); 

}
