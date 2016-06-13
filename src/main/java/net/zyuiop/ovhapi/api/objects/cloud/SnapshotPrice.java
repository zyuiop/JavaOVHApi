package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about snapshot pricing
 */

public interface SnapshotPrice { 

	/**
	 * @return Monthly flavor price (for 1GB per month)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice(); 

	/**
	 * @return Snapshot region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Hourly snapshot price (for 1GB per hour)
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
