package net.zyuiop.ovhapi.api.objects.freefax;

/**
 * Return credit balance informations structure
 */

public class BalanceInformations { 

	private long faxs;
	private long points;

	public BalanceInformations() {
	}

	public long getFaxs() { 
		return this.faxs;
	} 

	public void setFaxs(long faxs) { 
		this.faxs = faxs;
	} 

	public BalanceInformations faxs(long faxs) { 
		this.faxs = faxs;
		return this;
	} 

	public long getPoints() { 
		return this.points;
	} 

	public void setPoints(long points) { 
		this.points = points;
	} 

	public BalanceInformations points(long points) { 
		this.points = points;
		return this;
	} 

}
