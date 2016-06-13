package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Phishing URLs hosted on your IP
 */

public interface Antiphishing { 

	/**
	 * @return Date of the event
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return IP address hosting the phishing URL
	 */
	java.lang.String getIpOnAntiphishing(); 

	/**
	 * @return Internal ID of the phishing entry
	 */
	long getId(); 

	/**
	 * @return Phishing URL
	 */
	java.lang.String getUrlPhishing(); 

	/**
	 * @return Current state of the phishing
	 */
	java.lang.String getState(); 

}
