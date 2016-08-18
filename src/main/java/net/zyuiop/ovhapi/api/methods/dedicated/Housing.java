package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/housing APIs
 */

public interface Housing { 








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
	 * this action stop the task progression if it's possible
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	 * @param taskId the id of the task
	*/
	void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your Housing bay
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedHousing() throws java.io.IOException;



}
