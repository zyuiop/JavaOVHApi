package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS blacklist
 */

public interface Blacklist { 

	/**
	 * @return null
	 */
	java.util.Date getDateCreation(); 

	/**
	 * @return The sms number blacklisted
	 */
	java.lang.String getNumber(); 

}
