package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Users having full access on this shared mailbox
 */

public interface ExchangeSharedAccountFullAccess { 

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
