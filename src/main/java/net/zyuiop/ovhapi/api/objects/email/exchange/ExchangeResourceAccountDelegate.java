package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Resource accounts delegates
 */

public interface ExchangeResourceAccountDelegate { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return delegate's account id
	 */
	long getAllowedAccountId(); 

	/**
	 * @return Delegate account primaryEmailAddress
	 */
	java.lang.String getDelegateEmailAddress(); 

	/**
	 * @return task pending id
	 */
	long getTaskPendingId(); 

}
