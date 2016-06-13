package net.zyuiop.ovhapi.api.objects.agreements;

/**
 * Contract of service
 */

public interface Contract { 

	/**
	 * @return Date the contract was created on
	 */
	java.util.Date getDate(); 

	/**
	 * @return Full text of the contract
	 */
	java.lang.String getText(); 

	/**
	 * @return URL you can download the contract at
	 */
	java.lang.String getPdf(); 

	/**
	 * @return Name of of the contract
	 */
	java.lang.String getName(); 

	/**
	 * @return Is this contract currently active or not ?
	 */
	boolean getActive(); 

}
