package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Account List
 */

public interface AccountDelegated { 

	/**
	 * @return If true your account is blocked
	 */
	boolean getIsBlocked(); 

	/**
	 * @return Email
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Name of domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Account description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Name of account
	 */
	java.lang.String getAccountName(); 

	/**
	 * @return Size of your account in bytes
	 */
	long getSize(); 

}
