package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * InstanceQuotas
 */

public interface InstanceQuotas { 

	/**
	 * @return Maximum total cores allowed in your project
	 */
	long getMaxInstances(); 

	/**
	 * @return Maximum total cores allowed in your project
	 */
	long getMaxCores(); 

	/**
	 * @return 
	 */
	long getMaxRam(); 

	/**
	 * @return Current used instances
	 */
	long getUsedInstances(); 

	/**
	 * @return Current used ram
	 */
	long getUsedRAM(); 

	/**
	 * @return Current used cores number
	 */
	long getUsedCores(); 

}
