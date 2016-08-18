package net.zyuiop.ovhapi.api.objects.service;

/**
 * Map a possible renew for a specific service
 */

public class RenewType { 

	private long period;
	private boolean forced;
	private boolean automatic;
	private boolean deleteAtExpiration;

	public RenewType() {
	}

	public long getPeriod() { 
		return this.period;
	} 

	public void setPeriod(long period) { 
		this.period = period;
	} 

	public RenewType period(long period) { 
		this.period = period;
		return this;
	} 

	public boolean getForced() { 
		return this.forced;
	} 

	public void setForced(boolean forced) { 
		this.forced = forced;
	} 

	public RenewType forced(boolean forced) { 
		this.forced = forced;
		return this;
	} 

	public boolean getAutomatic() { 
		return this.automatic;
	} 

	public void setAutomatic(boolean automatic) { 
		this.automatic = automatic;
	} 

	public RenewType automatic(boolean automatic) { 
		this.automatic = automatic;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public RenewType deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

}
