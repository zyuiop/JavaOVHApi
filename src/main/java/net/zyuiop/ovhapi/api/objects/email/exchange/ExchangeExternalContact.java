package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * External contact for this exchange service
 */

public interface ExchangeExternalContact { 

	/**
	 * @return Contact initals
	 */
	java.lang.String getInitials(); 

	/**
	 * @return Contact first name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return Hide the contact in Global Address List
	 */
	boolean getHiddenFromGAL(); 

	/**
	 * @return If specified, indicates to which organization this external contact belongs (Exchange 2010 only)
	 */
	java.lang.String getOrganization2010(); 

	/**
	 * @return Contact state
	 */
	java.lang.String getState(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Contact id
	 */
	long getId(); 

	/**
	 * @return Contact last name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return Task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return Contact email
	 */
	java.lang.String getExternalEmailAddress(); 

	/**
	 * @return Contact display name
	 */
	java.lang.String getDisplayName(); 

}
