package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describe the capabilities of the Modem
 */

public interface ModemCapabilities { 

	/**
	 * @return null
	 */
	boolean getCanBeManagedByOvh(); 

	/**
	 * @return null
	 */
	boolean getCanChangeBridgeMode(); 

	/**
	 * @return null
	 */
	boolean getCanChangeMtu(); 

	/**
	 * @return null
	 */
	boolean getCanChangeManagement(); 

	/**
	 * @return null
	 */
	boolean getCanChangeDHCP(); 

	/**
	 * @return null
	 */
	boolean getCanChangeDMZ(); 

	/**
	 * @return null
	 */
	boolean getCanReset(); 

	/**
	 * @return null
	 */
	boolean getCanChangeLAN(); 

	/**
	 * @return null
	 */
	boolean getCanChangeEasyFirewallLevel(); 

	/**
	 * @return null
	 */
	boolean getCanChangeWLAN(); 

	/**
	 * @return null
	 */
	boolean getCanReboot(); 

	/**
	 * @return null
	 */
	boolean getCanChangePortMapping(); 

	/**
	 * @return null
	 */
	boolean getCanRefreshConnectedDevices(); 

}
