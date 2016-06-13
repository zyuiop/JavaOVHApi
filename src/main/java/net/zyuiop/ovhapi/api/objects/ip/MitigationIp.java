package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP on mitigation
 */

public interface MitigationIp { 

	/**
	 * @return null
	 */
	java.lang.String getIpOnMitigation(); 

	/**
	 * @return Set on true if your ip is on auto-mitigation
	 */
	boolean getAuto(); 

	/**
	 * @return Set on true if your ip is on permanent mitigation
	 */
	boolean getPermanent(); 

	/**
	 * @return Current state of your ip on mitigation
	 */
	java.lang.String getState(); 

}
