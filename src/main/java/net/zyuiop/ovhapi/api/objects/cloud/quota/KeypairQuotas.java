package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * KeypairQuotas
 */

public interface KeypairQuotas { 

	/**
	 * @return Maximum keypairs count allowed in your project
	 */
	long getMaxCount(); 

}
