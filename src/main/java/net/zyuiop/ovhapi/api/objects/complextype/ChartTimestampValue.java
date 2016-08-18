package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A timestamp associated to a value
 */

public class ChartTimestampValue { 

	private long timestamp;
	private double value;

	public ChartTimestampValue() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public ChartTimestampValue timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public ChartTimestampValue value(double value) { 
		this.value = value;
		return this;
	} 

}
