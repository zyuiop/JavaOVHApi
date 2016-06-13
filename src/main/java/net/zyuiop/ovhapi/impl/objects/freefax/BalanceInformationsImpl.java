package net.zyuiop.ovhapi.impl.objects.freefax;

import net.zyuiop.ovhapi.api.objects.freefax.BalanceInformations;
/**
 * Return credit balance informations structure
 */

public class BalanceInformationsImpl implements BalanceInformations { 

	private long faxs;
	private long points;

	public BalanceInformationsImpl() {
	}

	public long getFaxs() { 
		return this.faxs;
	} 

	public void setFaxs(long faxs) { 
		this.faxs = faxs;
	} 

	public BalanceInformationsImpl faxs(long faxs) { 
		this.faxs = faxs;
		return this;
	} 

	public long getPoints() { 
		return this.points;
	} 

	public void setPoints(long points) { 
		this.points = points;
	} 

	public BalanceInformationsImpl points(long points) { 
		this.points = points;
		return this;
	} 

}
