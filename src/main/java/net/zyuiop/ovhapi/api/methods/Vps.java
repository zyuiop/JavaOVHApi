package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /vps APIs
 */

public interface Vps { 


	/**
	 * Release a given option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param option The option name
	*/
	void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;

	/**
	 * Tasks associated to this virtual server
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your VPS offer
	 * @param type Filter the value of type property (=)
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String type, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated to this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameBackupftpAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return the necessary informations to open a VNC connection to your VPS
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your VPS offer
	 * @param protocol The console protocol you want
	*/
	net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName, java.lang.String protocol) throws java.io.IOException;

	/**
	 * Return the necessary informations to open a VNC connection to your VPS
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Vnc postServiceNameOpenConsoleAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * Creates a VPS.Task that will unmount the backup
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change your Backup FTP password
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpPassword(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameTemplatesId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getVps() throws java.io.IOException;

	/**
	 * Revoke this ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameBackupftpAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;


	/**
	 * Get available Restore Points
	 * Facultative parameters ? false
	 * @param state The state of the restore point
	 * @param serviceName The internal name of your VPS offer
	*/
	java.util.Date[] getServiceNameAutomatedBackupRestorePoints(java.lang.String state, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? true
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your VPS offer
	 * @param ftp Wether to allow the FTP protocol for this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException;

	/**
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? false
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameBackupftpAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Request the machine to stop
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Snapshot getServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request a reboot of the machine
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReboot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Datacenter getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	 * @param softwareId null
	*/
	net.zyuiop.ovhapi.api.objects.vps.Software getServiceNameTemplatesIdSoftwareSoftwareId(java.lang.String serviceName, long id, long softwareId) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.VPS getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.vps.veeam.RestorePoint getServiceNameVeeamRestorePointsId(java.lang.String serviceName, long id) throws java.io.IOException;



	/**
	 * Creates a vps.Task that will delete the Snapshot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task deleteServiceNameSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Veeam restore points for the VPS
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your VPS offer
	 * @param creationTime Filter the value of creationTime property (like)
	*/
	long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName, java.util.Date creationTime) throws java.io.IOException;

	/**
	 * Veeam restore points for the VPS
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameVeeamRestorePoints(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameBackupftpAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * add a domain on secondary dns
	 * Facultative parameters ? true
	 * @param domain The domain to add
	 * @param serviceName The internal name of your VPS offer
	 * @param ip 
	*/
	void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * add a domain on secondary dns
	 * Facultative parameters ? false
	 * @param domain The domain to add
	 * @param serviceName The internal name of your VPS offer
	*/
	void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * remove this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param domain domain on slave server
	*/
	void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	*/
	void putServiceNameSnapshot(net.zyuiop.ovhapi.api.objects.vps.Snapshot param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request the machine to start
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * Facultative parameters ? true
	 * @param type file: Attach/export restored disk to your current VPS - full: Replace your current VPS by the given restorePoint
	 * @param restorePoint Restore Point fetched in /automatedBackup/restorePoints
	 * @param serviceName The internal name of your VPS offer
	 * @param changePassword Only with restore full on VPS Cloud 2014
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupRestore(java.lang.String type, java.util.Date restorePoint, java.lang.String serviceName, boolean changePassword) throws java.io.IOException;

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * Facultative parameters ? false
	 * @param type file: Attach/export restored disk to your current VPS - full: Replace your current VPS by the given restorePoint
	 * @param restorePoint Restore Point fetched in /automatedBackup/restorePoints
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupRestore(java.lang.String type, java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	 * @param ipAddress The effective ip address of the Ip object
	*/
	void putServiceNameIpsIpAddress(net.zyuiop.ovhapi.api.objects.vps.Ip param0, java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Veeam getServiceNameVeeam(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Disks associated to this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameDisks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return all models for the range of the virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Model[] getServiceNameModels(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Revert the Virtual Server to this snapshot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSnapshotRevert(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of secondary dns domain name
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Reinstall the virtual server
	 * Facultative parameters ? true
	 * @param templateId Id of the vps.Template fetched in /templates list
	 * @param serviceName The internal name of your VPS offer
	 * @param sshKey SSH key names to pre-install on your VPS (name from /me/sshKey)
	 * @param language Distribution language. default : en
	 * @param doNotSendPassword If asked, the installation password will NOT be sent (only if sshKey defined)
	 * @param softwareId Id of the vps.Software type fetched in /template/{id}/software
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName, java.lang.String sshKey, java.lang.String language, boolean doNotSendPassword, long[] softwareId) throws java.io.IOException;

	/**
	 * Reinstall the virtual server
	 * Facultative parameters ? false
	 * @param templateId Id of the vps.Template fetched in /templates list
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameReinstall(long templateId, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return all active options for the virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameActiveOptions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a VPS.Task that will umount a restored backup on your VPS
	 * Facultative parameters ? false
	 * @param restorePoint restorePoint fetched in /vps/{serviceName}/automatedBackup/attachedBackup
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameAutomatedBackupDetachBackup(java.util.Date restorePoint, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param softwareId null
	*/
	net.zyuiop.ovhapi.api.objects.vps.Software getServiceNameDistributionSoftwareSoftwareId(java.lang.String serviceName, long softwareId) throws java.io.IOException;

	/**
	 * Create a snapshot of the Virtual Server if the snapshot option is enabled and if there is no existing snapshot
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your VPS offer
	 * @param description A textual description for your snapshot
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName, java.lang.String description) throws java.io.IOException;

	/**
	 * Create a snapshot of the Virtual Server if the snapshot option is enabled and if there is no existing snapshot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameCreateSnapshot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your VPS offer
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Templates available for this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameTemplates(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Ips associated to this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param ipAddress The effective ip address of the Ip object
	*/
	net.zyuiop.ovhapi.api.objects.vps.Ip getServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	 * @param ipBlock The IP Block specific to this ACL
	*/
	void putServiceNameBackupftpAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;


	/**
	 * List of VPS options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available softwares for this template Id
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameDistributionSoftware(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return the VPS console URL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String postServiceNameGetConsoleUrl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param option The option name
	*/
	net.zyuiop.ovhapi.api.objects.vps.Option getServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;

	/**
	 * Get the countries you can select for your IPs geolocation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Give the status of the services of the main IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatus getServiceNameStatus(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Release a given Ip (Additional Ip)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param ipAddress The effective ip address of the Ip object
	*/
	void deleteServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.vps.Disk getServiceNameDisksId(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * Facultative parameters ? true
	 * @param full Replace your current VPS by the restorePoint
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	 * @param changePassword (Full only) Change the restored VPS root password when done
	 * @param export (Except full) The export method for your restore - defaults to both
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id, boolean changePassword, java.lang.String export) throws java.io.IOException;

	/**
	 * Creates a VPS.Task that will restore the given restorePoint
	 * Facultative parameters ? false
	 * @param full Replace your current VPS by the restorePoint
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameVeeamRestorePointsIdRestore(boolean full, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List available softwares for this template Id
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	long[] getServiceNameTemplatesIdSoftware(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.vps.VPS param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.veeam.RestoredBackup getServiceNameVeeamRestoredBackup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return all models the virtual server can be upgraded to
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Model[] getServiceNameAvailableUpgrade(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	void putServiceNameDisksId(net.zyuiop.ovhapi.api.objects.vps.Disk param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Start the process in order to set the root password of the virtual machine. Be careful, in case of Cloud model, a reboot is mandatory.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Task postServiceNameSetPassword(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	net.zyuiop.ovhapi.api.objects.vps.Template getServiceNameDistribution(java.lang.String serviceName) throws java.io.IOException;

}
