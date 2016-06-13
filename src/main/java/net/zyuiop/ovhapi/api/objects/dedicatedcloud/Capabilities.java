package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * The features available in your Dedicated Cloud
 */

public interface Capabilities { 

	/**
	 * @return Backup feature order status for this Dedicated Cloud
	 */
	java.lang.String getBackupStatus(); 

	/**
	 * @return Nexus 1000v feature order status in this Dedicated Cloud ?
	 */
	java.lang.String getNexus1000vStatus(); 

	/**
	 * @return if true user can be added in this Dedicated Cloud (with POST /dedicatedCloud/{serviceName}/user
	 */
	boolean getCanAddUser(); 

	/**
	 * @return fullAdminRO user right order status in this Dedicated Cloud
	 */
	java.lang.String getFullAdminRoUserStatus(); 

	/**
	 * @return canAddRessource right order status in this Dedicated Cloud
	 */
	java.lang.String getAddRessourceRightStatus(); 

	/**
	 * @return userAccessPolicy property edition status in PUT /dedicatedCloud/{serviceName}
	 */
	java.lang.String getUserAccessPolicyStatus(); 

	/**
	 * @return Hypervisor upgrade order status in this Dedicated Cloud (upgrade with POST /dedicatedCloud/{serviceName}/upgradeHypervisor)
	 */
	boolean getUpgradable(); 

}
