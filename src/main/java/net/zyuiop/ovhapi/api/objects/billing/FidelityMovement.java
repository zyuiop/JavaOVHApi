package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a fidelity account
 */

public interface FidelityMovement { 

	/**
	 * @return null
	 */
	long getMovementId(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	long getAmount(); 

	/**
	 * @return null
	 */
	long getBalance(); 

	/**
	 * @return null
	 */
	long getOrder(); 

	/**
	 * @return null
	 */
	java.lang.String getOperation(); 

	/**
	 * @return null
	 */
	long getPreviousBalance(); 

}
