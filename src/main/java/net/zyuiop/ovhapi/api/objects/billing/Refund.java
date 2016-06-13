package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a Refund
 */

public interface Refund { 

	/**
	 * @return null
	 */
	java.lang.String getRefundId(); 

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

	/**
	 * @return null
	 */
	java.lang.String getOriginalBillId(); 

}
