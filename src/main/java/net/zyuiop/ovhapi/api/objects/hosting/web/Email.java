package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting automated emails
 */

public interface Email { 

	/**
	 * @return Bounce
	 */
	long getBounce(); 

	/**
	 * @return Email used to receive errors
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Max email to sent per day
	 */
	long getMaxPerDay(); 

	/**
	 * @return Email sent today
	 */
	long getSentToday(); 

	/**
	 * @return Email sent since hosting creation
	 */
	long getSent(); 

	/**
	 * @return Email state
	 */
	java.lang.String getState(); 

}
