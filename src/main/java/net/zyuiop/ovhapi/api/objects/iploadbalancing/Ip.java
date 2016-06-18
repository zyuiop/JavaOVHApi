package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Your IP load balancing
 */

public interface Ip { 

	/**
	 * @return Location where your service is
	 */
	java.lang.String[] getZone(); 

	/**
	 * @return The internal name of your IP load balancing
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Your IP load balancing
	 */
	java.lang.String getIpLoadbalancing(); 

	/**
	 * @return Current state of your IP
	 */
	java.lang.String getState(); 

}
