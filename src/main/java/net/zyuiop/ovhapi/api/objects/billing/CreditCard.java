package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Credit card informations
 */

public interface CreditCard { 

	/**
	 * @return null
	 */
	java.lang.String getNumber(); 

	/**
	 * @return True if this credit card has been registered with a successful 3DSecure challenge
	 */
	boolean getThreeDsValidated(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	java.util.Date getExpirationDate(); 

	/**
	 * @return null
	 */
	boolean getDefaultPaymentMean(); 

	/**
	 * @return Custom description of this account
	 */
	java.lang.String getDescription(); 

}
