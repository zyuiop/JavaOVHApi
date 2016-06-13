package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Information about a Bill entry
 */

public interface OrderDetail { 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	long getOrderDetailId(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getQuantity(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
