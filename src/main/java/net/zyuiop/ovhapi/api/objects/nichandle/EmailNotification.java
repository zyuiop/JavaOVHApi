package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Email notification
 */

public interface EmailNotification { 

	/**
	 * @return This email body
	 */
	java.lang.String getBody(); 

	/**
	 * @return This email subject
	 */
	java.lang.String getSubject(); 

	/**
	 * @return This email date
	 */
	java.util.Date getDate(); 

	/**
	 * @return This email Id
	 */
	long getId(); 

}
