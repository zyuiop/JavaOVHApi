package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceMetrics
 */

public interface InstanceMetrics { 

	/**
	 * @return 
	 */
	java.lang.String getUnit(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue getValues(); 

}
