package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /cloud APIs
 */

public interface Cloud { 

	/**
	 * Cancel project creation
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	void postProjectServiceNameCancel(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Delete a snapshot
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId Snapshot id
	*/
	void deleteProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;



	/**
	 * Delete alerting
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	void deleteProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;



	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	*/
	java.lang.String[] getServiceNamePca(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Delete a volume
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param volumeId Volume id
	*/
	void deleteProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException;

	/**
	 * Snapshot an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param snapshotName Snapshot name
	*/
	void postProjectServiceNameInstanceInstanceIdSnapshot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String snapshotName) throws java.io.IOException;












	/**
	 * Tasks associated to this PCS account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	long[] getServiceNamePcsPcsServiceNameTasks(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Manage alerts on your consumption
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	java.lang.String[] getProjectServiceNameAlerting(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Get ACL on your cloud project
	 * Facultative parameters ? true
	 * @param serviceName The project id
	 * @param type Filter the value of type property (=)
	*/
	java.lang.String getProjectServiceNameAcl(java.lang.String serviceName, java.lang.String type) throws java.io.IOException;

	/**
	 * Get ACL on your cloud project
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	java.lang.String getProjectServiceNameAcl(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getProject() throws java.io.IOException;


	/**
	 * Deploy your container files as a static web site
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	*/
	void postProjectServiceNameStorageContainerIdStatic(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException;




	/**
	 * Delete SSH key
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param keyId SSH key id
	*/
	void deleteProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException;





	/**
	 * View account current total sessions usage (bytes)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	long getServiceNamePcaPcaServiceNameUsage(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Request more quota on your /cloud project
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	void postProjectServiceNameUnleash(java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Delete an instance
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param instanceId Instance id
	*/
	void deleteProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Delete container
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	*/
	void deleteProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException;




	/**
	 * Add credit to your project
	 * Facultative parameters ? false
	 * @param code Voucher code
	 * @param serviceName The project id
	*/
	void postProjectServiceNameCredit(java.lang.String code, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCloud() throws java.io.IOException;






	/**
	 * See alerts
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	long[] getProjectServiceNameAlertingIdAlert(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;







	/**
	 * Get regions
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	java.lang.String[] getProjectServiceNameRegion(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Reboot an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param type Reboot type (default soft)
	*/
	void postProjectServiceNameInstanceInstanceIdReboot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String type) throws java.io.IOException;




	/**
	 * cloud archives tasks for account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param todoDate.to Filter the value of todoDate property (<=)
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	 * @param todoDate.from Filter the value of todoDate property (>=)
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date todoDateTo, java.lang.String function, java.lang.String status, java.util.Date todoDateFrom) throws java.io.IOException;

	/**
	 * cloud archives tasks for account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameTasks(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;




	/**
	 * Get your credit
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	long[] getProjectServiceNameCredit(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete user
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	*/
	void deleteProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException;








	/**
	 * Alter an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param instanceName Instance new name
	*/
	void putProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId, java.lang.String instanceName) throws java.io.IOException;

	/**
	 * Delete a volume snapshot
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId Snapshot id
	*/
	void deleteProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;




	/**
	 * cloud archives files in session
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	 * @param name Filter the value of name property (like)
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId, java.lang.String name) throws java.io.IOException;

	/**
	 * cloud archives files in session
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameSessionsSessionIdFiles(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException;




	/**
	 * cloud Archives billing items
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	 * @param billed Filter the value of billed property (=)
	*/
	long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName, java.util.Date dateTo, java.util.Date dateFrom, boolean billed) throws java.io.IOException;

	/**
	 * cloud Archives billing items
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	long[] getServiceNamePcaPcaServiceNameBilling(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;



	/**
	 * Delete ACL
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param accountId OVH customer unique identifier
	*/
	void deleteProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException;




	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	*/
	java.lang.String[] getServiceNamePcs(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * cloud archives sessions for account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param name Filter the value of name property (like)
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String name) throws java.io.IOException;

	/**
	 * cloud archives sessions for account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	java.lang.String[] getServiceNamePcaPcaServiceNameSessions(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;













	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The project id
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postProjectServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	long[] postProjectServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Add CORS support on your container
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	 * @param origin Allow this origin
	*/
	void postProjectServiceNameStorageContainerIdCors(java.lang.String serviceName, java.lang.String containerId, java.lang.String origin) throws java.io.IOException;





	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	java.lang.String postProjectServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * cloud storage billing items
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	long[] getServiceNamePcsPcsServiceNameBilling(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;


}
