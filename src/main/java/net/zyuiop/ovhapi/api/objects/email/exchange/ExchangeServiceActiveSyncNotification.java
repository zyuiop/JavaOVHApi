package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get email addresses subscribed to ActiveSync quarantine notifications
 */

public interface ExchangeServiceActiveSyncNotification { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Notified Account Id
	 */
	long getNotifiedAccountId(); 

	/**
	 * @return Primary email address for notified account
	 */
	java.lang.String getPrimaryEmailAddress(); 

	/**
	 * @return Email state
	 */
	java.lang.String getState(); 

}
