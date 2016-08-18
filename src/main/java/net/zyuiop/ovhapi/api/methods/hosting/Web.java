package net.zyuiop.ovhapi.api.methods.hosting;

/**
 * A class to interact with OVH's /hosting/web APIs
 */

public interface Web { 

	/**
	 * Delete the userLogs
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	java.lang.String deleteServiceNameUserLogsLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Find hosting service linked to a domain
	 * Facultative parameters ? false
	 * @param domain Domain used into web hosting attached Domains
	*/
	java.lang.String[] getAttachedDomain(java.lang.String domain) throws java.io.IOException;







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
	 * Create new userLogs
	 * Facultative parameters ? false
	 * @param password The new userLogs password
	 * @param description Description field for you
	 * @param login The userLogs login used to connect to logs.ovh.net
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameUserLogs(java.lang.String password, java.lang.String description, java.lang.String login, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get available offer
	 * Facultative parameters ? false
	 * @param domain Domain you want to add or upgrade a hosting
	*/
	java.lang.String[] getAvailableOffer(java.lang.String domain) throws java.io.IOException;


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
	 * Modules installed on your hosting
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	long[] getServiceNameModule(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Use to link an external domain. ( This token has to be insert into a TXT field on your dns zone with ovhcontrol subdomain )
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String getServiceNameToken(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getHostingWeb() throws java.io.IOException;









	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;







	/**
	 * Request specific operation for your email
	 * Facultative parameters ? false
	 * @param action Action you want to request
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String postServiceNameEmailRequest(java.lang.String action, java.lang.String serviceName) throws java.io.IOException;







	/**
	 * Request a password change
	 * Facultative parameters ? false
	 * @param password The new userLogs password
	 * @param serviceName The internal name of your hosting
	 * @param login The userLogs login used to connect to logs.ovh.net
	*/
	java.lang.String postServiceNameUserLogsLoginChangePassword(java.lang.String password, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Delete cron
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	 * @param id Cron's id
	*/
	java.lang.String deleteServiceNameCronId(java.lang.String serviceName, long id) throws java.io.IOException;


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
	 * List available cron language
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your hosting
	*/
	java.lang.String[] getServiceNameCronAvailableLanguage(java.lang.String serviceName) throws java.io.IOException;





}
