package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange account license per day
 */

public interface DailyLicense { 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	long getOutlookQuantity(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense getAccountLicense(); 

}
