package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * IP block in vrack
 */

public interface Ip { 

	/**
	 * @return Your IP block
	 */
	java.lang.String getIp(); 

	/**
	 * @return Where you want your block announced on the network
	 */
	java.lang.String getZone(); 

	/**
	 * @return Your gateway
	 */
	java.lang.String getGateway(); 

}
