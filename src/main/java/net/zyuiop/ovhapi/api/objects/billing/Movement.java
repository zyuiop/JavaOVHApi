package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an OVH account
 */

public interface Movement { 

	/**
	 * @return null
	 */
	long getMovementId(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getAmount(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getBalance(); 

	/**
	 * @return null
	 */
	long getOrder(); 

	/**
	 * @return null
	 */
	java.lang.String getOperation(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPreviousBalance(); 

}