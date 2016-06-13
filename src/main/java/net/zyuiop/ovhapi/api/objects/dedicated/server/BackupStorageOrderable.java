package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations storage backup orderable for this dedicated server
 */

public interface BackupStorageOrderable { 

	/**
	 * @return Backup storage orderable capacities in gigabytes
	 */
	long[] getCapacities(); 

	/**
	 * @return Is a backup storage is orderable for this server
	 */
	boolean getOrderable(); 

}
