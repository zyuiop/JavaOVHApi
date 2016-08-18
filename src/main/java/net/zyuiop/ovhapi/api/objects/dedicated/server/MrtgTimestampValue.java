package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A timestamp associated to a value
 */

public class MrtgTimestampValue { 

	private long timestamp;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue value;

	public MrtgTimestampValue() {
	}

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public MrtgTimestampValue timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getValue() { 
		return this.value;
	} 

	public void setValue(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue value) { 
		this.value = value;
	} 

	public MrtgTimestampValue value(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue value) { 
		this.value = value;
		return this;
	} 

}
