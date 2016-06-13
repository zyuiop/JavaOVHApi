package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get protocol status on that mailbox
 */

public interface ExchangeAccountProtocol { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return POP protocol enabled on that mailbox
	 */
	boolean getPOP(); 

	/**
	 * @return Mobile access enabled on that mailbox
	 */
	boolean getActiveSync(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

	/**
	 * @return IMAP protocol enabled on that mailbox
	 */
	boolean getIMAP(); 

	/**
	 * @return Web mail enabled on that mailbox
	 */
	boolean getWebMail(); 

}
