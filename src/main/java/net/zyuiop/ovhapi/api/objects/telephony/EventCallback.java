package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Callback url for each event
 */

public interface EventCallback { 

	/**
	 * @return Url called for each event
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Email notification address in case of url calling failure
	 */
	java.lang.String getEmailError(); 

}
