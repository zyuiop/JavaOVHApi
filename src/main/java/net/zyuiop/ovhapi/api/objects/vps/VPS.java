package net.zyuiop.ovhapi.api.objects.vps;

/**
 * VPS Virtual Machine
 */

public interface VPS { 

	/**
	 * @return null
	 */
	java.lang.String getCluster(); 

	/**
	 * @return null
	 */
	long getMemoryLimit(); 

	/**
	 * @return Reboot your VPS 'Cloud' after change, VPS 'Classic/LowLat' will reboot automatically. Credentials for rescue mode will be sent by mail
	 */
	java.lang.String getNetbootMode(); 

	/**
	 * @return null
	 */
	java.lang.String getZone(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.Model getModel(); 

	/**
	 * @return Ip blocks for OVH monitoring servers
	 */
	java.lang.String getMonitoringIpBlocks(); 

	/**
	 * @return Set KVM keyboard layout on VPS Cloud. Reboot your VPS after change
	 */
	java.lang.String getKeymap(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return null
	 */
	long getVcore(); 

	/**
	 * @return null
	 */
	java.lang.String getOfferType(); 

	/**
	 * @return null
	 */
	boolean getSlaMonitoring(); 

	/**
	 * @return Set the name displayed in ManagerV6 for your VPS (max 50 chars)
	 */
	java.lang.String getDisplayName(); 

}
