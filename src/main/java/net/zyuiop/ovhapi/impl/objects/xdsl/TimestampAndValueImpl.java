package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.TimestampAndValue;
/**
 * A value associated to a timestamp
 */

public class TimestampAndValueImpl implements TimestampAndValue { 

	private long timestamp;
	private double value;

	public TimestampAndValueImpl() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public TimestampAndValueImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public TimestampAndValueImpl value(double value) { 
		this.value = value;
		return this;
	} 

}
