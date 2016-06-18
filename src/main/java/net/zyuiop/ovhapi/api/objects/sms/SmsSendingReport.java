package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about quota informations
 */

public interface SmsSendingReport { 

	/**
	 * @return null
	 */
	double getTotalCreditsRemoved(); 

	/**
	 * @return null
	 */
	java.lang.String[] getInvalidReceivers(); 

	/**
	 * @return null
	 */
	long[] getIds(); 

	/**
	 * @return null
	 */
	java.lang.String[] getValidReceivers(); 

}
