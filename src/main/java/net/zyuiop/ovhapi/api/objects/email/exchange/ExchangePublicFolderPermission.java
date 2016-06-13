package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization public folder permission
 */

public interface ExchangePublicFolderPermission { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Account id
	 */
	long getAllowedAccountId(); 

	/**
	 * @return task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return Access right set for the account
	 */
	java.lang.String getAccessRights(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
