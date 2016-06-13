package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Message details
 */

public interface SupportContent { 

	/**
	 * @return Message date
	 */
	java.util.Date getDate(); 

	/**
	 * @return Message type
	 */
	java.lang.String getType(); 

	/**
	 * @return Message content
	 */
	java.lang.String getMessage(); 

}
