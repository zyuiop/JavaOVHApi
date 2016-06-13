package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Details about the resiliation
 */

public interface ResiliationFollowUpDetail { 

	/**
	 * @return Status of the resiliation
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Date when the resiliation will take effect
	 */
	java.util.Date getDateTodo(); 

	/**
	 * @return If the customer needs to return his modem
	 */
	boolean getNeedModemReturn(); 

	/**
	 * @return Date when the resiliation was done
	 */
	java.util.Date getRegistrationDate(); 

}
