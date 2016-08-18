package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Auto renewal information
 */

public class NicAutorenewInfos { 

	private java.util.Date lastRenew;
	private boolean active;
	private long renewDay;

	public NicAutorenewInfos() {
	}

	public java.util.Date getLastRenew() { 
		return this.lastRenew;
	} 

	public void setLastRenew(java.util.Date lastRenew) { 
		this.lastRenew = lastRenew;
	} 

	public NicAutorenewInfos lastRenew(java.util.Date lastRenew) { 
		this.lastRenew = lastRenew;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public NicAutorenewInfos active(boolean active) { 
		this.active = active;
		return this;
	} 

	public long getRenewDay() { 
		return this.renewDay;
	} 

	public void setRenewDay(long renewDay) { 
		this.renewDay = renewDay;
	} 

	public NicAutorenewInfos renewDay(long renewDay) { 
		this.renewDay = renewDay;
		return this;
	} 

}
