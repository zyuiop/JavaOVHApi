package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/server APIs
 */

public interface Server { 

	/**
	 * remove this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param domain domain on slave server
	*/
	void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;



	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;








	/**
	 * Raid unit volume ports
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	 * @param volume Raid volume name
	*/
	java.lang.String[] getServiceNameStatisticsRaidUnitVolumeVolumePort(java.lang.String serviceName, java.lang.String unit, java.lang.String volume) throws java.io.IOException;






	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedServer() throws java.io.IOException;








	/**
	 * this action stop the task progression if it's possible
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param taskId the id of the task
	*/
	void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Get the windows license compliant with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameLicenseCompliantWindows(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Service monitoring details
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameServiceMonitoring(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Your own SPLA licenses attached to this dedicated server
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your dedicated server
	 * @param status Filter the value of status property (=)
	 * @param type Filter the value of type property (=)
	*/
	long[] getServiceNameSpla(java.lang.String serviceName, java.lang.String status, java.lang.String type) throws java.io.IOException;

	/**
	 * Your own SPLA licenses attached to this dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameSpla(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is this feature orderable with your server
	 * Facultative parameters ? false
	 * @param feature the feature
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Service monitoring alert by SMS
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	long[] getServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Retrieve available country for IP order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Revoke an SPLA license
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param id License id
	*/
	void postServiceNameSplaIdRevoke(java.lang.String serviceName, long id) throws java.io.IOException;




	/**
	 * Option used on this netboot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param bootId boot id
	*/
	java.lang.String[] getServiceNameBootBootIdOption(java.lang.String serviceName, long bootId) throws java.io.IOException;



	/**
	 * Service monitoring alert by email
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	long[] getServiceNameServiceMonitoringMonitoringIdAlertEmail(java.lang.String serviceName, long monitoringId) throws java.io.IOException;



	/**
	 * Server disks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsDisk(java.lang.String serviceName) throws java.io.IOException;












	/**
	 * List of secondary dns domain name
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Release a given option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param option The option name
	*/
	void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;



	/**
	 * Virtual MAC addresses of the server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameVirtualMac(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * add a domain on secondary dns
	 * Facultative parameters ? true
	 * @param domain The domain to add
	 * @param serviceName The internal name of your dedicated server
	 * @param ip 
	*/
	void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * add a domain on secondary dns
	 * Facultative parameters ? false
	 * @param domain The domain to add
	 * @param serviceName The internal name of your dedicated server
	*/
	void postServiceNameSecondaryDnsDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Server raid informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsRaid(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Remove this service monitoring
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	void deleteServiceNameServiceMonitoringMonitoringId(java.lang.String serviceName, long monitoringId) throws java.io.IOException;





	/**
	 * Server compatibles netboots
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your dedicated server
	 * @param bootType Filter the value of bootType property (=)
	*/
	long[] getServiceNameBoot(java.lang.String serviceName, java.lang.String bootType) throws java.io.IOException;

	/**
	 * Server compatibles netboots
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameBoot(java.lang.String serviceName) throws java.io.IOException;











	/**
	 * Is professional use orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableProfessionalUse(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List all ip from server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Get the windows SQL server license compliant with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameLicenseCompliantWindowsSqlServer(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Server partitions
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsPartition(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * List of dedicated server options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Retreive compatible  install template partitions scheme
	 * Facultative parameters ? false
	 * @param templateName null
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameInstallCompatibleTemplatePartitionSchemes(java.lang.String templateName, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Remove this Email alert monitoring
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId This monitoring id
	*/
	void deleteServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;




	/**
	 * Add a new SPLA license
	 * Facultative parameters ? false
	 * @param type License type
	 * @param serialNumber License serial number
	 * @param serviceName The internal name of your dedicated server
	*/
	long postServiceNameSpla(java.lang.String type, java.lang.String serialNumber, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this SMS alert
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId Id of this alert
	*/
	void deleteServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * Server Vracks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Check if given IP can be moved to this server
	 * Facultative parameters ? false
	 * @param ip The ip to move to this server
	 * @param serviceName The internal name of your dedicated server
	*/
	void getServiceNameIpCanBeMovedTo(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Dedicated server todos
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your dedicated server
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Dedicated server todos
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * technical intervention history
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameIntervention(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is a KVM orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableKvm(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List of IPs associated to this Virtual MAC
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	*/
	java.lang.String[] getServiceNameVirtualMacMacAddressVirtualAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException;


	/**
	 * Is a KVM express orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableKvmExpress(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Raid unit volumes
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	*/
	java.lang.String[] getServiceNameStatisticsRaidUnitVolume(java.lang.String serviceName, java.lang.String unit) throws java.io.IOException;






	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your dedicated server
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

}
