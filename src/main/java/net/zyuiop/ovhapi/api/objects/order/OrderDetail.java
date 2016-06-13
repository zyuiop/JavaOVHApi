package net.zyuiop.ovhapi.api.objects.order;

/**
 * Detail of an order
 */

public interface OrderDetail { 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice(); 

	/**
	 * @return null
	 */
	long getQuantity(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
