package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /vps APIs
 */

public interface Vps { 




	/**
	 * Get available Restore Points
	 * Facultative parameters ? false
	 * @param state The state of the restore point
	 * @param serviceName The internal name of your VPS offer
	*/
	java.util.Date[] getServiceNameAutomatedBackupRestorePoints(java.lang.String state, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of secondary dns domain name
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameSecondaryDnsDomains(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getVps() throws java.io.IOException;


	/**
	 * Ips associated to this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;





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
	 * Return all active options for the virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameActiveOptions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameBackupftpAccess(java.lang.String serviceName) throws java.io.IOException;






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
	 * List of VPS options
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameOption(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * remove this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param domain domain on slave server
	*/
	void deleteServiceNameSecondaryDnsDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;





	/**
	 * List available softwares for this template Id
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param id Id of the object
	*/
	long[] getServiceNameTemplatesIdSoftware(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Return the VPS console URL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String postServiceNameGetConsoleUrl(java.lang.String serviceName) throws java.io.IOException;








	/**
	 * Get the countries you can select for your IPs geolocation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameIpCountryAvailable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Release a given Ip (Additional Ip)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param ipAddress The effective ip address of the Ip object
	*/
	void deleteServiceNameIpsIpAddress(java.lang.String serviceName, java.lang.String ipAddress) throws java.io.IOException;


	/**
	 * Release a given option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	 * @param option The option name
	*/
	void deleteServiceNameOptionOption(java.lang.String serviceName, java.lang.String option) throws java.io.IOException;






	/**
	 * Templates available for this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameTemplates(java.lang.String serviceName) throws java.io.IOException;









	/**
	 * Get all IP blocks that can be used in the ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	java.lang.String[] getServiceNameBackupftpAuthorizableBlocks(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Disks associated to this virtual server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameDisks(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * List available softwares for this template Id
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your VPS offer
	*/
	long[] getServiceNameDistributionSoftware(java.lang.String serviceName) throws java.io.IOException;

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




}
