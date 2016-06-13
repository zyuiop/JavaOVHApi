package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos;
/**
 * Auto renewal information
 */

public class NicAutorenewInfosImpl implements NicAutorenewInfos { 

	private java.util.Date lastRenew;
	private boolean active;
	private long renewDay;

	public NicAutorenewInfosImpl() {
	}

	public java.util.Date getLastRenew() { 
		return this.lastRenew;
	} 

	public void setLastRenew(java.util.Date lastRenew) { 
		this.lastRenew = lastRenew;
	} 

	public NicAutorenewInfosImpl lastRenew(java.util.Date lastRenew) { 
		this.lastRenew = lastRenew;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public NicAutorenewInfosImpl active(boolean active) { 
		this.active = active;
		return this;
	} 

	public long getRenewDay() { 
		return this.renewDay;
	} 

	public void setRenewDay(long renewDay) { 
		this.renewDay = renewDay;
	} 

	public NicAutorenewInfosImpl renewDay(long renewDay) { 
		this.renewDay = renewDay;
		return this;
	} 

}
