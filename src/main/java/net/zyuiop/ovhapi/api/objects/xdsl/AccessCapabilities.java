package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describe the capabilities of the Access
 */

public interface AccessCapabilities { 

	/**
	 * @return null
	 */
	boolean getCanChangeDslamProfile(); 

	/**
	 * @return null
	 */
	boolean getCanGetRadiusConnectionLogs(); 

	/**
	 * @return null
	 */
	boolean getCanResetDslamPort(); 

	/**
	 * @return null
	 */
	boolean getHasDslamPort(); 

	/**
	 * @return null
	 */
	boolean getCanChangeLns(); 

	/**
	 * @return null
	 */
	boolean getCanApplyLnsRateLimit(); 

}
