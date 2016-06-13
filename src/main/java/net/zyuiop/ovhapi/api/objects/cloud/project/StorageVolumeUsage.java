package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Storage volume used on your project
 */

public interface StorageVolumeUsage { 

	/**
	 * @return Bytes stored in your containers
	 */
	long getStoredBytes(); 

	/**
	 * @return Region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Cost for your storage bandwidth
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotal(); 

}
