package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about templates informations
 */

public interface Templates { 

	/**
	 * @return null
	 */
	boolean getCustomizedEmailMode(); 

	/**
	 * @return null
	 */
	java.lang.String getEmailBody(); 

	/**
	 * @return null
	 */
	boolean getCustomizedSmsMode(); 

	/**
	 * @return null
	 */
	java.lang.String getEmailSubject(); 

	/**
	 * @return null
	 */
	java.lang.String getSmsBody(); 

	/**
	 * @return null
	 */
	java.lang.String getEmailFrom(); 

}
