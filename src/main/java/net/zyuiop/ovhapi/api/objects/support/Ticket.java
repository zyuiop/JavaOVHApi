package net.zyuiop.ovhapi.api.objects.support;

/**
 * Support Ticket
 */

public interface Ticket { 

	/**
	 * @return Ticket identifier
	 */
	long getTicketId(); 

	/**
	 * @return Customer account identifier
	 */
	java.lang.String getAccountId(); 

	/**
	 * @return Ticket last update date
	 */
	java.util.Date getUpdateDate(); 

	/**
	 * @return Ticket subject
	 */
	java.lang.String getSubject(); 

	/**
	 * @return Sender type of last message
	 */
	java.lang.String getLastMessageFrom(); 

	/**
	 * @return Name of service concerned by ticket
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Ticket external number
	 */
	long getTicketNumber(); 

	/**
	 * @return State of ticket
	 */
	java.lang.String getState(); 

	/**
	 * @return Ticket creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Ticket request category
	 */
	java.lang.String getCategory(); 

	/**
	 * @return Product service concerned by ticket
	 */
	java.lang.String getProduct(); 

	/**
	 * @return Ticket type
	 */
	java.lang.String getType(); 

}
