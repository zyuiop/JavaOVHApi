package net.zyuiop.ovhapi.api.objects.ip;

/**
 * ARP blocked IP information
 */

public class ArpBlockedIp { 

	private java.lang.String ipBlocked;
	private java.util.Date blockedSince;
	private long time;
	private java.lang.String logs;
	private java.lang.String state;

	public ArpBlockedIp() {
	}

	public java.lang.String getIpBlocked() { 
		return this.ipBlocked;
	} 

	public void setIpBlocked(java.lang.String ipBlocked) { 
		this.ipBlocked = ipBlocked;
	} 

	public ArpBlockedIp ipBlocked(java.lang.String ipBlocked) { 
		this.ipBlocked = ipBlocked;
		return this;
	} 

	public java.util.Date getBlockedSince() { 
		return this.blockedSince;
	} 

	public void setBlockedSince(java.util.Date blockedSince) { 
		this.blockedSince = blockedSince;
	} 

	public ArpBlockedIp blockedSince(java.util.Date blockedSince) { 
		this.blockedSince = blockedSince;
		return this;
	} 

	public long getTime() { 
		return this.time;
	} 

	public void setTime(long time) { 
		this.time = time;
	} 

	public ArpBlockedIp time(long time) { 
		this.time = time;
		return this;
	} 

	public java.lang.String getLogs() { 
		return this.logs;
	} 

	public void setLogs(java.lang.String logs) { 
		this.logs = logs;
	} 

	public ArpBlockedIp logs(java.lang.String logs) { 
		this.logs = logs;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ArpBlockedIp state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
