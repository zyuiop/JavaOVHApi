package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your load balancing IP
 */

public interface LoadBalancingIp { 

	/**
	 * @return Ssl activation state
	 */
	java.lang.String getSsl(); 

	/**
	 * @return Location where your service is
	 */
	java.lang.String getZone(); 

	/**
	 * @return Your IP load balancing
	 */
	java.lang.String getIpLoadBalancing(); 

	/**
	 * @return The internal name of your IP load balancing
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Current state of your IP
	 */
	java.lang.String getState(); 

	/**
	 * @return The type of stickiness currently in place on your Ip LoadBalancing
	 */
	java.lang.String getStickiness(); 

}
