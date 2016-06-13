package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Available automatic payment means
 */

public interface AutomaticPaymentMean { 

	/**
	 * @return Paypal account
	 */
	boolean getPaypal(); 

	/**
	 * @return Bank Account
	 */
	boolean getBankAccount(); 

	/**
	 * @return Credit Card
	 */
	boolean getCreditCard(); 

}
