package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about volume pricing
 */

public interface VolumePrice { 

	/**
	 * @return Volume name
	 */
	java.lang.String getVolumeName(); 

	/**
	 * @return Monthly volume price (for 1GB per month)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice(); 

	/**
	 * @return Volume region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Hourly volume price (for 1GB per hour)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
