package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * VolumeQuotas
 */

public interface VolumeQuotas { 

	/**
	 * @return Maximum total volume capacity allowed in your project
	 */
	long getMaxGigabytes(); 

	/**
	 * @return Current volumes count
	 */
	long getVolumeCount(); 

	/**
	 * @return Current used volume gigabytes
	 */
	long getUsedGigabytes(); 

}
