package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get aliases on this mailingList
 */

public interface ExchangeMailingListAlias { 

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
