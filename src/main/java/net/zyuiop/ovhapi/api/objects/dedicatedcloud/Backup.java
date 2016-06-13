package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Backup configured on a given Datacenter
 */

public interface Backup { 

	/**
	 * @return The alert level on which we will send an alert on the email address configured
	 */
	java.lang.String getMailOnLevel(); 

	/**
	 * @return The email address on which alert will be sent if the level you configured is reached. If not set mail is sent to dedicatedCloud administrator contact
	 */
	java.lang.String getMailAddress(); 

	/**
	 * @return This Backup current state
	 */
	java.lang.String getState(); 

}
