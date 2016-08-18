package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * A structure describing type of a stats hash
 */

public class StatsDataType { 

	private java.util.Date date;
	private long value;

	public StatsDataType() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public StatsDataType date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getValue() { 
		return this.value;
	} 

	public void setValue(long value) { 
		this.value = value;
	} 

	public StatsDataType value(long value) { 
		this.value = value;
		return this;
	} 

}
