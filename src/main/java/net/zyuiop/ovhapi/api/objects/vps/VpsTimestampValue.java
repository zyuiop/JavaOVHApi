package net.zyuiop.ovhapi.api.objects.vps;

/**
 * A timestamp associated to a value
 */

public class VpsTimestampValue { 

	private long timestamp;
	private double value;

	public VpsTimestampValue() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public VpsTimestampValue timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public VpsTimestampValue value(double value) { 
		this.value = value;
		return this;
	} 

}
