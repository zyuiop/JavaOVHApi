package net.zyuiop.ovhapi.api.methods.dedicated;

/**
 * A class to interact with OVH's /dedicated/server APIs
 */

public interface Server { 

	/**
	 * Get server os informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmOs getServiceNameStatisticsOs(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	 * @param volume Raid volume name
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaidVolume getServiceNameStatisticsRaidUnitVolumeVolume(java.lang.String serviceName, java.lang.String unit, java.lang.String volume) throws java.io.IOException;

	/**
	 * Secondary nameServer available for your Server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNSNameServer getServiceNameSecondaryDnsNameServerAvailable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId Id of this alert
	*/
	void putServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert param0, java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	void putServiceNameServiceMonitoringMonitoringId(net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring param0, java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Launch test on KVM IPMI interface
	 * Facultative parameters ? false
	 * @param ttl Result time to live in minutes
	 * @param type Test to make on KVM IPMI interface
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiTest(long ttl, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param bootId boot id
	 * @param option The option of this boot
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.NetbootOption getServiceNameBootBootIdOptionOption(java.lang.String serviceName, long bootId, java.lang.String option) throws java.io.IOException;

	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Move an Ip failover to this server
	 * Facultative parameters ? false
	 * @param ip The ip to move to this server
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameIpMove(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get disk smart informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param disk Disk
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmDiskSmart getServiceNameStatisticsDiskDiskSmart(java.lang.String serviceName, java.lang.String disk) throws java.io.IOException;

	/**
	 * Revoke this ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

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
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? true
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your dedicated server
	 * @param ftp Wether to allow the FTP protocol for this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName, boolean ftp) throws java.io.IOException;

	/**
	 * Create a new Backup FTP ACL
	 * Facultative parameters ? false
	 * @param ipBlock The IP Block specific to this ACL. It musts belong to your server.
	 * @param nfs Wether to allow the NFS protocol for this ACL
	 * @param cifs Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPAccess(java.lang.String ipBlock, boolean nfs, boolean cifs, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is this feature orderable with your server
	 * Facultative parameters ? false
	 * @param feature the feature
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableFeature(java.lang.String feature, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new email alert
	 * Facultative parameters ? false
	 * @param email Alert destination
	 * @param language Alert language
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert postServiceNameServiceMonitoringMonitoringIdAlertEmail(java.lang.String email, java.lang.String language, java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param bootId boot id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Netboot getServiceNameBootBootId(java.lang.String serviceName, long bootId) throws java.io.IOException;

	/**
	 * Retrieve RTM graph values
	 * Facultative parameters ? false
	 * @param period chart period
	 * @param type RTM chart type
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.complextype.ChartReturn getServiceNameStatisticsChart(java.lang.String period, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Raid unit volumes
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	*/
	java.lang.String[] getServiceNameStatisticsRaidUnitVolume(java.lang.String serviceName, java.lang.String unit) throws java.io.IOException;

	/**
	 * Retreive compatible  install template partitions scheme
	 * Facultative parameters ? false
	 * @param templateName null
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameInstallCompatibleTemplatePartitionSchemes(java.lang.String templateName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaid getServiceNameStatisticsRaidUnit(java.lang.String serviceName, java.lang.String unit) throws java.io.IOException;

	/**
	 * Retrieve IP capabilities about this dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable getServiceNameSpecificationsIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Option used on this netboot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param bootId boot id
	*/
	java.lang.String[] getServiceNameBootBootIdOption(java.lang.String serviceName, long bootId) throws java.io.IOException;

	/**
	 * Retreive compatible  install templates names
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.InstallTemplate getServiceNameInstallCompatibleTemplates(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * IPMI access method
	 * Facultative parameters ? false
	 * @param type IPMI console access
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiAccessValue getServiceNameFeaturesIpmiAccess(java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall getServiceNameFeaturesFirewall(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Server raid informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsRaid(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Service monitoring alert by SMS
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	long[] getServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Is a KVM express orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableKvmExpress(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve vrack traffic graph values
	 * Facultative parameters ? false
	 * @param period mrtg period
	 * @param type mrtg type
	 * @param serviceName The internal name of your dedicated server
	 * @param vrack vrack name
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.MrtgTimestampValue[] getServiceNameVrackVrackMrtg(java.lang.String period, java.lang.String type, java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId This monitoring id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert getServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * Create a SMS alert
	 * Facultative parameters ? true
	 * @param smsAccount Your SMS account
	 * @param phoneNumberTo Alert destination
	 * @param language Alert language
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param toHour Daily hour end time for SMS notification
	 * @param fromHour Daily hour start time for SMS notification
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert postServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String smsAccount, java.lang.String phoneNumberTo, java.lang.String language, java.lang.String serviceName, long monitoringId, long toHour, long fromHour) throws java.io.IOException;

	/**
	 * Create a SMS alert
	 * Facultative parameters ? false
	 * @param smsAccount Your SMS account
	 * @param phoneNumberTo Alert destination
	 * @param language Alert language
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert postServiceNameServiceMonitoringMonitoringIdAlertSms(java.lang.String smsAccount, java.lang.String phoneNumberTo, java.lang.String language, java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Revoke an SPLA license
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param id License id
	*/
	void postServiceNameSplaIdRevoke(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List all ip from server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param vrack vrack name
	*/
	net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer getServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Server partitions
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsPartition(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add an IP to this Virtual MAC
	 * Facultative parameters ? false
	 * @param virtualMachineName Friendly name of your Virtual Machine behind this IP/MAC
	 * @param ipAddress IP address to link to this virtual MAC
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameVirtualMacMacAddressVirtualAddress(java.lang.String virtualMachineName, java.lang.String ipAddress, java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param partition Partition
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmPartition getServiceNameStatisticsPartitionPartition(java.lang.String serviceName, java.lang.String partition) throws java.io.IOException;

	/**
	 * Get server opened connections
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmConnection[] getServiceNameStatisticsConnection(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get USB keys orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.UsbKeyOrderableDetails getServiceNameOrderableUsbKey(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Server Vracks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtp getServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new Backup FTP space
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a virtual mac to an IP address
	 * Facultative parameters ? false
	 * @param virtualMachineName Friendly name of your Virtual Machine behind this IP/MAC
	 * @param ipAddress Ip address to link with this virtualMac
	 * @param type vmac address type
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameVirtualMac(java.lang.String virtualMachineName, java.lang.String ipAddress, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	*/
	void putServiceNameBurst(net.zyuiop.ovhapi.api.objects.dedicated.server.ServerBurst param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add your existing windows license serial to this dedicated server. Will be manageable in /license/windows.
	 * Facultative parameters ? false
	 * @param licenseId Your license serial number
	 * @param version Your license version
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameLicenseWindows(java.lang.String licenseId, java.lang.String version, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId This monitoring id
	*/
	void putServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert param0, java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * Get server PCI devices informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmPci[] getServiceNameStatisticsPci(java.lang.String serviceName) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param id License id
	*/
	void putServiceNameSplaId(net.zyuiop.ovhapi.api.objects.dedicated.server.Spla param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Add a new service monitoring
	 * Facultative parameters ? true
	 * @param protocol The protocol to use
	 * @param ip The IP to monitor
	 * @param interval The test interval
	 * @param port The service port to monitor
	 * @param enabled Is this service monitoring is enabled
	 * @param serviceName The internal name of your dedicated server
	 * @param challengeText The expected return
	 * @param url The URL to test
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring postServiceNameServiceMonitoring(java.lang.String protocol, java.lang.String ip, java.lang.String interval, long port, boolean enabled, java.lang.String serviceName, java.lang.String challengeText, java.lang.String url) throws java.io.IOException;

	/**
	 * Add a new service monitoring
	 * Facultative parameters ? false
	 * @param protocol The protocol to use
	 * @param ip The IP to monitor
	 * @param interval The test interval
	 * @param port The service port to monitor
	 * @param enabled Is this service monitoring is enabled
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring postServiceNameServiceMonitoring(java.lang.String protocol, java.lang.String ip, java.lang.String interval, long port, boolean enabled, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param ipBlock The IP Block specific to this ACL
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl getServiceNameFeaturesBackupFTPAccessIpBlock(java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * remove this server from this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param vrack vrack name
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException;

	/**
	 * Retrieve available country for IP order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.ServiceMonitoring getServiceNameServiceMonitoringMonitoringId(java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Get server memory informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmMemory[] getServiceNameStatisticsMemory(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param disk Disk
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmDisk getServiceNameStatisticsDiskDisk(java.lang.String serviceName, java.lang.String disk) throws java.io.IOException;

	/**
	 * Get server cpu informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmCpu getServiceNameStatisticsCpu(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get hardware RAID size for a given configuration
	 * Facultative parameters ? false
	 * @param templateName Template name
	 * @param partitionSchemeName Partition scheme name
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidSize getServiceNameInstallHardwareRaidSize(java.lang.String templateName, java.lang.String partitionSchemeName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this ip from virtual mac , if you remove the last linked Ip, virtualmac will be deleted
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	 * @param ipAddress IP address
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameVirtualMacMacAddressVirtualAddressIpAddress(java.lang.String serviceName, java.lang.String macAddress, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Result of http, ping and identification tests on IPMI interface
	 * Facultative parameters ? false
	 * @param type Test type result on KVM IPMI interface
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiTestResult getServiceNameFeaturesIpmiTest(java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is a KVM orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableKvm(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the windows SQL server license compliant with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameLicenseCompliantWindowsSqlServer(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Hard reboot this server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameReboot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedServer() throws java.io.IOException;

	/**
	 * technical intervention history
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameIntervention(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Dedicated getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve traffic graph values
	 * Facultative parameters ? false
	 * @param period mrtg period
	 * @param type mrtg type
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.MrtgTimestampValue[] getServiceNameMrtg(java.lang.String period, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param ipBlock The IP Block specific to this ACL
	*/
	void putServiceNameFeaturesBackupFTPAccessIpBlock(net.zyuiop.ovhapi.api.objects.dedicated.server.BackupFtpAcl param0, java.lang.String serviceName, java.lang.String ipBlock) throws java.io.IOException;

	/**
	 * Remove this Email alert monitoring
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId This monitoring id
	*/
	void deleteServiceNameServiceMonitoringMonitoringIdAlertEmailAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * remove this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param domain domain on slave server
	*/
	void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

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
	 * Reset KVM IPMI interface
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiResetInterface(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Reset KVM IPMI sessions
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiResetSessions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Service monitoring alert by email
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	long[] getServiceNameServiceMonitoringMonitoringIdAlertEmail(java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Release a given option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param option The option name
	*/
	void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;

	/**
	 * Retrieve network informations about this dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.NetworkSpecifications getServiceNameSpecificationsNetwork(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	 * @param ipAddress IP address
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMacManagement getServiceNameVirtualMacMacAddressVirtualAddressIpAddress(java.lang.String serviceName, java.lang.String macAddress, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * List of secondary dns domain name
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get server process
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmCommandSize[] getServiceNameStatisticsProcess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get installation status
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressStatus getServiceNameInstallStatus(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Raid unit volume ports
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	 * @param volume Raid volume name
	*/
	java.lang.String[] getServiceNameStatisticsRaidUnitVolumeVolumePort(java.lang.String serviceName, java.lang.String unit, java.lang.String volume) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Rtm getServiceNameStatistics(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Start an install
	 * Facultative parameters ? true
	 * @param templateName Template name
	 * @param serviceName The internal name of your dedicated server
	 * @param partitionSchemeName Partition scheme name
	 * @param details parameters for default install
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameInstallStart(java.lang.String templateName, java.lang.String serviceName, java.lang.String partitionSchemeName, net.zyuiop.ovhapi.api.objects.dedicated.server.InstallCustom details) throws java.io.IOException;

	/**
	 * Start an install
	 * Facultative parameters ? false
	 * @param templateName Template name
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameInstallStart(java.lang.String templateName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param id License id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Spla getServiceNameSplaId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param unit Raid unit
	 * @param volume Raid volume name
	 * @param port Raid volume port
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaidVolumePort getServiceNameStatisticsRaidUnitVolumeVolumePortPort(java.lang.String serviceName, java.lang.String unit, java.lang.String volume, java.lang.String port) throws java.io.IOException;

	/**
	 * List of dedicated server options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get IP orderable with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable getServiceNameOrderableIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Merge a splitted block and route it to the choosen server. You cannot undo this operation
	 * Facultative parameters ? false
	 * @param block The splitted block you want to merge
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameIpBlockMerge(java.lang.String block, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this service monitoring
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	*/
	void deleteServiceNameServiceMonitoringMonitoringId(java.lang.String serviceName, long monitoringId) throws java.io.IOException;

	/**
	 * Get the backup storage orderable with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BackupStorageOrderable getServiceNameOrderableBackupStorage(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your Backup FTP service, ALL DATA WILL BE PERMANENTLY DELETED
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task deleteServiceNameFeaturesBackupFTP(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param taskId the id of the task
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameFeaturesBackupFTPAccess(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMac getServiceNameVirtualMacMacAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Kvm getServiceNameFeaturesKvm(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve hardware informations about this dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareSpecifications getServiceNameSpecificationsHardware(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * this action stop the task progression if it's possible
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param taskId the id of the task
	*/
	void postServiceNameTaskTaskIdCancel(java.lang.String serviceName, long taskId) throws java.io.IOException;

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
	 * Change your Backup FTP password
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesBackupFTPPassword(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param monitoringId This monitoring id
	 * @param alertId Id of this alert
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.SmsAlert getServiceNameServiceMonitoringMonitoringIdAlertSmsAlertId(java.lang.String serviceName, long monitoringId, long alertId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param interventionId The intervention id
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Intervention getServiceNameInterventionInterventionId(java.lang.String serviceName, long interventionId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	*/
	void putServiceNameFeaturesFirewall(net.zyuiop.ovhapi.api.objects.dedicated.server.Firewall param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	 * @param domain domain on slave server
	*/
	void putServiceNameSecondaryDnsDomainsDomain(net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNS param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Ipmi getServiceNameFeaturesIpmi(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Check if given IP can be moved to this server
	 * Facultative parameters ? false
	 * @param ip The ip to move to this server
	 * @param serviceName The internal name of your dedicated server
	*/
	void getServiceNameIpCanBeMovedTo(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.ServerBurst getServiceNameBurst(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the windows license compliant with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameLicenseCompliantWindows(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your dedicated server
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.dedicated.server.Dedicated param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve partition charts
	 * Facultative parameters ? false
	 * @param period chart period
	 * @param serviceName The internal name of your dedicated server
	 * @param partition Partition
	*/
	net.zyuiop.ovhapi.api.objects.complextype.ChartReturn getServiceNameStatisticsPartitionPartitionChart(java.lang.String period, java.lang.String serviceName, java.lang.String partition) throws java.io.IOException;

	/**
	 * Get server motherboard hardware informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmMotherboardHw getServiceNameStatisticsMotherboard(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param option The option name
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Option getServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;

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
	 * DNS field to temporarily add to your zone so that we can verify you are the owner of this domain
	 * Facultative parameters ? false
	 * @param domain The domain to check
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNSCheckField getServiceNameSecondaryDnsNameDomainToken(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request an acces on KVM IPMI interface
	 * Facultative parameters ? true
	 * @param ttl Session access time to live in minutes
	 * @param type IPMI console access
	 * @param serviceName The internal name of your dedicated server
	 * @param ipToAllow IP to allow connection from for this IPMI session
	 * @param sshKey SSH key name to allow access on KVM/IP interface with (name from /me/sshKey)
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiAccess(long ttl, java.lang.String type, java.lang.String serviceName, java.lang.String ipToAllow, java.lang.String sshKey) throws java.io.IOException;

	/**
	 * Request an acces on KVM IPMI interface
	 * Facultative parameters ? false
	 * @param ttl Session access time to live in minutes
	 * @param type IPMI console access
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.Task postServiceNameFeaturesIpmiAccess(long ttl, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retreive hardware RAID profile
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidProfile getServiceNameInstallHardwareRaidProfile(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get bandwidth orderable with your server.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthOrderable getServiceNameOrderableBandwidth(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get server load
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	net.zyuiop.ovhapi.api.objects.dedicated.server.RtmLoad getServiceNameStatisticsLoad(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * domain name server informations
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param domain domain on slave server
	*/
	net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNSNameServer getServiceNameSecondaryDnsDomainsDomainDnsServer(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Virtual MAC addresses of the server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameVirtualMac(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Is professional use orderable with your server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	boolean getServiceNameOrderableProfessionalUse(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param domain domain on slave server
	*/
	net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNS getServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Server disks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	java.lang.String[] getServiceNameStatisticsDisk(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Service monitoring details
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	*/
	long[] getServiceNameServiceMonitoring(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of IPs associated to this Virtual MAC
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your dedicated server
	 * @param macAddress Virtual MAC address in 00:00:00:00:00:00 format
	*/
	java.lang.String[] getServiceNameVirtualMacMacAddressVirtualAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException;

}
