package net.zyuiop.ovhapi.impl.objects.complextype;

import net.zyuiop.ovhapi.api.objects.complextype.ChartTimestampValue;
/**
 * A timestamp associated to a value
 */

public class ChartTimestampValueImpl implements ChartTimestampValue { 

	private long timestamp;
	private double value;

	public ChartTimestampValueImpl() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public ChartTimestampValueImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public ChartTimestampValueImpl value(double value) { 
		this.value = value;
		return this;
	} 

}
