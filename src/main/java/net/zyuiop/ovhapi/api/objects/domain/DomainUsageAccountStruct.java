package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Structure of usage account
 */

public interface DomainUsageAccountStruct { 

	/**
	 * @return Size of mailbox (bytes)
	 */
	long getQuota(); 

	/**
	 * @return Number of message in mailbox
	 */
	long getEmailCount(); 

	/**
	 * @return Timestamp
	 */
	java.util.Date getDate(); 

}
