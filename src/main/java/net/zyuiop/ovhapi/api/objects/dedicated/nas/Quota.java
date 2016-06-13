package net.zyuiop.ovhapi.api.objects.dedicated.nas;

/**
 * Partition Quota
 */

public interface Quota { 

	/**
	 * @return the uid to set quota on
	 */
	long getUid(); 

	/**
	 * @return the size to set in MB
	 */
	long getSize(); 

}
