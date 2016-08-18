package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * A value associated to a timestamp
 */

public class TimestampAndValue { 

	private long timestamp;
	private double value;

	public TimestampAndValue() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public TimestampAndValue timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public TimestampAndValue value(double value) { 
		this.value = value;
		return this;
	} 

}
