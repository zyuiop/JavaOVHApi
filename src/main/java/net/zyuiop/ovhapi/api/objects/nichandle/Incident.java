package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all your ticket incident messages
 */

public interface Incident { 

	/**
	 * @return This ticket id
	 */
	long getTicketId(); 

	/**
	 * @return Ticket domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Ticket incident subject
	 */
	java.lang.String getSubject(); 

	/**
	 * @return Ticket open date
	 */
	java.util.Date getOpenDate(); 

	/**
	 * @return ticket current status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Ticket incident category 
	 */
	java.lang.String getCategory(); 

	/**
	 * @return Ticket close date
	 */
	java.util.Date getCloseDate(); 

}
