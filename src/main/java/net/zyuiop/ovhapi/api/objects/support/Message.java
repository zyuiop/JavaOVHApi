package net.zyuiop.ovhapi.api.objects.support;

/**
 * Support ticket message
 */

public interface Message { 

	/**
	 * @return Ticket identifier
	 */
	long getTicketId(); 

	/**
	 * @return Message identifier
	 */
	long getMessageId(); 

	/**
	 * @return Message body
	 */
	java.lang.String getBody(); 

	/**
	 * @return Message creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Message last update date
	 */
	java.util.Date getUpdateDate(); 

	/**
	 * @return Message sender type
	 */
	java.lang.String getFrom(); 

}
