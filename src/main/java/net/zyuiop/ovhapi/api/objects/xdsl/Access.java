package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * XDSL Access
 */

public interface Access { 

	/**
	 * @return null
	 */
	boolean getIpv6Enabled(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getPairsNumber(); 

	/**
	 * @return Rate limit on the LNS in kbps - Only available if canApplyLnsRateLimit capability is set to true - Must be a multiple of 64 - Min value 64 / Max value 100032
	 */
	long getLnsRateLimit(); 

	/**
	 * @return null
	 */
	java.lang.String getAccessName(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	java.lang.String getAccessType(); 

	/**
	 * @return Whether or not this access is monitored
	 */
	boolean getMonitoring(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.AccessCapabilities getCapabilities(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.AddressDetail getAddress(); 

	/**
	 * @return null
	 */
	java.lang.String getNra(); 

	/**
	 * @return null
	 */
	java.lang.String getRole(); 

}
