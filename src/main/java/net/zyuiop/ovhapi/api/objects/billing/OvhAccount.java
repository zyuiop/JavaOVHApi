package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an OVH account
 */

public interface OvhAccount { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getBalance(); 

	/**
	 * @return null
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return null
	 */
	boolean getCanBeCredited(); 

	/**
	 * @return null
	 */
	java.lang.String getOvhAccountId(); 

	/**
	 * @return null
	 */
	java.util.Date getOpenDate(); 

}
