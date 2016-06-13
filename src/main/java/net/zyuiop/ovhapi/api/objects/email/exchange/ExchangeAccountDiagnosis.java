package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange Account Diagnosis
 */

public interface ExchangeAccountDiagnosis { 

	/**
	 * @return Determines if account is flagged as spammer
	 */
	boolean getIsSpammer(); 

	/**
	 * @return Determines if account is suspended
	 */
	boolean getIsSuspended(); 

	/**
	 * @return Determines if account is locked
	 */
	boolean getIsLocked(); 

	/**
	 * @return Last performed diagnostics date
	 */
	java.util.Date getLastCheck(); 

	/**
	 * @return Determines if possible to authenticate with credentials
	 */
	boolean getConnectiveOWA(); 

}
