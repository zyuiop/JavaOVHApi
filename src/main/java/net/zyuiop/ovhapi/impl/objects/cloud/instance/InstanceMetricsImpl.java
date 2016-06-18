package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetrics;
/**
 * InstanceMetrics
 */

public class InstanceMetricsImpl implements InstanceMetrics { 

	private java.lang.String unit;
	private net.zyuiop.ovhapi.impl.objects.cloud.instance.InstanceMetricsValueImpl[] values;

	public InstanceMetricsImpl() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public InstanceMetricsImpl unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.instance.InstanceMetricsValueImpl[] getValues() { 
		return this.values;
	} 

	public void setValues(net.zyuiop.ovhapi.impl.objects.cloud.instance.InstanceMetricsValueImpl[] values) { 
		this.values = values;
	} 

	public InstanceMetricsImpl values(net.zyuiop.ovhapi.impl.objects.cloud.instance.InstanceMetricsValueImpl[] values) { 
		this.values = values;
		return this;
	} 

}
