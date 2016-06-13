package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about quota informations
 */

public interface Quota { 

	/**
	 * @return null
	 */
	java.lang.String getQuotaStatus(); 

	/**
	 * @return null
	 */
	double getQuotaLeft(); 

}
