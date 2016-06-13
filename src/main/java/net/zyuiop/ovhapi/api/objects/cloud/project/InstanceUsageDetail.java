package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instance usage
 */

public interface InstanceUsageDetail { 

	/**
	 * @return Instance id
	 */
	java.lang.String getInstanceId(); 

	/**
	 * @return Reference
	 */
	java.lang.String getReference(); 

	/**
	 * @return Is monthly billing enabled
	 */
	boolean getMonthlyBilling(); 

	/**
	 * @return Hourly price
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getHourly(); 

	/**
	 * @return Monthly price
	 */
	net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling getMonthly(); 

}
