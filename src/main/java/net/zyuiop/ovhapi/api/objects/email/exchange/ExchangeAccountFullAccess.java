package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Users having full access on this mailbox
 */

public interface ExchangeAccountFullAccess { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Account id to give full access
	 */
	long getAllowedAccountId(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
