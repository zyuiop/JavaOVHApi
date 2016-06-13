package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceMetricsValue;
/**
 * InstanceMetricsValue
 */

public class InstanceMetricsValueImpl implements InstanceMetricsValue { 

	private long timestamp;
	private double value;

	public InstanceMetricsValueImpl() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public InstanceMetricsValueImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public InstanceMetricsValueImpl value(double value) { 
		this.value = value;
		return this;
	} 

}
