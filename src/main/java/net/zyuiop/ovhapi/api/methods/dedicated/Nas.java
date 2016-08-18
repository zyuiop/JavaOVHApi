package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/nas APIs
 */

public interface Nas { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	void putServiceNamePartitionPartitionName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition param0, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Get partition list
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	*/
	java.lang.String[] getServiceNamePartition(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your storage
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	 * @param uid the uid to set quota on
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nas.Quota getServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException;

	/**
	 * Delete this partition
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Get quota for this partition
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	long[] getServiceNamePartitionPartitionNameQuota(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	 * @param ip the ip in root on storage
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nas.Access getServiceNamePartitionPartitionNameAccessIp(java.lang.String serviceName, java.lang.String partitionName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Delete a given snapshot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	 * @param ip the ip in root on storage
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionNameAccessIp(java.lang.String serviceName, java.lang.String partitionName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition getServiceNamePartitionPartitionName(java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Add an Acl to this  partition
	 * Facultative parameters ? false
	 * @param ip Ip to add
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartitionPartitionNameAccess(java.lang.String ip, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedNas() throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param taskId id of the task
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Set a new quota
	 * Facultative parameters ? false
	 * @param uid the uid to set quota on
	 * @param size the size to set in MB
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartitionPartitionNameQuota(long uid, long size, java.lang.String serviceName, java.lang.String partitionName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a  new partition
	 * Facultative parameters ? false
	 * @param protocol 
	 * @param partitionName Partition name
	 * @param size Partition size
	 * @param serviceName The internal name of your storage
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task postServiceNamePartition(java.lang.String protocol, java.lang.String partitionName, long size, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your storage
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a given quota
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your storage
	 * @param partitionName the given name of partition
	 * @param uid the uid to set quota on
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task deleteServiceNamePartitionPartitionNameQuotaUid(java.lang.String serviceName, java.lang.String partitionName, long uid) throws java.io.IOException;

}
