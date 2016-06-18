package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange mailbox
 */

public interface Account { 

	/**
	 * @return Ticket number of spam detection
	 */
	long getSpamTicketNumber(); 

	/**
	 * @return Account state
	 */
	java.lang.String getState(); 

	/**
	 * @return Mailbox usage
	 */
	long getCurrentUsage(); 

	/**
	 * @return exchangeGuid for manual configuration
	 */
	java.lang.String getExchangeGuid(); 

	/**
	 * @return delete outlook at expiration
	 */
	boolean getDeleteOutlookAtExpiration(); 

	/**
	 * @return Account id
	 */
	long getId(); 

	/**
	 * @return change the renew period for outlook
	 */
	java.lang.String getRenewOutlookPeriod(); 

	/**
	 * @return Outlook licence
	 */
	boolean getOutlookLicense(); 

	/**
	 * @return Account first name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return Default email for this mailbox
	 */
	java.lang.String getPrimaryEmailAddress(); 

	/**
	 * @return Account login
	 */
	java.lang.String getLogin(); 

	/**
	 * @return Time of account's password last update
	 */
	java.util.Date getPasswordLastUpdate(); 

	/**
	 * @return Exchange account type
	 */
	java.lang.String getAccountLicense(); 

	/**
	 * @return delete at expiration
	 */
	boolean getDeleteAtExpiration(); 

	/**
	 * @return Account maximum size
	 */
	long getQuota(); 

	/**
	 * @return Last update
	 */
	java.util.Date getLastUpdateDate(); 

	/**
	 * @return Hide account in Global Address List
	 */
	boolean getHiddenFromGAL(); 

	/**
	 * @return Email domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return change the renew period
	 */
	java.lang.String getRenewPeriod(); 

	/**
	 * @return Last logon
	 */
	java.util.Date getLastLogonDate(); 

	/**
	 * @return Account last name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return GUID for user in active directory
	 */
	java.lang.String getGuid(); 

	/**
	 * @return Enable or disable anti-virus and anti-spam
	 */
	java.lang.String[] getMailingFilter(); 

	/**
	 * @return expiration date
	 */
	java.util.Date getExpirationOutlookDate(); 

	/**
	 * @return Account display name
	 */
	java.lang.String getDisplayName(); 

	/**
	 * @return Account was sending spam
	 */
	boolean getSpamDetected(); 

	/**
	 * @return expiration date
	 */
	java.util.Date getExpirationDate(); 

	/**
	 * @return Last logoff
	 */
	java.util.Date getLastLogoffDate(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Account initials
	 */
	java.lang.String getInitial(); 

	/**
	 * @return SAM account name
	 */
	java.lang.String getSAMAccountName(); 

	/**
	 * @return Pending tasks for this account
	 */
	long getTaskPendingId(); 

}
