package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a payment
 */

public interface Payment { 

	/**
	 * @return null
	 */
	java.util.Date getPaymentDate(); 

	/**
	 * @return null
	 */
	java.lang.String getPaymentIdentifier(); 

	/**
	 * @return null
	 */
	java.lang.String getPaymentType(); 

}
