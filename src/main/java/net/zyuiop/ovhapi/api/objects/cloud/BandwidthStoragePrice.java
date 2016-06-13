package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about bandwidth storage pricing
 */

public interface BandwidthStoragePrice { 

	/**
	 * @return Bandwidth storage region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Bandwidth storage price (for 1GB)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
