package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/nasha APIs
 */

public interface Nasha { 


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedNasha() throws java.io.IOException;

	/**
	 * View task list
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your storage
	 * @param status Filter the value of status property (=)
	 * @param operation Filter the value of operation property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status, java.lang.String operation) throws java.io.IOException;

	/**
	 * View task list
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * get ACL for this partition
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	java.lang.String[] getServiceNamePartitionPartitionNameAccess(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Get all IPs that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableIps(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;



	/**
	 * Get partition list
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	*/
	java.lang.String[] getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Get scheduled snapshot types for this partition
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	java.lang.String[] getServiceNamePartitionPartitionNameSnapshot(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;








	/**
	 * Get quota for this partition
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	long[] getServiceNamePartitionPartitionNameQuota(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;






	/**
	 * Get all RIPE/ARIN blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	java.lang.String[] getServiceNamePartitionPartitionNameAuthorizableBlocks(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

}
