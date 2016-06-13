package net.zyuiop.ovhapi.api.objects.support;

/**
 * Newly created support identifiers
 */

public interface NewMessageInfo { 

	/**
	 * @return Ticket identifier
	 */
	long getTicketId(); 

	/**
	 * @return Message identifier
	 */
	long getMessageId(); 

	/**
	 * @return Ticket external number
	 */
	long getTicketNumber(); 

}
