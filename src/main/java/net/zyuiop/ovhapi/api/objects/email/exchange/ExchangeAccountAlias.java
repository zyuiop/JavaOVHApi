package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Aliases on this mailbox
 */

public interface ExchangeAccountAlias { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Alias
	 */
	java.lang.String getAlias(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
