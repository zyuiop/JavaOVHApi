package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get users authorized to Send On Behalf To mails from this mailing list
 */

public interface ExchangeDistributionGroupSendOnBehalfTo { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Account id to give send on behalf to
	 */
	long getAllowedAccountId(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
