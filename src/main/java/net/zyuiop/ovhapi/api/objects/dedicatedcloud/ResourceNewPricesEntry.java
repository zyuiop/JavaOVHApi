package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * A structure describing the Resource's new price
 */

public interface ResourceNewPricesEntry { 

	/**
	 * @return null
	 */
	java.lang.String getResourceType(); 

	/**
	 * @return null
	 */
	java.lang.String getBillingType(); 

	/**
	 * @return null
	 */
	boolean getChanged(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getOldPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getNewPrice(); 

}
