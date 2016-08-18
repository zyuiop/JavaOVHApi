package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/housing APIs
 */

public interface Housing { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param taskId the id of the task
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.housing.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * this action stop the task progression if it's possible
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param taskId the id of the task
	*/
	void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.housing.Housing getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your Backup FTP service, ALL DATA WILL BE PERMANENTLY DELETED
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Revoke this ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedHousing() throws java.io.IOException;

	/**
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? true
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your Housing bay
	 * @param ftp Wether to allow the FTP protocol for this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException;

	/**
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? false
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * View task list
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your Housing bay
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * View task list
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Housing bay
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * Create a new Backup FTP space
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your Housing bay
	 * @param ipBlock The IP Block specific to this ACL
	*/
	void putServiceNameFeaturesBackupFTPAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * Change your Backup FTP password
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPPassword(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is an APC orderable for this housing bay
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.housing.ApcOrderable getServiceNameOrderableAPC(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtp getServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

}
