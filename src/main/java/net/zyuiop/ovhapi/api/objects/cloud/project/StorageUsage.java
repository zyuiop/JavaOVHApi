package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information for current month on your project
 */

public interface StorageUsage { 

	/**
	 * @return Storage bandwidth usage
	 */
	net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage getBandwidth(); 

	/**
	 * @return Storage volume usage
	 */
	net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage getVolume(); 

	/**
	 * @return Cost for your storage in all your containers
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotal(); 

}
