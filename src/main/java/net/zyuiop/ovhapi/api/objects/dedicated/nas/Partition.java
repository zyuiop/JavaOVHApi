package net.zyuiop.ovhapi.api.objects.dedicated.nas;

/**
 * Storage partition
 */

public interface Partition { 

	/**
	 * @return must be nfs cifs or both
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return the given name of partition
	 */
	java.lang.String getPartitionName(); 

	/**
	 * @return Partition size
	 */
	long getSize(); 

}