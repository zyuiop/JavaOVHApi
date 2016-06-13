package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about storage pricing
 */

public interface StoragePrice { 

	/**
	 * @return Monthly storage price (for 1GB stored per month)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice(); 

	/**
	 * @return Storage region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Hourly storage price (for 1GB stored per hour)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
