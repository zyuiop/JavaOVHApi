package net.zyuiop.ovhapi.impl.objects.cdn.website;

import net.zyuiop.ovhapi.api.objects.cdn.website.StatsDataType;
/**
 * A structure describing type of a stats hash
 */

public class StatsDataTypeImpl implements StatsDataType { 

	private java.util.Date date;
	private long value;

	public StatsDataTypeImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public StatsDataTypeImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getValue() { 
		return this.value;
	} 

	public void setValue(long value) { 
		this.value = value;
	} 

	public StatsDataTypeImpl value(long value) { 
		this.value = value;
		return this;
	} 

}
