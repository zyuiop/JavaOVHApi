package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */

public class BandwidthOrderable { 

	private long[] ultimate;
	private long[] premium;
	private boolean orderable;
	private long[] platinum;

	public BandwidthOrderable() {
	}

	public long[] getUltimate() { 
		return this.ultimate;
	} 

	public void setUltimate(long[] ultimate) { 
		this.ultimate = ultimate;
	} 

	public BandwidthOrderable ultimate(long[] ultimate) { 
		this.ultimate = ultimate;
		return this;
	} 

	public long[] getPremium() { 
		return this.premium;
	} 

	public void setPremium(long[] premium) { 
		this.premium = premium;
	} 

	public BandwidthOrderable premium(long[] premium) { 
		this.premium = premium;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public BandwidthOrderable orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

	public long[] getPlatinum() { 
		return this.platinum;
	} 

	public void setPlatinum(long[] platinum) { 
		this.platinum = platinum;
	} 

	public BandwidthOrderable platinum(long[] platinum) { 
		this.platinum = platinum;
		return this;
	} 

}
