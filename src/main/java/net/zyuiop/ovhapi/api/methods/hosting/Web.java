package net.zyuiop.ovhapi.api.methods.hosting;

/**
 * A class to interact with OVH's /hosting/web APIs
 */

public interface Web { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete ftp/ssh user
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login Login used to connect on FTP
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * IDs of all modules available
	 * Facultative parameters ? true
	 * @param latest Filter the value of latest property (=)
	 * @param active Filter the value of active property (=)
	 * @param branch Filter the value of branch property (=)
	*/
	long[] getModuleList(boolean latest, boolean active, java.lang.String branch) throws java.io.IOException;

	/**
	 * IDs of all modules available
	 * Facultative parameters ? false
	*/
	long[] getModuleList() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs getServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Rollback to an old configuration
	 * Facultative parameters ? false
	 * @param rollbackId The configuration's id you want to rollback
	 * @param serviceName The internal name of your hosting
	 * @param id Configuration's id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdRollback(long rollbackId, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Create new ftp/ssh user
	 * Facultative parameters ? true
	 * @param password Password
	 * @param home Home directory
	 * @param login Login use for your new user
	 * @param serviceName The internal name of your hosting
	 * @param sshState Ssh state for this user. Default: none
	 * @param iisRemoteRights User IIS rights
	 * @param webDavRights User WebDav rights
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName, java.lang.String sshState, java.lang.String iisRemoteRights, java.lang.String webDavRights) throws java.io.IOException;

	/**
	 * Create new ftp/ssh user
	 * Facultative parameters ? false
	 * @param password Password
	 * @param home Home directory
	 * @param login Login use for your new user
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUser(java.lang.String password, java.lang.String home, java.lang.String login, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Crons on your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param email Filter the value of email property (like)
	 * @param language Filter the value of language property (=)
	 * @param description Filter the value of description property (like)
	 * @param command Filter the value of command property (like)
	*/
	long[] getServiceNameCron(java.lang.String serviceName, java.lang.String email, java.lang.String language, java.lang.String description, java.lang.String command) throws java.io.IOException;

	/**
	 * Crons on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] getServiceNameCron(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * User allowed to connect into your logs interface
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param login Filter the value of login property (like)
	*/
	java.lang.String[] getServiceNameUserLogs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * User allowed to connect into your logs interface
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameUserLogs(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id the id of the task
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Databases linked to your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param mode Filter the value of mode property (=)
	 * @param user Filter the value of user property (like)
	 * @param name Filter the value of name property (like)
	 * @param type Filter the value of type property (=)
	 * @param server Filter the value of server property (like)
	*/
	java.lang.String[] getServiceNameDatabase(java.lang.String serviceName, java.lang.String mode, java.lang.String user, java.lang.String name, java.lang.String type, java.lang.String server) throws java.io.IOException;

	/**
	 * Databases linked to your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameDatabase(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Link a domain to this hosting
	 * Facultative parameters ? true
	 * @param domain Domain to link
	 * @param path Domain's path, relative to your home directory
	 * @param serviceName The internal name of your hosting
	 * @param cdn Is linked to the hosting cdn
	 * @param ownLog Put domain for separate the logs on logs.ovh.net
	 * @param ssl Put domain in ssl certificate
	 * @param firewall Firewall state for this path
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName, java.lang.String cdn, java.lang.String ownLog, boolean ssl, java.lang.String firewall) throws java.io.IOException;

	/**
	 * Link a domain to this hosting
	 * Facultative parameters ? false
	 * @param domain Domain to link
	 * @param path Domain's path, relative to your home directory
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomain(java.lang.String domain, java.lang.String path, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Allows you to boost your offer.
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param offer The boost offer of your choice. Set to null to disable boost.
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName, java.lang.String offer) throws java.io.IOException;

	/**
	 * Allows you to boost your offer.
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequestBoost(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available database version following a type
	 * Facultative parameters ? false
	 * @param type Type of the database
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.database.AvailableVersionStruct getServiceNameDatabaseAvailableVersion(java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the userLogs
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	java.lang.String deleteServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param date The date when the change has been requested
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.BoostHistory getServiceNameBoostHistoryDate(java.lang.String serviceName, java.util.Date date) throws java.io.IOException;

	/**
	 * List available cron language
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameCronAvailableLanguage(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Installation ID
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Module getServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete database
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Generate a new admin password for your module
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Installation ID
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModuleIdChangePassword(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHostingWeb() throws java.io.IOException;

	/**
	 * User allowed to connect into your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param home Filter the value of home property (like)
	 * @param login Filter the value of login property (like)
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName, java.lang.String home, java.lang.String login) throws java.io.IOException;

	/**
	 * User allowed to connect into your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Activate an included private database on your hosting offer
	 * Facultative parameters ? false
	 * @param version Private database available versions
	 * @param ram The private database ram size included in your offer
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameActivatePrivateDatabase(java.lang.String version, java.lang.String ram, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param creationDate Filter the value of creationDate property (like)
	 * @param type Filter the value of type property (=)
	 * @param deletionDate Filter the value of deletionDate property (like)
	*/
	long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	long[] getServiceNameDatabaseNameDump(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;


	/**
	 * Request specific operation for your hosting
	 * Facultative parameters ? false
	 * @param action Action you want to request
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create new cron
	 * Facultative parameters ? true
	 * @param frequency Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param language Cron language
	 * @param command Command to execute
	 * @param serviceName The internal name of your hosting
	 * @param email Email used to receive error log ( stderr )
	 * @param status Cron status
	 * @param description Description field for you
	*/
	java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName, java.lang.String email, java.lang.String status, java.lang.String description) throws java.io.IOException;

	/**
	 * Create new cron
	 * Facultative parameters ? false
	 * @param frequency Frequency ( crontab format ) define for the script ( minutes are ignored )
	 * @param language Cron language
	 * @param command Command to execute
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameCron(java.lang.String frequency, java.lang.String language, java.lang.String command, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * User of multidomain independent allowed on your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param login Filter the value of login property (like)
	*/
	java.lang.String[] getServiceNameIndy(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * User of multidomain independent allowed on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameIndy(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Request the dump from your database
	 * Facultative parameters ? true
	 * @param date The date you want to dump
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param sendEmail Send an email when dump will be available? Default: true
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException;

	/**
	 * Request the dump from your database
	 * Facultative parameters ? false
	 * @param date The date you want to dump
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDump(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Install new database
	 * Facultative parameters ? true
	 * @param capabilitie Type of your database
	 * @param user Database user name. Must begin with your hosting login and must be in lower case
	 * @param type Type you want for your database
	 * @param serviceName The internal name of your hosting
	 * @param quota Quota assign to your database. Only for extraSql
	 * @param password Database password
	 * @param version Version you want for your database following the type
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName, long quota, java.lang.String password, java.lang.String version) throws java.io.IOException;

	/**
	 * Install new database
	 * Facultative parameters ? false
	 * @param capabilitie Type of your database
	 * @param user Database user name. Must begin with your hosting login and must be in lower case
	 * @param type Type you want for your database
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabase(java.lang.String capabilitie, java.lang.String user, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request specific operation for your email
	 * Facultative parameters ? false
	 * @param action Action you want to request
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameEmailRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param domain Freedom domain
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Freedom getServiceNameFreedomDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Domains or subdomains attached to your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param domain Filter the value of domain property (like)
	 * @param path Filter the value of path property (like)
	*/
	java.lang.String[] getServiceNameAttachedDomain(java.lang.String serviceName, java.lang.String domain, java.lang.String path) throws java.io.IOException;

	/**
	 * Domains or subdomains attached to your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameAttachedDomain(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete dump before expiration date
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Request a password change
	 * Facultative parameters ? false
	 * @param password The new database password
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param domain Domain linked (fqdn)
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain getServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Cron's id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Cron getServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	 * @param id Cron's id
	*/
	void putServiceNameCronId(net.zyuiop.ovhapi.api.objects.hosting.web.Cron param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	 * @param domain Domain linked (fqdn)
	*/
	void putServiceNameAttachedDomainDomain(net.zyuiop.ovhapi.api.objects.hosting.web.AttachedDomain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Freedom linked to this hosting account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param status Filter the value of status property (=)
	*/
	java.lang.String[] getServiceNameFreedom(java.lang.String serviceName, java.lang.String status) throws java.io.IOException;

	/**
	 * Freedom linked to this hosting account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameFreedom(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get available offer
	 * Facultative parameters ? false
	 * @param domain Domain you want to add or upgrade a hosting
	*/
	java.lang.String[] getAvailableOffer(java.lang.String domain) throws java.io.IOException;

	/**
	 * Request the history volume of email sent
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.mail.VolumeHistory[] getServiceNameEmailVolumes(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Restore this snapshot ALL CURRENT DATA WILL BE REPLACED BY YOUR SNAPSHOT
	 * Facultative parameters ? false
	 * @param backup The backup you want to restore
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameRestoreSnapshot(java.lang.String backup, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Install a new module
	 * Facultative parameters ? true
	 * @param moduleId ID of the module you want to install
	 * @param serviceName The internal name of your hosting
	 * @param domain On which domain the module has to be available (it can be a multidomain or a subdomain) - if not set, the module will be available on your serviceName domain
	 * @param language The language to set to your module
	 * @param adminName The login for the admin account (may be a standard string or your email)
	 * @param adminPassword The password for the admin account (at least 8 characters)
	 * @param dependencies The dependencies that we have to configure on your module. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
	 * @param path Where to install the module, relative to your home directory
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName, java.lang.String domain, java.lang.String language, java.lang.String adminName, java.lang.String adminPassword, net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType dependencies, java.lang.String path) throws java.io.IOException;

	/**
	 * Install a new module
	 * Facultative parameters ? false
	 * @param moduleId ID of the module you want to install
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameModule(long moduleId, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request specific operation for your database
	 * Facultative parameters ? false
	 * @param action Action you want to request
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRequest(java.lang.String action, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Delete dump before expiration date
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Dump getServiceNameDatabaseNameDumpsId(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;


	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request the restore from this dump
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpsIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Delete cron
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Cron's id
	*/
	java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login Login used to connect on FTP
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.User getServiceNameUserLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Purge cache for this attached domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param domain Domain linked (fqdn)
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameAttachedDomainDomainPurgeCache(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login Login of the multidomain independent user
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Indy getServiceNameIndyLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;


	/**
	 * Use to link an external domain. ( This token has to be insert into a TXT field on your dns zone with ovhcontrol subdomain )
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getServiceNameToken(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Modules installed on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] getServiceNameModule(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Find hosting service linked to a domain
	 * Facultative parameters ? false
	 * @param domain Domain used into web hosting attached Domains
	*/
	java.lang.String[] getAttachedDomain(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Email getServiceNameEmail(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Unlink domain from hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param domain Domain linked (fqdn)
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameAttachedDomainDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Request the restore from your database backup
	 * Facultative parameters ? true
	 * @param date The date you want to dump
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param sendEmail Send an email when the restore will be done? Default: false
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name, boolean sendEmail) throws java.io.IOException;

	/**
	 * Request the restore from your database backup
	 * Facultative parameters ? false
	 * @param date The date you want to dump
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameRestore(java.lang.String date, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;


	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	void putServiceNameUserLogsLogin(net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * History of your hosting boost
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param date Filter the value of date property (like)
	*/
	java.util.Date[] getServiceNameBoostHistory(java.lang.String serviceName, java.util.Date date) throws java.io.IOException;

	/**
	 * History of your hosting boost
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.util.Date[] getServiceNameBoostHistory(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Configuration's id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.OvhConfig getServiceNameOvhConfigId(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Request a password change
	 * Facultative parameters ? false
	 * @param password The user's new password
	 * @param serviceName The internal name of your hosting
	 * @param login Login used to connect on FTP
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameUserLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Import a dump from an specific file uploaded with /me/documents
	 * Facultative parameters ? true
	 * @param documentId Documents ID of the dump from /me/documents
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param sendEmail Send an email when the import will be done? Default: false
	 * @param flushDatabase If database will be flushed before importing the dump. Default: false
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name, boolean sendEmail, boolean flushDatabase) throws java.io.IOException;

	/**
	 * Import a dump from an specific file uploaded with /me/documents
	 * Facultative parameters ? false
	 * @param documentId Documents ID of the dump from /me/documents
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameImport(java.lang.String documentId, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Request a password change
	 * Facultative parameters ? false
	 * @param password The new userLogs password
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	java.lang.String postServiceNameUserLogsLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Delete a module installed
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Installation ID
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task deleteServiceNameModuleId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param creationDate Filter the value of creationDate property (like)
	 * @param type Filter the value of type property (=)
	 * @param deletionDate Filter the value of deletionDate property (like)
	*/
	long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name, java.util.Date creationDate, java.lang.String type, java.util.Date deletionDate) throws java.io.IOException;

	/**
	 * Dump available for your databases
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	*/
	long[] getServiceNameDatabaseNameDumps(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Apply a new configuration on this path
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param id Configuration's id
	 * @param environment Environment configuration you want
	 * @param httpFirewall Configuration you want for http firewall
	 * @param engineName Version of engine you want
	 * @param container Container to run this website
	 * @param engineVersion Name of engine you want
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id, java.lang.String environment, java.lang.String httpFirewall, java.lang.String engineName, java.lang.String container, java.lang.String engineVersion) throws java.io.IOException;

	/**
	 * Apply a new configuration on this path
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Configuration's id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigIdChangeConfiguration(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	 * @param login Login used to connect on FTP
	*/
	void putServiceNameUserLogin(net.zyuiop.ovhapi.api.objects.hosting.web.User param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Synchronize the configuration listing with content on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameOvhConfigRefresh(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create new userLogs
	 * Facultative parameters ? false
	 * @param password The new userLogs password
	 * @param description Description field for you
	 * @param login The userLogs login used to connect to logs.ovh.net
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameUserLogs(java.lang.String password, java.lang.String description, java.lang.String login, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks attached to your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param function Filter the value of function property (like)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks attached to your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Configuration used on your hosting
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param historical Filter the value of historical property (=)
	 * @param path Filter the value of path property (like)
	*/
	long[] getServiceNameOvhConfig(java.lang.String serviceName, boolean historical, java.lang.String path) throws java.io.IOException;

	/**
	 * Configuration used on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] getServiceNameOvhConfig(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get a temporary token to access the your web hosting logs interface
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your hosting
	 * @param remoteCheck Whether to limit the use of the token to the remote IPv4 of API caller
	 * @param attachedDomain Specific attached domain to be included in the scope of your token
	 * @param ttl Expiration of your token (in seconds)
	*/
	java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName, boolean remoteCheck, java.lang.String attachedDomain, long ttl) throws java.io.IOException;

	/**
	 * Get a temporary token to access the your web hosting logs interface
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getServiceNameUserLogsToken(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request the restore from this dump
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param name Database name
	 * @param id Dump id
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.Task postServiceNameDatabaseNameDumpIdRestore(java.lang.String serviceName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your hosting
	*/
	void putServiceNameEmail(net.zyuiop.ovhapi.api.objects.hosting.web.Email param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Request the last bounces
	 * Facultative parameters ? false
	 * @param limit Maximum bounces limit ( default : 20 / max : 100 )
	 * @param serviceName The internal name of your hosting
	*/
	net.zyuiop.ovhapi.api.objects.hosting.web.mail.Bounce[] getServiceNameEmailBounces(long limit, java.lang.String serviceName) throws java.io.IOException;

}
