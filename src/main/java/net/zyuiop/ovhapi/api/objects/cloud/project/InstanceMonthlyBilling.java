package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instance monthly billing details
 */

public interface InstanceMonthlyBilling { 

	/**
	 * @return Cost
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getCost(); 

	/**
	 * @return Monthly billing activation date
	 */
	java.util.Date getActivatedOn(); 

}
