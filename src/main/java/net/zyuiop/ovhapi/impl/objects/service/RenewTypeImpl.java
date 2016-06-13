package net.zyuiop.ovhapi.impl.objects.service;

import net.zyuiop.ovhapi.api.objects.service.RenewType;
/**
 * Map a possible renew for a specific service
 */

public class RenewTypeImpl implements RenewType { 

	private long period;
	private boolean forced;
	private boolean automatic;
	private boolean deleteAtExpiration;

	public RenewTypeImpl() {
	}

	public long getPeriod() { 
		return this.period;
	} 

	public void setPeriod(long period) { 
		this.period = period;
	} 

	public RenewTypeImpl period(long period) { 
		this.period = period;
		return this;
	} 

	public boolean getForced() { 
		return this.forced;
	} 

	public void setForced(boolean forced) { 
		this.forced = forced;
	} 

	public RenewTypeImpl forced(boolean forced) { 
		this.forced = forced;
		return this;
	} 

	public boolean getAutomatic() { 
		return this.automatic;
	} 

	public void setAutomatic(boolean automatic) { 
		this.automatic = automatic;
	} 

	public RenewTypeImpl automatic(boolean automatic) { 
		this.automatic = automatic;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public RenewTypeImpl deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

}
