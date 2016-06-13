package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list
 */

public interface MailingList { 

	/**
	 * @return Account was sending spam
	 */
	boolean getSpamDetected(); 

	/**
	 * @return Ticket number of spam detection
	 */
	long getSpamTicketNumber(); 

	/**
	 * @return Update date
	 */
	java.util.Date getLastUpdateDate(); 

	/**
	 * @return If true mailing list is hiddend in Global Address List
	 */
	boolean getHiddenFromGAL(); 

	/**
	 * @return Depart restriction policy
	 */
	java.lang.String getDepartRestriction(); 

	/**
	 * @return Join restriction policy
	 */
	java.lang.String getJoinRestriction(); 

	/**
	 * @return The mailing list address
	 */
	java.lang.String getMailingListAddress(); 

	/**
	 * @return Maximum send email size in MB
	 */
	long getMaxSendSize(); 

	/**
	 * @return If true sender has to authenticate
	 */
	boolean getSenderAuthentification(); 

	/**
	 * @return Mailing list state
	 */
	java.lang.String getState(); 

	/**
	 * @return Maximum receive email size in MB
	 */
	long getMaxReceiveSize(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return Name displayed in Global Access List
	 */
	java.lang.String getDisplayName(); 

}
