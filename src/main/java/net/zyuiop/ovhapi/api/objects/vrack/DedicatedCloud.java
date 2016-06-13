package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack dedicated cloud interface
 */

public interface DedicatedCloud { 

	/**
	 * @return vrack name
	 */
	java.lang.String getVrack(); 

	/**
	 * @return your dedicated cloud service
	 */
	java.lang.String getDedicatedCloud(); 

	/**
	 * @return Dedicated cloud vlanId used
	 */
	long getVlanId(); 

}
