package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Traffic on mitigation
 */

public interface MitigationTraffic { 

	/**
	 * @return Bits per second
	 */
	long getBps(); 

	/**
	 * @return Paquets per second
	 */
	long getPps(); 

}
