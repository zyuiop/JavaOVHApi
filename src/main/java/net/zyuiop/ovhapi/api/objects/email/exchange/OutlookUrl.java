package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Outlook url
 */

public interface OutlookUrl { 

	/**
	 * @return Serial number
	 */
	java.lang.String getSerial(); 

	/**
	 * @return Outlook url
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Url expiration date
	 */
	java.util.Date getExpiration(); 

}
