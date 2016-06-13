package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Paypal account info
 */

public interface Paypal { 

	/**
	 * @return null
	 */
	java.lang.String getEmail(); 

	/**
	 * @return null
	 */
	java.lang.String getAgreementId(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	boolean getDefaultPaymentMean(); 

	/**
	 * @return Custom description of this account
	 */
	java.lang.String getDescription(); 

}
