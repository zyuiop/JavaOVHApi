package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.VpsTimestampValue;
/**
 * A timestamp associated to a value
 */

public class VpsTimestampValueImpl implements VpsTimestampValue { 

	private long timestamp;
	private double value;

	public VpsTimestampValueImpl() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public VpsTimestampValueImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public double getValue() { 
		return this.value;
	} 

	public void setValue(double value) { 
		this.value = value;
	} 

	public VpsTimestampValueImpl value(double value) { 
		this.value = value;
		return this;
	} 

}
