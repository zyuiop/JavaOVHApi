package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms history of sms incoming received
 */

public interface Incoming { 

	/**
	 * @return null
	 */
	double getCredits(); 

	/**
	 * @return null
	 */
	java.lang.String getSender(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	java.lang.String getTag(); 

	/**
	 * @return null
	 */
	java.lang.String getMessage(); 

}
