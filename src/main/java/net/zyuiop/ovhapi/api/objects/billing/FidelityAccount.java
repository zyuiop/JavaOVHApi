package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Balance of the fidelity account
 */

public interface FidelityAccount { 

	/**
	 * @return null
	 */
	long getAlertThreshold(); 

	/**
	 * @return null
	 */
	long getBalance(); 

	/**
	 * @return null
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return null
	 */
	boolean getCanBeCredited(); 

	/**
	 * @return null
	 */
	java.util.Date getOpenDate(); 

}
