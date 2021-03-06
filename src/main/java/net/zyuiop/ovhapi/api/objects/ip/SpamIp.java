package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP spam stats
 */

public class SpamIp { 

	private long time;
	private java.util.Date date;
	private java.lang.String ipSpamming;
	private java.lang.String state;

	public SpamIp() {
	}

	public long getTime() { 
		return this.time;
	} 

	public void setTime(long time) { 
		this.time = time;
	} 

	public SpamIp time(long time) { 
		this.time = time;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public SpamIp date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getIpSpamming() { 
		return this.ipSpamming;
	} 

	public void setIpSpamming(java.lang.String ipSpamming) { 
		this.ipSpamming = ipSpamming;
	} 

	public SpamIp ipSpamming(java.lang.String ipSpamming) { 
		this.ipSpamming = ipSpamming;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public SpamIp state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
