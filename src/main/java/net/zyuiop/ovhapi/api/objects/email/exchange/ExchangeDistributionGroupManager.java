package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list managers
 */

public interface ExchangeDistributionGroupManager { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Manager account id
	 */
	long getManagerAccountId(); 

	/**
	 * @return Member account primaryEmailAddress
	 */
	java.lang.String getManagerEmailAddress(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
