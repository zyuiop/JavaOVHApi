package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange shared mailbox
 */

public interface SharedAccount { 

	/**
	 * @return Shared account maximum size
	 */
	long getQuota(); 

	/**
	 * @return Ticket number of spam detection
	 */
	long getSpamTicketNumber(); 

	/**
	 * @return Hide shared account in Global Address List
	 */
	boolean getHiddenFromGAL(); 

	/**
	 * @return Shared account state
	 */
	java.lang.String getState(); 

	/**
	 * @return Shared mailbox usage
	 */
	long getCurrentUsage(); 

	/**
	 * @return Last logon
	 */
	java.util.Date getLastLogonDate(); 

	/**
	 * @return Enable or disable anti-virus and anti-spam
	 */
	java.lang.String[] getMailingFilter(); 

	/**
	 * @return Shared account last name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return Shared account id
	 */
	long getId(); 

	/**
	 * @return Default email for this shared mailbox
	 */
	java.lang.String getSharedEmailAddress(); 

	/**
	 * @return Shared account display name
	 */
	java.lang.String getDisplayName(); 

	/**
	 * @return Shared account first name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return Shared account initials
	 */
	java.lang.String getInitials(); 

	/**
	 * @return Account was sending spam
	 */
	boolean getSpamDetected(); 

	/**
	 * @return Last logoff
	 */
	java.util.Date getLastLogoffDate(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Pending tasks for this shared account
	 */
	long getTaskPendingId(); 

}
