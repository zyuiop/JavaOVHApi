package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * User of the click 2 call
 */

public interface Click2CallUser { 

	/**
	 * @return Contact identifier
	 */
	long getId(); 

	/**
	 * @return login of the click 2 call user
	 */
	java.lang.String getLogin(); 

	/**
	 * @return Date when user was created
	 */
	java.util.Date getCreationDateTime(); 

}
