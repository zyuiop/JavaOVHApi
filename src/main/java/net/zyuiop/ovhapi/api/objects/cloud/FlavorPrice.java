package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about flavor pricing
 */

public interface FlavorPrice { 

	/**
	 * @return Monthly flavor price
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice(); 

	/**
	 * @return Flavor id
	 */
	java.lang.String getFlavorId(); 

	/**
	 * @return Flavor region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Hourly flavor price
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

	/**
	 * @return Flavor name
	 */
	java.lang.String getFlavorName(); 

}
