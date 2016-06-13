package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * SMS notifications
 */

public interface NichandleSmsNotification { 

	/**
	 * @return Last update date
	 */
	java.util.Date getUpdateDate(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Status of your notification
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Receive notification for abuse reports
	 */
	boolean getAbuse(); 

	/**
	 * @return The phone number you want to receive notification on
	 */
	java.lang.String getPhoneNumber(); 

}
