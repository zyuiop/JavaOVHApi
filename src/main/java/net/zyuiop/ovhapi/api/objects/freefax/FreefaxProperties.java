package net.zyuiop.ovhapi.api.objects.freefax;

/**
 * Freefax properties
 */

public interface FreefaxProperties { 

	/**
	 * @return Name of the sender of the email
	 */
	java.lang.String getFromName(); 

	/**
	 * @return Email address to redirect fax response.
	 */
	java.lang.String[] getRedirectionEmail(); 

	/**
	 * @return Freefax number in international format
	 */
	java.lang.String getNumber(); 

	/**
	 * @return Quality of fax sending
	 */
	java.lang.String getFaxQuality(); 

	/**
	 * @return Number of max tentative of fax sending
	 */
	long getFaxMaxCall(); 

	/**
	 * @return Customised freefax header
	 */
	java.lang.String getFaxTagLine(); 

	/**
	 * @return FROM email header
	 */
	java.lang.String getFromEmail(); 

}
