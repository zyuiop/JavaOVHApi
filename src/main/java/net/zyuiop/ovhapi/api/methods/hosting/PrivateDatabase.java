package net.zyuiop.ovhapi.api.methods.hosting;

/**
 * A class to interact with OVH's /hosting/privateDatabase APIs
 */

public interface PrivateDatabase { 


	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * User grant's on your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	java.lang.String[] getServiceNameUserUserNameGrant(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

	/**
	 * Tasks attached to your private database service
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your private database
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks attached to your private database service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your private database
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Databases linked to your private database service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your private database
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Crons linked to your private database service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * The configuration for whitelist IP for access to the private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameConfigurationWhitelist(java.lang.String serviceName) throws java.io.IOException;













	/**
	 * Get the availables versions for this private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameAvailableVersions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param creationDate Filter the value of creationDate property (like)
	 * @param deletionDate Filter the value of deletionDate property (like)
	*/
	long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	long[] getServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;








	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException;

	/**
	 * List available configurations for your private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameConfigurations(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Create new cron
	 * Facultative parameters ? true
	 * @param frequency Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param command Command to execute
	 * @param serviceName The internal name of your private database
	 * @param email Email used to receive error log ( stderr )
	 * @param databaseName Database name where do an action
	 * @param status Cron status
	 * @param description Description field for your usage
	*/
	java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String databaseName, java.lang.String status, java.lang.String description) throws java.io.IOException;

	/**
	 * Create new cron
	 * Facultative parameters ? false
	 * @param frequency Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param command Command to execute
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String command, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Dump available for your databases
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param creationDate Filter the value of creationDate property (like)
	 * @param deletionDate Filter the value of deletionDate property (like)
	*/
	long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName, java.util.Date creationDate, java.util.Date deletionDate) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	long[] getServiceNameDatabaseDatabaseNameDumps(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;






	/**
	 * User allowed to connect on your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Delete cron
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param id Cron's id
	*/
	java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;







}
