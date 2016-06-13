package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Protocol access policy for this Exchange service
 */

public interface ExchangeServiceProtocol { 

	/**
	 * @return POP protocol enabled on this Exchange service
	 */
	boolean getPOP(); 

	/**
	 * @return Web mail protocol enabled on this Exchange service
	 */
	boolean getWebMail(); 

	/**
	 * @return ActiveSync policy to apply at device's first connection
	 */
	java.lang.String getActiveSyncPolicy(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Last update date
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return ActiveSync protocol enabled on this Exchange service
	 */
	boolean getActiveSync(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

	/**
	 * @return IMAP protocol enabled on this Exchange service
	 */
	boolean getIMAP(); 

}
