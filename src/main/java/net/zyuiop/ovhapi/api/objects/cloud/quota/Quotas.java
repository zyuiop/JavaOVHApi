package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * Quotas
 */

public interface Quotas { 

	/**
	 * @return Quotas on keypairs
	 */
	net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas getKeypair(); 

	/**
	 * @return Quotas on volumes
	 */
	net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas getVolume(); 

	/**
	 * @return Region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Quotas on instances
	 */
	net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas getInstance(); 

}
