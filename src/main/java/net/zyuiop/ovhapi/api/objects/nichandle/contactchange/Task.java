package net.zyuiop.ovhapi.api.objects.nichandle.contactchange;

/**
 * Task running a contact change on a service
 */

public interface Task { 

	/**
	 * @return Account to change contact to
	 */
	java.lang.String getToAccount(); 

	/**
	 * @return Account who asked the contact change
	 */
	java.lang.String getAskingAccount(); 

	/**
	 * @return Contacts to be changed
	 */
	java.lang.String getContactTypes(); 

	/**
	 * @return Current state of the request
	 */
	java.lang.String getState(); 

	/**
	 * @return Account to change contact from
	 */
	java.lang.String getFromAccount(); 

	/**
	 * @return Date at which the contact change has been finished
	 */
	java.util.Date getDateDone(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return The service on which the task runs
	 */
	java.lang.String getServiceDomain(); 

	/**
	 * @return Date at which the request has been made
	 */
	java.util.Date getDateRequest(); 

}
