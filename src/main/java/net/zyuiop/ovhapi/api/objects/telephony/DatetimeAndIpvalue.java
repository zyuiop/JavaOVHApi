package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * A ip value associated to a datetime
 */

public class DatetimeAndIpvalue { 

	private java.lang.String ip;
	private java.util.Date datetime;

	public DatetimeAndIpvalue() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DatetimeAndIpvalue ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public DatetimeAndIpvalue datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

}
