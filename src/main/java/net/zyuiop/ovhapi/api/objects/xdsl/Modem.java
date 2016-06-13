package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Modem
 */

public interface Modem { 

	/**
	 * @return Size of the Maximum Transmission Unit on the modem's interfaces
	 */
	long getMtuSize(); 

	/**
	 * @return null
	 */
	java.lang.String getMacAddress(); 

	/**
	 * @return Last time the modem made a CWMP request to the Auto Configuration Server
	 */
	java.util.Date getLastCwmpRequestDate(); 

	/**
	 * @return null
	 */
	java.lang.String getModel(); 

	/**
	 * @return Whether or not the modem supports IPv6
	 */
	boolean getIpv6Support(); 

	/**
	 * @return Whether or not the user can configure his modem via OVH Interface (will lock telnet and local HTTP configuration page)
	 */
	boolean getManagedByOvh(); 

	/**
	 * @return IP Address of the DMZ (To modify or delete the DMZ IP on the modem, a re-configuration of your modem has to be made, your configuration will be maintained, but you will lose your connection a few minutes)
	 */
	java.lang.String getDmzIP(); 

	/**
	 * @return Level of the FireWall on the modem
	 */
	java.lang.String getEasyFirewallLevel(); 

	/**
	 * @return Whether or not the modem is in bridge mode. To pass from bridge mode to routed mode, a reset is necessary. If the modem is managedByOvh, the bridge state will be kept after a reset
	 */
	boolean getIsBridged(); 

	/**
	 * @return null
	 */
	java.lang.String getBrandName(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.ModemCapabilities getCapabilities(); 

}
