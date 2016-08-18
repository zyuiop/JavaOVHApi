package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /support APIs
 */

public interface Support { 

	/**
	 * Reply to ticket
	 * Facultative parameters ? false
	 * @param ticketId internal ticket identifier
	 * @param body text body of ticket response
	*/
	void postTicketsTicketIdReply(long ticketId, java.lang.String body) throws java.io.IOException;

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

}
