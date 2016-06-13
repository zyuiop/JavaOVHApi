package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Monitoring SMS alert details, This service is currently not supported for servers at BHS 
 */

public interface SmsAlert { 

	/**
	 * @return Alert destination
	 */
	java.lang.String getPhoneNumberTo(); 

	/**
	 * @return Your SMS account
	 */
	java.lang.String getSmsAccount(); 

	/**
	 * @return Alert language
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return Daily hour start time for SMS notification
	 */
	long getToHour(); 

	/**
	 * @return Id of this alert
	 */
	long getAlertId(); 

	/**
	 * @return Daily hour end time for SMS notification
	 */
	long getFromHour(); 

	/**
	 * @return Is this alert enabled
	 */
	boolean getEnabled(); 

}
