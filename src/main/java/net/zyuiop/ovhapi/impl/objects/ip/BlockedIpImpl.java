package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.BlockedIp;
/**
 * Blocked IP information
 */

public class BlockedIpImpl implements BlockedIp { 

	private java.lang.String ipBlocked;
	private java.util.Date blockedSince;
	private long time;
	private java.lang.String logs;
	private java.lang.String state;

	public BlockedIpImpl() {
	}

	public java.lang.String getIpBlocked() { 
		return this.ipBlocked;
	} 

	public void setIpBlocked(java.lang.String ipBlocked) { 
		this.ipBlocked = ipBlocked;
	} 

	public BlockedIpImpl ipBlocked(java.lang.String ipBlocked) { 
		this.ipBlocked = ipBlocked;
		return this;
	} 

	public java.util.Date getBlockedSince() { 
		return this.blockedSince;
	} 

	public void setBlockedSince(java.util.Date blockedSince) { 
		this.blockedSince = blockedSince;
	} 

	public BlockedIpImpl blockedSince(java.util.Date blockedSince) { 
		this.blockedSince = blockedSince;
		return this;
	} 

	public long getTime() { 
		return this.time;
	} 

	public void setTime(long time) { 
		this.time = time;
	} 

	public BlockedIpImpl time(long time) { 
		this.time = time;
		return this;
	} 

	public java.lang.String getLogs() { 
		return this.logs;
	} 

	public void setLogs(java.lang.String logs) { 
		this.logs = logs;
	} 

	public BlockedIpImpl logs(java.lang.String logs) { 
		this.logs = logs;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public BlockedIpImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
