package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an Order
 */

public interface Order { 

	/**
	 * @return null
	 */
	java.lang.String getPdfUrl(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTax(); 

	/**
	 * @return null
	 */
	java.util.Date getExpirationDate(); 

	/**
	 * @return null
	 */
	java.lang.String getPassword(); 

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
	net.zyuiop.ovhapi.api.objects.order.Price getPriceWithTax(); 

}
