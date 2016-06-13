package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Information about a disk of a VPS Virtual Machine
 */

public interface Disk { 

	/**
	 * @return The monitoring state of this disk
	 */
	boolean getMonitoring(); 

	/**
	 * @return The low disk free space threshold in MiB
	 */
	long getLowFreeSpaceThreshold(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	long getBandwidthLimit(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	long getSize(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
