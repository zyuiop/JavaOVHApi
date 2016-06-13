package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Backends attached to your IP load balancing
 */

public interface LoadBalancingBackendIp { 

	/**
	 * @return If the backend has been configured as backup, this field contains the ip of the main backend
	 */
	java.lang.String getMainBackendIp(); 

	/**
	 * @return Location where your service is
	 */
	java.lang.String getZone(); 

	/**
	 * @return IP of your backend
	 */
	java.lang.String getBackend(); 

	/**
	 * @return Weight of the backend on its zone, must be between 1 and 100, default is 8
	 */
	long getWeight(); 

	/**
	 * @return Probe used for your backend
	 */
	java.lang.String getProbe(); 

}
