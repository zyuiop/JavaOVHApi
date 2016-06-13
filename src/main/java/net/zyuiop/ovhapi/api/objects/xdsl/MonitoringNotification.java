package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Defines where and how the notifications will be sent
 */

public interface MonitoringNotification { 

	/**
	 * @return The phone number, if type is sms
	 */
	java.lang.String getPhone(); 

	/**
	 * @return The frenquency to send reminders when the access is still down
	 */
	java.lang.String getFrequency(); 

	/**
	 * @return The e-mail address, if type is mail
	 */
	java.lang.String getEmail(); 

	/**
	 * @return The SMS account which will be debited for each sent SMS, if the type is sms
	 */
	java.lang.String getSmsAccount(); 

	/**
	 * @return The number of seconds the access has to be down to trigger an alert
	 */
	long getDownThreshold(); 

	/**
	 * @return Whether or not to allow notifications for generic incidents
	 */
	boolean getAllowIncident(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	boolean getEnabled(); 

}
