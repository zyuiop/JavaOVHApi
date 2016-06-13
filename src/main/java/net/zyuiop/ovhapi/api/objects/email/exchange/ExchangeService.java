package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange service
 */

public interface ExchangeService { 

	/**
	 * @return Update date
	 */
	java.util.Date getLastUpdateDate(); 

	/**
	 * @return null
	 */
	java.lang.String getOffer(); 

	/**
	 * @return null
	 */
	java.lang.String getHostname(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return Maximum message size that You can receive in MB
	 */
	long getMaxReceiveSize(); 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return minimum number of characters password must contain
	 */
	long getMinPasswordLength(); 

	/**
	 * @return enable policy for strong and secure passwords
	 */
	boolean getComplexityEnabled(); 

	/**
	 * @return number of minutes account will remain locked if it occurs
	 */
	long getLockoutDuration(); 

	/**
	 * @return service displayName
	 */
	java.lang.String getDisplayName(); 

	/**
	 * @return Maximum message size that You can send in MB
	 */
	long getMaxSendSize(); 

	/**
	 * @return number of minutes that must elapse after a failed logon to reset lockout trigger
	 */
	long getLockoutObservationWindow(); 

	/**
	 * @return number of attempts before account to be locked
	 */
	long getLockoutThreshold(); 

	/**
	 * @return minimum number of days before able to change account's password
	 */
	long getMinPasswordAge(); 

	/**
	 * @return maximum number of days that account's password is valid before expiration
	 */
	long getMaxPasswordAge(); 

	/**
	 * @return Task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return null
	 */
	java.util.Date getSslExpirationDate(); 

}
