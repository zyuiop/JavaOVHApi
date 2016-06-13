package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue;
/**
 * A ip value associated to a datetime
 */

public class DatetimeAndIpvalueImpl implements DatetimeAndIpvalue { 

	private java.lang.String ip;
	private java.util.Date datetime;

	public DatetimeAndIpvalueImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DatetimeAndIpvalueImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public DatetimeAndIpvalueImpl datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

}
