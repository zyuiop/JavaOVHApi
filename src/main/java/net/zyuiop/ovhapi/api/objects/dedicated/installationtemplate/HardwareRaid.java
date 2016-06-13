package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Hardware RAID defined in this partitioning scheme
 */

public interface HardwareRaid { 

	/**
	 * @return Specifies the creation order of the hardware RAID
	 */
	long getStep(); 

	/**
	 * @return Disk list
	 */
	java.lang.String getDisks(); 

	/**
	 * @return RAID mode
	 */
	java.lang.String getMode(); 

	/**
	 * @return Hardware RAID name
	 */
	java.lang.String getName(); 

}
