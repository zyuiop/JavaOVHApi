package net.zyuiop.ovhapi.api.objects.billing;

/**
 * SEPA bank account info
 */

public interface BankAccount { 

	/**
	 * @return null
	 */
	java.lang.String getValidationDocumentLink(); 

	/**
	 * @return null
	 */
	java.lang.String getUniqueReference(); 

	/**
	 * @return null
	 */
	boolean getDefaultPaymentMean(); 

	/**
	 * @return Custom description of this account
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return null
	 */
	java.util.Date getMandateSignatureDate(); 

	/**
	 * @return null
	 */
	java.lang.String getIban(); 

	/**
	 * @return null
	 */
	java.lang.String getOwnerName(); 

	/**
	 * @return null
	 */
	java.lang.String getOwnerAddress(); 

	/**
	 * @return null
	 */
	long getId(); 

}
