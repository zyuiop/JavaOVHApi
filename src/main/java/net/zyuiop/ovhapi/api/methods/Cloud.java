package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /cloud APIs
 */

public interface Cloud { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	net.zyuiop.ovhapi.api.objects.pcs.Account getServiceNamePcsPcsServiceName(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Get VNC access to your instance
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param instanceId Instance id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceVnc postProjectServiceNameInstanceInstanceIdVnc(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException;

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
	 * Request more quota on your /cloud project
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	void postProjectServiceNameUnleash(java.lang.String serviceName) throws java.io.IOException;

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
	 * Create multiple instances
	 * Facultative parameters ? true
	 * @param serviceName Project name
	 * @param flavorId Instance flavor id
	 * @param imageId Instance image id
	 * @param name Instance name
	 * @param region Instance region
	 * @param number Number of instances you want to create
	 * @param sshKeyId SSH keypair id
	 * @param monthlyBilling Active monthly billing
	 * @param userData Configuration information or scripts to use upon launch
	 * @param privateNetworkId Start instance in private network
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.Instance[] postProjectServiceNameInstanceBulk(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, long number, java.lang.String sshKeyId, boolean monthlyBilling, java.lang.String userData, java.lang.String privateNetworkId) throws java.io.IOException;

	/**
	 * Create multiple instances
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param flavorId Instance flavor id
	 * @param imageId Instance image id
	 * @param name Instance name
	 * @param region Instance region
	 * @param number Number of instances you want to create
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.Instance[] postProjectServiceNameInstanceBulk(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, long number) throws java.io.IOException;

	/**
	 * Snapshot an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param snapshotName Snapshot name
	*/
	void postProjectServiceNameInstanceInstanceIdSnapshot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String snapshotName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The project id
	*/
	void putProjectServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Detach a volume from an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param volumeId Volume id
	 * @param instanceId Instance id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdDetach(java.lang.String serviceName, java.lang.String volumeId, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Start a new cloud project
	 * Facultative parameters ? true
	 * @param voucher Voucher code
	 * @param description Project description
	*/
	net.zyuiop.ovhapi.api.objects.cloud.project.NewProject postCreateProject(java.lang.String voucher, java.lang.String description) throws java.io.IOException;

	/**
	 * Start a new cloud project
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.cloud.project.NewProject postCreateProject() throws java.io.IOException;


	/**
	 * Delete user
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	*/
	void deleteProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Get instance
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param instanceId Instance id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail getProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Return many statistics about the virtual machine for a given period
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param instanceId Instance id
	 * @param period The period the statistics are fetched for
	 * @param type The type of statistic to be fetched
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetrics getProjectServiceNameInstanceInstanceIdMonitoring(java.lang.String serviceName, java.lang.String instanceId, java.lang.String period, java.lang.String type) throws java.io.IOException;

	/**
	 * Create new ACL
	 * Facultative parameters ? false
	 * @param accountId Deleguates rights to
	 * @param type Acl type
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Acl postProjectServiceNameAcl(java.lang.String accountId, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param instanceName Instance new name
	*/
	void putProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId, java.lang.String instanceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param accountId OVH customer unique identifier
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Acl getProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException;

	/**
	 * Get failover ip
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param id Ip id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp getProjectServiceNameIpFailoverId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Get your consumption forecast
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param toDate Forecast until date
	*/
	net.zyuiop.ovhapi.api.objects.cloud.forecast.ProjectForecast getProjectServiceNameForecast(java.lang.String serviceName, java.util.Date toDate) throws java.io.IOException;

	/**
	 * Create a delete task for all files in session
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	*/
	net.zyuiop.ovhapi.api.objects.pca.Task deleteServiceNamePcaPcaServiceNameSessionsSessionId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException;

	/**
	 * Delete a volume
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param volumeId Volume id
	*/
	void deleteProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException;

	/**
	 * Get storage container
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerDetail getProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException;

	/**
	 * Get snapshots
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param flavorType Get compatible snapshots with flavor type
	 * @param region Region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image[] getProjectServiceNameSnapshot(java.lang.String serviceName, java.lang.String flavorType, java.lang.String region) throws java.io.IOException;

	/**
	 * Get snapshots
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image[] getProjectServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	 * @param alertId Alert id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.AlertingAlert getProjectServiceNameAlertingIdAlertAlertId(java.lang.String serviceName, java.lang.String id, long alertId) throws java.io.IOException;

	/**
	 * Get vrack where this project is associated
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Vrack getProjectServiceNameVrack(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get services prices
	 * Facultative parameters ? true
	 * @param flavorId OVH cloud flavor id
	 * @param region Region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Price getPrice(java.lang.String flavorId, java.lang.String region) throws java.io.IOException;

	/**
	 * Get services prices
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Price getPrice() throws java.io.IOException;

	/**
	 * Get storage containers
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.storage.Container[] getProjectServiceNameStorage(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a restore task for session
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	*/
	net.zyuiop.ovhapi.api.objects.pca.Task postServiceNamePcaPcaServiceNameSessionsSessionIdRestore(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException;

	/**
	 * See alerts
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	long[] getProjectServiceNameAlertingIdAlert(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Get images
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param flavorType Get compatible images with flavor type
	 * @param region Image region
	 * @param osType Image OS
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image[] getProjectServiceNameImage(java.lang.String serviceName, java.lang.String flavorType, java.lang.String region, java.lang.String osType) throws java.io.IOException;

	/**
	 * Get images
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image[] getProjectServiceNameImage(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * cloud storage billing items
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	long[] getServiceNamePcsPcsServiceNameBilling(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Get user details
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.User getProjectServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Attach a volume on an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param volumeId Volume id
	 * @param instanceId Instance id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdAttach(java.lang.String serviceName, java.lang.String volumeId, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Create container
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerName Container name
	 * @param region Region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.storage.Container postProjectServiceNameStorage(java.lang.String serviceName, java.lang.String containerName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get snapshot details
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId Snapshot id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;

	/**
	 * Delete container
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	*/
	void deleteProjectServiceNameStorageContainerId(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	 * @param fileId File id
	*/
	net.zyuiop.ovhapi.api.objects.pca.File getServiceNamePcaPcaServiceNameSessionsSessionIdFilesFileId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId, java.lang.String fileId) throws java.io.IOException;

	/**
	 * Access to storage API
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerAccess getProjectServiceNameStorageAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Project getProjectServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new instance
	 * Facultative parameters ? true
	 * @param serviceName Project name
	 * @param flavorId Instance flavor id
	 * @param imageId Instance image id
	 * @param name Instance name
	 * @param region Instance region
	 * @param sshKeyId SSH keypair id
	 * @param monthlyBilling Active monthly billing
	 * @param userData Configuration information or scripts to use upon launch
	 * @param privateNetworkId Start instance in private network
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstance(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region, java.lang.String sshKeyId, boolean monthlyBilling, java.lang.String userData, java.lang.String privateNetworkId) throws java.io.IOException;

	/**
	 * Create a new instance
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param flavorId Instance flavor id
	 * @param imageId Instance image id
	 * @param name Instance name
	 * @param region Instance region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstance(java.lang.String serviceName, java.lang.String flavorId, java.lang.String imageId, java.lang.String name, java.lang.String region) throws java.io.IOException;

	/**
	 * View account current total sessions usage (bytes)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	long getServiceNamePcaPcaServiceNameUsage(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Get ips
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.ip.CloudIp[] getProjectServiceNameIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get SSH keys
	 * Facultative parameters ? true
	 * @param serviceName Project name
	 * @param region Region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey[] getProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get SSH keys
	 * Facultative parameters ? false
	 * @param serviceName Project name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKey[] getProjectServiceNameSshkey(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get instances
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param region Instance region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.Instance[] getProjectServiceNameInstance(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get instances
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.Instance[] getProjectServiceNameInstance(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get region
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param regionName Region name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.region.RegionDetail getProjectServiceNameRegionRegionName(java.lang.String serviceName, java.lang.String regionName) throws java.io.IOException;

	/**
	 * Get all users
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.User[] getProjectServiceNameUser(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Credit id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Credit getProjectServiceNameCreditId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Reset the credentials of the swift account and send them by email
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	net.zyuiop.ovhapi.api.objects.pcs.Task postServiceNamePcsPcsServiceNameResetCredentials(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The project id
	*/
	void putProjectServiceName(net.zyuiop.ovhapi.api.objects.cloud.Project param0, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get network
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param networkId Network id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.network.Network getProjectServiceNameNetworkPrivateNetworkId(java.lang.String serviceName, java.lang.String networkId) throws java.io.IOException;

	/**
	 * Get SSH key
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param keyId SSH key id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail getProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	 * @param billingId Billing id
	*/
	net.zyuiop.ovhapi.api.objects.pcs.Billing getServiceNamePcsPcsServiceNameBillingBillingId(java.lang.String serviceName, java.lang.String pcsServiceName, long billingId) throws java.io.IOException;

	/**
	 * Get network subnets
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param networkId Network id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.subnet.Subnet[] getProjectServiceNameNetworkPrivateNetworkIdSubnet(java.lang.String serviceName, java.lang.String networkId) throws java.io.IOException;

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
	 * Delete alerting
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	void deleteProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	void putServiceNamePcsPcsServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Get failover ips
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp[] getProjectServiceNameIpFailover(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get flavors
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param region Flavor region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor[] getProjectServiceNameFlavor(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get flavors
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor[] getProjectServiceNameFlavor(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get token for user
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	 * @param password User password
	*/
	net.zyuiop.ovhapi.api.objects.cloud.identity.Token postProjectServiceNameUserUserIdToken(java.lang.String serviceName, long userId, java.lang.String password) throws java.io.IOException;

	/**
	 * Get your credit
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	long[] getProjectServiceNameCredit(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNamePcsPcsServiceNameServiceInfos(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Create SSH key
	 * Facultative parameters ? true
	 * @param serviceName Project name
	 * @param name SSH key name
	 * @param publicKey SSH public key
	 * @param region Region to create SSH key
	*/
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail postProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String name, java.lang.String publicKey, java.lang.String region) throws java.io.IOException;

	/**
	 * Create SSH key
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param name SSH key name
	 * @param publicKey SSH public key
	*/
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail postProjectServiceNameSshkey(java.lang.String serviceName, java.lang.String name, java.lang.String publicKey) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Alerting getProjectServiceNameAlertingId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Cancel project creation
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	void postProjectServiceNameCancel(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	net.zyuiop.ovhapi.api.objects.pca.Account getServiceNamePcaPcaServiceName(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param billingId Billing id
	*/
	net.zyuiop.ovhapi.api.objects.pca.Billing getServiceNamePcaPcaServiceNameBillingBillingId(java.lang.String serviceName, java.lang.String pcaServiceName, long billingId) throws java.io.IOException;

	/**
	 * Get RC file of OpenStack
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	 * @param region Region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.Openrc getProjectServiceNameUserUserIdOpenrc(java.lang.String serviceName, long userId, java.lang.String region) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	*/
	java.lang.String[] getServiceNamePca(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks associated to this PCS account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	long[] getServiceNamePcsPcsServiceNameTasks(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The project id
	 * @param id Alerting unique UUID
	*/
	void putProjectServiceNameAlertingId(net.zyuiop.ovhapi.api.objects.cloud.Alerting param0, java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Get volumes
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param region Volume region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume[] getProjectServiceNameVolume(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get volumes
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume[] getProjectServiceNameVolume(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	*/
	java.lang.String[] getServiceNamePcs(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getProjectServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new network
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param name Network name
	 * @param vlanId Vland id, between 1 and 4000
	 * @param dhcp Enable DHCP
	 * @param subnets Information about subnets to create
	*/
	net.zyuiop.ovhapi.api.objects.cloud.network.Network postProjectServiceNameNetworkPrivate(java.lang.String serviceName, java.lang.String name, long vlanId, boolean dhcp, net.zyuiop.ovhapi.api.objects.cloud.network.IPPool subnets) throws java.io.IOException;

	/**
	 * Delete ACL
	 * Facultative parameters ? false
	 * @param serviceName The project id
	 * @param accountId OVH customer unique identifier
	*/
	void deleteProjectServiceNameAclAccountId(java.lang.String serviceName, java.lang.String accountId) throws java.io.IOException;

	/**
	 * Attach failover ip to an instance
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param id Ip id
	 * @param instanceId Attach failover ip to instance
	*/
	net.zyuiop.ovhapi.api.objects.cloud.ip.FailoverIp postProjectServiceNameIpFailoverIdAttach(java.lang.String serviceName, java.lang.String id, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	void putServiceNamePcaPcaServiceName(net.zyuiop.ovhapi.api.objects.pca.Account param0, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Create a cloud archives task
	 * Facultative parameters ? false
	 * @param sessionId cloud archives session identifier
	 * @param taskFunction cloud archives task type
	 * @param fileIds cloud archives file identifiers
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	net.zyuiop.ovhapi.api.objects.pca.Task postServiceNamePcaPcaServiceNameTasks(java.lang.String sessionId, java.lang.String taskFunction, java.lang.String fileIds, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Migrate your instance to another flavor
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param flavorId Flavor id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdResize(java.lang.String serviceName, java.lang.String instanceId, java.lang.String flavorId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	*/
	net.zyuiop.ovhapi.api.objects.pca.Session getServiceNamePcaPcaServiceNameSessionsSessionId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException;

	/**
	 * Gives for customer credentials to accesss swift account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	*/
	net.zyuiop.ovhapi.api.objects.cloud.pcs.AccountCredentials getServiceNamePcsPcsServiceNameCredentials(java.lang.String serviceName, java.lang.String pcsServiceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCloud() throws java.io.IOException;

	/**
	 * Delete an instance
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param instanceId Instance id
	*/
	void deleteProjectServiceNameInstanceInstanceId(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Create user
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param description User description
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUser(java.lang.String serviceName, java.lang.String description) throws java.io.IOException;

	/**
	 * Create user
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUser(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Reboot an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param type Reboot type (default soft)
	*/
	void postProjectServiceNameInstanceInstanceIdReboot(java.lang.String serviceName, java.lang.String instanceId, java.lang.String type) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	void putServiceNamePcaPcaServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getProject() throws java.io.IOException;

	/**
	 * Get flavor
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param flavorId Flavor id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getProjectServiceNameFlavorFlavorId(java.lang.String serviceName, java.lang.String flavorId) throws java.io.IOException;

	/**
	 * Active monthly billing on instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdActiveMonthlyBilling(java.lang.String serviceName, java.lang.String instanceId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNamePcaPcaServiceNameServiceInfos(java.lang.String serviceName, java.lang.String pcaServiceName) throws java.io.IOException;

	/**
	 * Reinstall an instance
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param imageId Image to reinstall
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceDetail postProjectServiceNameInstanceInstanceIdReinstall(java.lang.String serviceName, java.lang.String instanceId, java.lang.String imageId) throws java.io.IOException;

	/**
	 * Add new alert
	 * Facultative parameters ? false
	 * @param email Email to contact
	 * @param monthlyThreshold Monthly threshold for this alerting in currency
	 * @param delay Delay between alerts in seconds
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.Alerting postProjectServiceNameAlerting(java.lang.String email, long monthlyThreshold, long delay, java.lang.String serviceName) throws java.io.IOException;

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
	 * Update a volume
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param volumeId Volume id
	 * @param bootable Volume bootable
	 * @param name Volume name
	 * @param description Volume description
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume putProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId, boolean bootable, java.lang.String name, java.lang.String description) throws java.io.IOException;

	/**
	 * Update a volume
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param volumeId Volume id
	 * @param bootable Volume bootable
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume putProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId, boolean bootable) throws java.io.IOException;

	/**
	 * Get regions
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	java.lang.String[] getProjectServiceNameRegion(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a volume
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param size Volume size (in GiB)
	 * @param region Volume region
	 * @param type Volume type
	 * @param name Volume name
	 * @param description Volume description
	 * @param bootable Volume bootable
	 * @param snapshotId Source snapshot id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolume(java.lang.String serviceName, long size, java.lang.String region, java.lang.String type, java.lang.String name, java.lang.String description, boolean bootable, java.lang.String snapshotId) throws java.io.IOException;

	/**
	 * Create a volume
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param size Volume size (in GiB)
	 * @param region Volume region
	 * @param type Volume type
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolume(java.lang.String serviceName, long size, java.lang.String region, java.lang.String type) throws java.io.IOException;

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
	 * Get project quotas
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.quota.Quotas[] getProjectServiceNameQuota(java.lang.String serviceName) throws java.io.IOException;

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
	 * Snapshot a volume
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param volumeId Volume id
	 * @param name Snapshot name
	 * @param description Snapshot description
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot postProjectServiceNameVolumeVolumeIdSnapshot(java.lang.String serviceName, java.lang.String volumeId, java.lang.String name, java.lang.String description) throws java.io.IOException;

	/**
	 * Snapshot a volume
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param volumeId Volume id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot postProjectServiceNameVolumeVolumeIdSnapshot(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException;

	/**
	 * Regenerate user password
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param userId User id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.user.UserDetail postProjectServiceNameUserUserIdRegeneratePassword(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Deploy your container files as a static web site
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param containerId Container id
	*/
	void postProjectServiceNameStorageContainerIdStatic(java.lang.String serviceName, java.lang.String containerId) throws java.io.IOException;

	/**
	 * Manage alerts on your consumption
	 * Facultative parameters ? false
	 * @param serviceName The project id
	*/
	java.lang.String[] getProjectServiceNameAlerting(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get networks
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param region Network region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.network.Network[] getProjectServiceNameNetworkPrivate(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get networks
	 * Facultative parameters ? false
	 * @param serviceName Service name
	*/
	net.zyuiop.ovhapi.api.objects.cloud.network.Network[] getProjectServiceNameNetworkPrivate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get volume snapshot details
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId 
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot getProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;

	/**
	 * Delete SSH key
	 * Facultative parameters ? false
	 * @param serviceName Project name
	 * @param keyId SSH key id
	*/
	void deleteProjectServiceNameSshkeyKeyId(java.lang.String serviceName, java.lang.String keyId) throws java.io.IOException;

	/**
	 * Get your project bills
	 * Facultative parameters ? false
	 * @param to Get bills to
	 * @param from Get bills from
	 * @param serviceName The project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.project.Bill[] getProjectServiceNameBill(java.util.Date to, java.util.Date from, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add credit to your project
	 * Facultative parameters ? false
	 * @param code Voucher code
	 * @param serviceName The project id
	*/
	void postProjectServiceNameCredit(java.lang.String code, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get volume details
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param volumeId Volume id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume getProjectServiceNameVolumeVolumeId(java.lang.String serviceName, java.lang.String volumeId) throws java.io.IOException;

	/**
	 * Extend a volume
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param volumeId Volume id
	 * @param size New volume size (in GiB) (must be greater than current one)
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Volume postProjectServiceNameVolumeVolumeIdUpsize(java.lang.String serviceName, java.lang.String volumeId, long size) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcsServiceName The internal name of your PCS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.pcs.Task getServiceNamePcsPcsServiceNameTasksId(java.lang.String serviceName, java.lang.String pcsServiceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param sessionId Session ID
	*/
	void putServiceNamePcaPcaServiceNameSessionsSessionId(net.zyuiop.ovhapi.api.objects.pca.Session param0, java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String sessionId) throws java.io.IOException;

	/**
	 * Enable or disable rescue mode
	 * Facultative parameters ? true
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param rescue Enable rescue mode
	 * @param imageId Image to boot on
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword postProjectServiceNameInstanceInstanceIdRescueMode(java.lang.String serviceName, java.lang.String instanceId, boolean rescue, java.lang.String imageId) throws java.io.IOException;

	/**
	 * Enable or disable rescue mode
	 * Facultative parameters ? false
	 * @param serviceName Service name
	 * @param instanceId Instance id
	 * @param rescue Enable rescue mode
	*/
	net.zyuiop.ovhapi.api.objects.cloud.instance.RescueAdminPassword postProjectServiceNameInstanceInstanceIdRescueMode(java.lang.String serviceName, java.lang.String instanceId, boolean rescue) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your public cloud passport
	 * @param pcaServiceName The internal name of your PCA offer
	 * @param taskId Task ID
	*/
	net.zyuiop.ovhapi.api.objects.pca.Task getServiceNamePcaPcaServiceNameTasksTaskId(java.lang.String serviceName, java.lang.String pcaServiceName, java.lang.String taskId) throws java.io.IOException;

	/**
	 * Get volume snapshots
	 * Facultative parameters ? true
	 * @param serviceName Project id
	 * @param region Snapshots region
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot[] getProjectServiceNameVolumeSnapshot(java.lang.String serviceName, java.lang.String region) throws java.io.IOException;

	/**
	 * Get volume snapshots
	 * Facultative parameters ? false
	 * @param serviceName Project id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.volume.Snapshot[] getProjectServiceNameVolumeSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get image
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param imageId Image id
	*/
	net.zyuiop.ovhapi.api.objects.cloud.image.Image getProjectServiceNameImageImageId(java.lang.String serviceName, java.lang.String imageId) throws java.io.IOException;

	/**
	 * Delete a snapshot
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId Snapshot id
	*/
	void deleteProjectServiceNameSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;

	/**
	 * Delete a volume snapshot
	 * Facultative parameters ? false
	 * @param serviceName Project id
	 * @param snapshotId Snapshot id
	*/
	void deleteProjectServiceNameVolumeSnapshotSnapshotId(java.lang.String serviceName, java.lang.String snapshotId) throws java.io.IOException;

}
