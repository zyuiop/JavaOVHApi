package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list members
 */

public interface ExchangeDistributionGroupMember { 

	/**
	 * @return Member account id
	 */
	long getMemberContactId(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Member account id
	 */
	long getMemberAccountId(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

	/**
	 * @return Member account primaryEmailAddress
	 */
	java.lang.String getMemberEmailAddress(); 

}
