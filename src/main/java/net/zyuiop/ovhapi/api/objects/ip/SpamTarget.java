package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Spam's target information
 */

public interface SpamTarget { 

	/**
	 * @return IP address of the target
	 */
	java.lang.String getDestinationIp(); 

	/**
	 * @return The message-id of the email
	 */
	java.lang.String getMessageId(); 

	/**
	 * @return Timestamp when the email was sent
	 */
	long getDate(); 

	/**
	 * @return Spam score for the email
	 */
	long getSpamscore(); 

}
