package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * MonthlyBilling
 */

public interface MonthlyBilling { 

	/**
	 * @return Monthly billing activated since
	 */
	java.util.Date getSince(); 

	/**
	 * @return Monthly billing status
	 */
	java.lang.String getStatus(); 

}
