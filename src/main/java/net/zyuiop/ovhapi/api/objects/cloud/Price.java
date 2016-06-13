package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * A structure defining prices for cloud services
 */

public interface Price { 

	/**
	 * @return Price for bandwidth storage
	 */
	net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice getBandwidthStorage(); 

	/**
	 * @return Prices for volumes
	 */
	net.zyuiop.ovhapi.api.objects.cloud.VolumePrice getVolumes(); 

	/**
	 * @return Price for project creation
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getProjectCreation(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice getInstances(); 

	/**
	 * @return Prices for snapshots
	 */
	net.zyuiop.ovhapi.api.objects.cloud.SnapshotPrice getSnapshots(); 

	/**
	 * @return Price for storage
	 */
	net.zyuiop.ovhapi.api.objects.cloud.StoragePrice getStorage(); 

}
