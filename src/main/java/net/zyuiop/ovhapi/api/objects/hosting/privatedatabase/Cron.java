package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Crons
 */

public interface Cron { 

	/**
	 * @return Email used to receive error log ( stderr )
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Frequency ( crontab format ) define for the script ( minutes are ignored )
	 */
	java.lang.String getFrequency(); 

	/**
	 * @return Database name where do an action
	 */
	java.lang.String getDatabaseName(); 

	/**
	 * @return Cron status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Cron's id
	 */
	long getId(); 

	/**
	 * @return Description field for your usage
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Command to execute
	 */
	java.lang.String getCommand(); 

}
