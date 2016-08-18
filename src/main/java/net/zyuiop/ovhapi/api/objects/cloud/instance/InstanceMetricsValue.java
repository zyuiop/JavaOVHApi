package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceMetricsValue
 */

public class InstanceMetricsValue { 

	private long timestamp;
	private double value;

	public InstanceMetricsValue() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public InstanceMetricsValue timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public InstanceMetricsValue value(double value) { 
		this.value = value;
		return this;
	} 

}
