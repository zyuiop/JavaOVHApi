package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud alerting consumption
 */

public interface Alerting { 

	/**
	 * @return Email to contact
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Monthly threshold for this alerting
	 */
	long getMonthlyThreshold(); 

	/**
	 * @return Alerting creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Delay between alerts in seconds
	 */
	long getDelay(); 

	/**
	 * @return Alerting unique UUID
	 */
	java.lang.String getId(); 

	/**
	 * @return Formatted monthly threshold for this alerting
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getFormattedMonthlyThreshold(); 

}
