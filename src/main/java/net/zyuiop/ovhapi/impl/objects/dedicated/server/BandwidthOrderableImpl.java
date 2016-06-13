package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.BandwidthOrderable;
/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */

public class BandwidthOrderableImpl implements BandwidthOrderable { 

	private long[] ultimate;
	private long[] premium;
	private boolean orderable;
	private long[] platinum;

	public BandwidthOrderableImpl() {
	}

	public long[] getUltimate() { 
		return this.ultimate;
	} 

	public void setUltimate(long[] ultimate) { 
		this.ultimate = ultimate;
	} 

	public BandwidthOrderableImpl ultimate(long[] ultimate) { 
		this.ultimate = ultimate;
		return this;
	} 

	public long[] getPremium() { 
		return this.premium;
	} 

	public void setPremium(long[] premium) { 
		this.premium = premium;
	} 

	public BandwidthOrderableImpl premium(long[] premium) { 
		this.premium = premium;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public BandwidthOrderableImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

	public long[] getPlatinum() { 
		return this.platinum;
	} 

	public void setPlatinum(long[] platinum) { 
		this.platinum = platinum;
	} 

	public BandwidthOrderableImpl platinum(long[] platinum) { 
		this.platinum = platinum;
		return this;
	} 

}
