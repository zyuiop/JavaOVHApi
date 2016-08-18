package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceMetrics
 */

public class InstanceMetrics { 

	private java.lang.String unit;
	private net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue[] values;

	public InstanceMetrics() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public InstanceMetrics unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue[] getValues() { 
		return this.values;
	} 

	public void setValues(net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue[] values) { 
		this.values = values;
	} 

	public InstanceMetrics values(net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue[] values) { 
		this.values = values;
		return this;
	} 

}
