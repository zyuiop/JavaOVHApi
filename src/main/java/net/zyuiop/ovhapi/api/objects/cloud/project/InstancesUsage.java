package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instances usage for current month
 */

public interface InstancesUsage { 

	/**
	 * @return Instance usage details
	 */
	net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail getDetail(); 

	/**
	 * @return Total cost for the instances
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotal(); 

}
