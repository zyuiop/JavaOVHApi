package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /domain APIs
 */

public interface Domain { 

	/**
	 * List of glue record
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param host Filter the value of host property (like)
	*/
	java.lang.String[] getServiceNameGlueRecord(java.lang.String serviceName, java.lang.String host) throws java.io.IOException;

	/**
	 * List of glue record
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String[] getServiceNameGlueRecord(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add whois obfuscators
	 * Facultative parameters ? false
	 * @param fields Fields to obfuscate
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String[] postServiceNameOwo(java.lang.String fields, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Retrieve all association information according to Afnic
	 * Facultative parameters ? false
	*/
	long[] getDataAfnicAssociationInformation() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Domain getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec getZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Enable Dnssec
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void postZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Refresh zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void postZoneZoneNameRefresh(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? true
	 * @param whoisOwner Filter the value of whoisOwner property (=)
	*/
	java.lang.String[] getDomain(java.lang.String whoisOwner) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDomain() throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String postZoneZoneNameTerminate(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postZoneZoneNameChangeContact(java.lang.String zoneName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	long[] postZoneZoneNameChangeContact(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Domain pending tasks
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param function Filter the value of function property (like)
	 * @param status Filter the value of status property (=)
	*/
	long[] getZoneZoneNameTask(java.lang.String zoneName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Domain pending tasks
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	long[] getZoneZoneNameTask(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdAccelerate(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param field Obfuscated field
	*/
	net.zyuiop.ovhapi.api.objects.domain.Owo getServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException;

	/**
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdRelaunch(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Add new name server
	 * Facultative parameters ? false
	 * @param nameServer New name server
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServer(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return authInfo code if the domain is unlocked
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String getServiceNameAuthInfo(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.DnssecKey getServiceNameDsRecordId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete a resource record
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Create a new DynHost record
	 * Facultative parameters ? true
	 * @param ip Ip address of the DynHost record
	 * @param zoneName The internal name of your zone
	 * @param subDomain Subdomain of the DynHost record
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Create a new DynHost record
	 * Facultative parameters ? false
	 * @param ip Ip address of the DynHost record
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord postZoneZoneNameDynHostRecord(java.lang.String ip, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * DynHost' records
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param subDomain Filter the value of subDomain property (like)
	*/
	long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * DynHost' records
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	long[] getZoneZoneNameDynHostRecord(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Domain pending tasks
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param function Filter the value of function property (like)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Domain pending tasks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a DynHost login
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	void deleteZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

	/**
	 * Create a new DynHost login
	 * Facultative parameters ? false
	 * @param password Password of the login
	 * @param loginSuffix Suffix that will be concatenated to the zoneName to create the login
	 * @param subDomain Subdomain that the login will be allowed to update (use * to allow all)
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin postZoneZoneNameDynHostLogin(java.lang.String password, java.lang.String loginSuffix, java.lang.String subDomain, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Post a new SMD file
	 * Facultative parameters ? false
	 * @param data SMD content file
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.Smd postDataSmd(java.lang.String data) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Soa getZoneZoneNameSoa(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Delete a name server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Task getZoneZoneNameTaskId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	*/
	void putZoneZoneNameSoa(net.zyuiop.ovhapi.api.objects.domain.zone.Soa param0, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdAccelerate(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getZoneZoneNameServiceInfos(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Create a new redirection
	 * Facultative parameters ? true
	 * @param target Target of the redirection
	 * @param type Redirection type
	 * @param zoneName The internal name of your zone
	 * @param keywords Keywords for invisible redirection
	 * @param title Title for invisible redirection
	 * @param subDomain subdomain to redirect
	 * @param description Desciption for invisible redirection
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName, java.lang.String keywords, java.lang.String title, java.lang.String subDomain, java.lang.String description) throws java.io.IOException;

	/**
	 * Create a new redirection
	 * Facultative parameters ? false
	 * @param target Target of the redirection
	 * @param type Redirection type
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Redirection postZoneZoneNameRedirection(java.lang.String target, java.lang.String type, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin getZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

	/**
	 * Zone status
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.zone.Status getZoneZoneNameStatus(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Delete a SMD file
	 * Facultative parameters ? false
	 * @param smdId SMD ID
	*/
	void deleteDataSmdSmdId(long smdId) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getZone() throws java.io.IOException;

	/**
	 * Create a new resource record
	 * Facultative parameters ? true
	 * @param target Resource record target
	 * @param fieldType Resource record Name
	 * @param zoneName The internal name of your zone
	 * @param ttl Resource record ttl
	 * @param subDomain Resource record subdomain
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName, long ttl, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Create a new resource record
	 * Facultative parameters ? false
	 * @param target Resource record target
	 * @param fieldType Resource record Name
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Record postZoneZoneNameRecord(java.lang.String target, java.lang.String fieldType, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Create a glue record
	 * Facultative parameters ? false
	 * @param ips Ips of the glue record
	 * @param host Host of the glue record
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecord(java.lang.String ips, java.lang.String host, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Post new information about .pro contact information
	 * Facultative parameters ? true
	 * @param jobDescription Description of your job
	 * @param authority Authority that certify your profesional status
	 * @param authorityWebsite Website of the authority that certify your profesional status
	 * @param licenseNumber License number given by the authority
	 * @param contactId Contact ID that refer to that .pro information
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber, long contactId) throws java.io.IOException;

	/**
	 * Post new information about .pro contact information
	 * Facultative parameters ? false
	 * @param jobDescription Description of your job
	 * @param authority Authority that certify your profesional status
	 * @param authorityWebsite Website of the authority that certify your profesional status
	 * @param licenseNumber License number given by the authority
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.ProContact postDataProContact(java.lang.String jobDescription, java.lang.String authority, java.lang.String authorityWebsite, java.lang.String licenseNumber) throws java.io.IOException;

	/**
	 * List of current name servers
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	long[] getServiceNameNameServer(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Export zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String getZoneZoneNameExport(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Activate the DNS zone for this domain
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param minimized Create only mandatory records
	*/
	void postServiceNameActivateZone(java.lang.String serviceName, boolean minimized) throws java.io.IOException;

	/**
	 * Activate the DNS zone for this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	void postServiceNameActivateZone(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Records of the zone
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param fieldType Filter the value of fieldType property (like)
	 * @param subDomain Filter the value of subDomain property (like)
	*/
	long[] getZoneZoneNameRecord(java.lang.String zoneName, java.lang.String fieldType, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Records of the zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	long[] getZoneZoneNameRecord(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Update DS records
	 * Facultative parameters ? false
	 * @param keys New Keys
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameDsRecord(net.zyuiop.ovhapi.api.objects.dnssec.Key keys, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param host Host of the glue record
	*/
	net.zyuiop.ovhapi.api.objects.domain.GlueRecord getServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException;

	/**
	 * Retrieve a corporation trademark information according to Afnic
	 * Facultative parameters ? false
	 * @param afnicCorporationTrademarkId Corporation Inpi Information ID
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact getDataAfnicCorporationTrademarkInformationAfnicCorporationTrademarkId(long afnicCorporationTrademarkId) throws java.io.IOException;

	/**
	 * Schedule an outgoing transfer task for this domain (.uk only)
	 * Facultative parameters ? false
	 * @param tag Tag of the new registrar
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameUkOutgoingTransfer(java.lang.String tag, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	void putZoneZoneNameDynHostLoginLogin(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin param0, java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

	/**
	 * Redirections
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param subDomain Filter the value of subDomain property (like)
	*/
	long[] getZoneZoneNameRedirection(java.lang.String zoneName, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Redirections
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	long[] getZoneZoneNameRedirection(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Retrieve information about a Pro Contact
	 * Facultative parameters ? false
	 * @param proContactId ProContact ID
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.ProContact getDataProContactProContactId(long proContactId) throws java.io.IOException;

	/**
	 * Delete a whois obfuscator
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param field Obfuscated field
	*/
	void deleteServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException;

	/**
	 * Reset the DNS zone
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param minimized Create only mandatory records
	*/
	void postZoneZoneNameReset(java.lang.String zoneName, boolean minimized) throws java.io.IOException;

	/**
	 * Reset the DNS zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void postZoneZoneNameReset(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * List of whois obfuscators
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param field Filter the value of field property (=)
	*/
	java.lang.String[] getServiceNameOwo(java.lang.String serviceName, java.lang.String field) throws java.io.IOException;

	/**
	 * List of whois obfuscators
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String[] getServiceNameOwo(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void putZoneZoneNameDynHostRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord param0, java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Modify an existing SMD file
	 * Facultative parameters ? false
	 * @param smdId SMD ID
	 * @param data SMD content file
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.Smd putDataSmdSmdId(long smdId, java.lang.String data) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void putZoneZoneNameRedirectionId(net.zyuiop.ovhapi.api.objects.domain.zone.Redirection param0, java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Retrieve an association information according to Afnic
	 * Facultative parameters ? false
	 * @param associationInformationId Association Information ID
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact getDataAfnicAssociationInformationAssociationInformationId(long associationInformationId) throws java.io.IOException;

	/**
	 * DynHost' logins
	 * Facultative parameters ? true
	 * @param zoneName The internal name of your zone
	 * @param subDomain Filter the value of subDomain property (like)
	 * @param login Filter the value of login property (like)
	*/
	java.lang.String[] getZoneZoneNameDynHostLogin(java.lang.String zoneName, java.lang.String subDomain, java.lang.String login) throws java.io.IOException;

	/**
	 * DynHost' logins
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String[] getZoneZoneNameDynHostLogin(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Zone getZoneZoneName(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Import zone
	 * Facultative parameters ? false
	 * @param zoneFile Zone file that will be imported
	 * @param zoneName The internal name of your zone
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Task postZoneZoneNameImport(java.lang.String zoneFile, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Disable Dnssec
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void deleteZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Delete the glue record
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param host Host of the glue record
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task deleteServiceNameGlueRecordHost(java.lang.String serviceName, java.lang.String host) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.CurrentNameServer getServiceNameNameServerId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Redirection getZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdRelaunch(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Update the glue record
	 * Facultative parameters ? false
	 * @param ips Ips of the glue record
	 * @param serviceName The internal name of your domain
	 * @param host Host of the glue record
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameGlueRecordHostUpdate(java.lang.String ips, java.lang.String serviceName, java.lang.String host) throws java.io.IOException;

	/**
	 * Retrieve all your Pro Contact
	 * Facultative parameters ? false
	*/
	long[] getDataProContact() throws java.io.IOException;

	/**
	 * List all your SMD files
	 * Facultative parameters ? true
	 * @param protectedLabels.label Filter the value of protectedLabels.label property (=)
	*/
	long[] getDataSmd(java.lang.String protectedLabelsLabel) throws java.io.IOException;

	/**
	 * List all your SMD files
	 * Facultative parameters ? false
	*/
	long[] getDataSmd() throws java.io.IOException;

	/**
	 * Retrieve information about a SMD file
	 * Facultative parameters ? false
	 * @param smdId SMD ID
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.Smd getDataSmdSmdId(long smdId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your domain
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.domain.Domain param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	*/
	void putZoneZoneNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String zoneName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void putZoneZoneNameRecordId(net.zyuiop.ovhapi.api.objects.domain.zone.Record param0, java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord getZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * List all the extensions for a specific country
	 * Facultative parameters ? false
	 * @param country Country targeted
	*/
	java.lang.String[] getDataExtension(java.lang.String country) throws java.io.IOException;

	/**
	 * Retrieve all corporation trademark information according to Afnic
	 * Facultative parameters ? false
	*/
	long[] getDataAfnicCorporationTrademarkInformation() throws java.io.IOException;

	/**
	 * List of domain's DS Records
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your domain
	 * @param flags Filter the value of flags property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameDsRecord(java.lang.String serviceName, long flags, java.lang.String status) throws java.io.IOException;

	/**
	 * List of domain's DS Records
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	long[] getServiceNameDsRecord(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change password of the DynHost login
	 * Facultative parameters ? false
	 * @param password New password of the DynHost login
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	void postZoneZoneNameDynHostLoginLoginChangePassword(java.lang.String password, java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.zone.Record getZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Update DNS servers
	 * Facultative parameters ? false
	 * @param nameServers New name servers
	 * @param serviceName The internal name of your domain
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task postServiceNameNameServersUpdate(net.zyuiop.ovhapi.api.objects.domain.DomainNs nameServers, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Post a new association information according to Afnic
	 * Facultative parameters ? false
	 * @param declarationDate Date of the declaration of the association
	 * @param publicationDate Date of the publication of the declaration of the association
	 * @param publicationNumber Number of the publication of the declaration of the association
	 * @param publicationPageNumber Page number of the publication of the declaration of the association
	 * @param contactId Contact ID related to the association contact information
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact postDataAfnicAssociationInformation(java.util.Date declarationDate, java.util.Date publicationDate, java.lang.String publicationNumber, java.lang.String publicationPageNumber, long contactId) throws java.io.IOException;

	/**
	 * Delete a DynHost record
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Delete a redirection
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Post a new corporation trademark information according to Afnic
	 * Facultative parameters ? false
	 * @param inpiNumber Number of the Inpi declaration
	 * @param inpiTrademarkOwner Owner of the trademark
	 * @param contactId Contact ID related to the Inpi additional information
	*/
	net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact postDataAfnicCorporationTrademarkInformation(java.lang.String inpiNumber, java.lang.String inpiTrademarkOwner, long contactId) throws java.io.IOException;

	/**
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdCancel(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.domain.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your domain
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdCancel(java.lang.String serviceName, long id) throws java.io.IOException;

}
