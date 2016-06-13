package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Users authorized to send mails from this mailbox
 */

public interface ExchangeAccountSendAs { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Account id to give send as
	 */
	long getAllowedAccountId(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
