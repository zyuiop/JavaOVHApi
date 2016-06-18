package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /support APIs
 */

public interface Support { 

	/**
	 * Create a new ticket
	 * Facultative parameters ? true
	 * @param body Ticket message body
	 * @param subject Ticket message subject
	 * @param type Ticket type (criticalIntervention requires VIP support level)
	 * @param serviceName Ticket message service name
	 * @param category Ticket message category
	 * @param product Ticket message product
	*/
	net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type, java.lang.String serviceName, java.lang.String category, java.lang.String product) throws java.io.IOException;

	/**
	 * Create a new ticket
	 * Facultative parameters ? false
	 * @param body Ticket message body
	 * @param subject Ticket message subject
	 * @param type Ticket type (criticalIntervention requires VIP support level)
	*/
	net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type) throws java.io.IOException;

	/**
	 * Close ticket
	 * Facultative parameters ? false
	 * @param ticketId internal ticket identifier
	*/
	void postTicketsTicketIdClose(long ticketId) throws java.io.IOException;

	/**
	 * Reopen a ticket
	 * Facultative parameters ? false
	 * @param ticketId internal ticket identifier
	 * @param body ticket reopen reason
	*/
	void postTicketsTicketIdReopen(long ticketId, java.lang.String body) throws java.io.IOException;

	/**
	 * Reply to ticket
	 * Facultative parameters ? false
	 * @param ticketId internal ticket identifier
	 * @param body text body of ticket response
	*/
	void postTicketsTicketIdReply(long ticketId, java.lang.String body) throws java.io.IOException;

	/**
	 * Get ticket
	 * Facultative parameters ? false
	 * @param ticketId internal identifier ticket
	*/
	net.zyuiop.ovhapi.api.objects.support.Ticket getTicketsTicketId(long ticketId) throws java.io.IOException;

	/**
	 * List support tickets identifiers for this service
	 * Facultative parameters ? true
	 * @param minCreationDate Minimum creation date
	 * @param subject Search by ticket subject
	 * @param status Status of ticket
	 * @param serviceName Ticket message service name
	 * @param maxCreationDate Maximum creation date
	 * @param category Search by ticket category
	 * @param product Search by ticket product
	*/
	long[] getTickets(java.util.Date minCreationDate, java.lang.String subject, java.lang.String status, java.lang.String serviceName, java.util.Date maxCreationDate, java.lang.String category, java.lang.String product) throws java.io.IOException;

	/**
	 * List support tickets identifiers for this service
	 * Facultative parameters ? false
	*/
	long[] getTickets() throws java.io.IOException;

	/**
	 * Get ticket messages
	 * Facultative parameters ? false
	 * @param ticketId internal ticket identifier
	*/
	net.zyuiop.ovhapi.api.objects.support.Message[] getTicketsTicketIdMessages(long ticketId) throws java.io.IOException;

}
