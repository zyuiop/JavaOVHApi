package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /domain APIs
 */

public interface Domain { 


	/**
	 * Delete a resource record
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameRecordId(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdAccelerate(java.lang.String zoneName, long id) throws java.io.IOException;




	/**
	 * Add whois obfuscators
	 * Facultative parameters ? false
	 * @param fields Fields to obfuscate
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String[] postServiceNameOwo(java.lang.String fields, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Refresh zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void postZoneZoneNameRefresh(java.lang.String zoneName) throws java.io.IOException;


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
	 * Return authInfo code if the domain is unlocked
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	java.lang.String getServiceNameAuthInfo(java.lang.String serviceName) throws java.io.IOException;


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
	 * Disable Dnssec
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void deleteZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException;







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
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdCancel(java.lang.String zoneName, long id) throws java.io.IOException;

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
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void postZoneZoneNameTaskIdRelaunch(java.lang.String zoneName, long id) throws java.io.IOException;

	/**
	 * Delete a SMD file
	 * Facultative parameters ? false
	 * @param smdId SMD ID
	*/
	void deleteDataSmdSmdId(long smdId) throws java.io.IOException;

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
	 * Delete a redirection
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameRedirectionId(java.lang.String zoneName, long id) throws java.io.IOException;

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
	 * Delete a DynHost login
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	void deleteZoneZoneNameDynHostLoginLogin(java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

	/**
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdCancel(java.lang.String serviceName, long id) throws java.io.IOException;









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
	 * Delete a whois obfuscator
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param field Obfuscated field
	*/
	void deleteServiceNameOwoField(java.lang.String serviceName, java.lang.String field) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String postZoneZoneNameTerminate(java.lang.String zoneName) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getZone() throws java.io.IOException;


	/**
	 * List all the extensions for a specific country
	 * Facultative parameters ? false
	 * @param country Country targeted
	*/
	java.lang.String[] getDataExtension(java.lang.String country) throws java.io.IOException;

	/**
	 * Retrieve all association information according to Afnic
	 * Facultative parameters ? false
	*/
	long[] getDataAfnicAssociationInformation() throws java.io.IOException;





	/**
	 * Retrieve all your Pro Contact
	 * Facultative parameters ? false
	*/
	long[] getDataProContact() throws java.io.IOException;

	/**
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdRelaunch(java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Enable Dnssec
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	void postZoneZoneNameDnssec(java.lang.String zoneName) throws java.io.IOException;


	/**
	 * List of current name servers
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	*/
	long[] getServiceNameNameServer(java.lang.String serviceName) throws java.io.IOException;

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
	 * Export zone
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	*/
	java.lang.String getZoneZoneNameExport(java.lang.String zoneName) throws java.io.IOException;

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
	 * Delete a DynHost record
	 * Facultative parameters ? false
	 * @param zoneName The internal name of your zone
	 * @param id Id of the object
	*/
	void deleteZoneZoneNameDynHostRecordId(java.lang.String zoneName, long id) throws java.io.IOException;



	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your domain
	 * @param id Id of the object
	*/
	void postServiceNameTaskIdAccelerate(java.lang.String serviceName, long id) throws java.io.IOException;




	/**
	 * Change password of the DynHost login
	 * Facultative parameters ? false
	 * @param password New password of the DynHost login
	 * @param zoneName The internal name of your zone
	 * @param login Login
	*/
	void postZoneZoneNameDynHostLoginLoginChangePassword(java.lang.String password, java.lang.String zoneName, java.lang.String login) throws java.io.IOException;

}
