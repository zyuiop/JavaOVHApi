package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud Vlan
 */

public interface Vlan { 

	/**
	 * @return null
	 */
	long getVlanNumber(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return Speed in Mbps
	 */
	java.lang.String getRoutingRateLimit(); 

	/**
	 * @return null
	 */
	long getVlanId(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
