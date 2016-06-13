package net.zyuiop.ovhapi.api.objects.order;

/**
 * An order
 */

public interface Order { 

	/**
	 * @return null
	 */
	long getOrderId(); 

	/**
	 * @return null
	 */
	java.lang.String getUrl(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.OrderDetail getDetails(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Contract getContracts(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.OrderPrices getPrices(); 

}
