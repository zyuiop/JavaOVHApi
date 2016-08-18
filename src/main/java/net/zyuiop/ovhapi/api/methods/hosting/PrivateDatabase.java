package net.zyuiop.ovhapi.api.methods.hosting;

/**
 * A class to interact with OVH's /hosting/privateDatabase APIs
 */

public interface PrivateDatabase { 

	/**
	 * Create a new user on your service
	 * Facultative parameters ? false
	 * @param password Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param userName User name used to connect on your databases
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUser(java.lang.String password, java.lang.String userName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param id The id of the task
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Create a new database on your private database service
	 * Facultative parameters ? false
	 * @param databaseName Name of your new database
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabase(java.lang.String databaseName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add grant on a database
	 * Facultative parameters ? false
	 * @param databaseName Database name where add grant
	 * @param grant Grant you want set on the database for this user
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameGrant(java.lang.String databaseName, java.lang.String grant, java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

	/**
	 * Create a new database/user and grant it
	 * Facultative parameters ? false
	 * @param password Password for the new user ( alphanumeric and 8 characters minimum )
	 * @param databaseName Name of your new database
	 * @param userName New user name used to connect on your database
	 * @param grant Grant of the user on this database
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseWizard(java.lang.String password, java.lang.String databaseName, java.lang.String userName, java.lang.String grant, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change the private database engine version
	 * Facultative parameters ? false
	 * @param version Private database versions
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeVersion(java.lang.String version, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Restart the private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameRestart(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Crons linked to your private database service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request the import in this database
	 * Facultative parameters ? true
	 * @param documentId Documents ID of the dump from /me/documents
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param sendEmail Send an email when the import will be done? Default: false
	 * @param flushDatabase If database will be flushed before importing the dump. Default: false
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String databaseName, boolean sendEmail, boolean flushDatabase) throws java.io.IOException;

	/**
	 * Request the import in this database
	 * Facultative parameters ? false
	 * @param documentId Documents ID of the dump from /me/documents
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * Request the dump of this database ( an email will be send with a link available 30 days )
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param sendEmail Send an email when dump will be available? Default: false
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName, boolean sendEmail) throws java.io.IOException;

	/**
	 * Request the dump of this database ( an email will be send with a link available 30 days )
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDump(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;

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
	 * Delete an IP whitelisting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param ip The IP to whitelist on your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameConfigurationWhitelistIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your private database
	 * @param id Cron's id
	*/
	void putServiceNameCronId(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Cron param0, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Request the restore from this dump
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDumpIdRestore(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

	/**
	 * User grant's on your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	java.lang.String[] getServiceNameUserUserNameGrant(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

	/**
	 * Delete a grant on a database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	 * @param databaseName Database name where grant is set
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameUserUserNameGrantDatabaseName(java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * The configuration for whitelist IP for access to the private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameConfigurationWhitelist(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Start the private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Update an IP whitelisting
	 * Facultative parameters ? false
	 * @param comment Comment
	 * @param service Authorize this IP to access service port
	 * @param sftp Authorize this IP to access sftp port
	 * @param serviceName The internal name of your private database
	 * @param ip The IP to whitelist on your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelistIpUpdate(java.lang.String comment, boolean service, boolean sftp, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump getServiceNameDatabaseDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

	/**
	 * Delete dump before expiration date
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	 * @param databaseName Database name where grant is set
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Grant getServiceNameUserUserNameGrantDatabaseName(java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * Change your root password of database
	 * Facultative parameters ? false
	 * @param password New root password of database ( alphanumeric and 8 characters minimum )
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeRootPassword(java.lang.String password, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request a change password for a user
	 * Facultative parameters ? false
	 * @param password The new user password ( alphanumeric and 8 characters minimum )
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Database getServiceNameDatabaseDatabaseName(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * Request the restore from this dump
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameDatabaseDatabaseNameDumpsIdRestore(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

	/**
	 * Delete cron
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param id Cron's id
	*/
	java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your private database
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change your ftp admin password
	 * Facultative parameters ? false
	 * @param password New ftp admin password ( alphanumeric and 8 characters minimum )
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameChangeFtpPassword(java.lang.String password, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * User allowed to connect on your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHostingPrivateDatabase() throws java.io.IOException;

	/**
	 * Databases linked to your private database service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseName(java.lang.String serviceName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * Delete dump before expiration date
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameDatabaseDatabaseNameDumpId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

	/**
	 * List available configurations for your private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameConfigurations(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your private database
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Synchronize your informations from your private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameRefresh(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create an IP whitelisting
	 * Facultative parameters ? true
	 * @param ip The IP to whitelist on your private database
	 * @param serviceName The internal name of your private database
	 * @param comment Comment
	 * @param service Authorize this IP to access service port
	 * @param sftp Authorize this IP to access sftp port
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelist(java.lang.String ip, java.lang.String serviceName, java.lang.String comment, boolean service, boolean sftp) throws java.io.IOException;

	/**
	 * Create an IP whitelisting
	 * Facultative parameters ? false
	 * @param ip The IP to whitelist on your private database
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameConfigurationWhitelist(java.lang.String ip, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Stop the private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param databaseName Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump getServiceNameDatabaseDatabaseNameDumpId(java.lang.String serviceName, java.lang.String databaseName, long id) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your private database
	*/
	void putServiceNameConfigurationMysql(net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Service getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.User getServiceNameUserUserName(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationMysql getServiceNameConfigurationMysql(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a user
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task deleteServiceNameUserUserName(java.lang.String serviceName, java.lang.String userName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param ip The IP to whitelist on your private database
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.ConfigurationWhitelists getServiceNameConfigurationWhitelistIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get the availables versions for this private database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	*/
	java.lang.String[] getServiceNameAvailableVersions(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Update user grant
	 * Facultative parameters ? false
	 * @param grant Grant you want set on the database for this user
	 * @param serviceName The internal name of your private database
	 * @param userName User name used to connect on your databases
	 * @param databaseName Database name where grant is set
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task postServiceNameUserUserNameGrantDatabaseNameUpdate(java.lang.String grant, java.lang.String serviceName, java.lang.String userName, java.lang.String databaseName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your private database
	 * @param id Cron's id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Cron getServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;

}
