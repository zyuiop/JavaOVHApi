package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information for current month on your project
 */

public interface BandwidthStorageUsage { 

	/**
	 * @return Region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Downloaded bytes from your containers
	 */
	long getDownloadedBytes(); 

	/**
	 * @return Cost for your storage bandwidth
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotal(); 

}
