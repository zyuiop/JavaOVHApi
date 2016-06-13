package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting crons
 */

public interface Cron { 

	/**
	 * @return Email used to receive error log ( stderr )
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Frequency ( crontab format ) defined for the script ( minutes are ignored )
	 */
	java.lang.String getFrequency(); 

	/**
	 * @return Cron language
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return Cron status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Cron's id
	 */
	long getId(); 

	/**
	 * @return Description field for you
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Command to execute
	 */
	java.lang.String getCommand(); 

}
