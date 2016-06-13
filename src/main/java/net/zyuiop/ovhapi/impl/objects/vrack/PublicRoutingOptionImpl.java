package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.PublicRoutingOption;
/**
 * A structure describing the public routing option
 */

public class PublicRoutingOptionImpl implements PublicRoutingOption { 

	private long bandwidth;

	public PublicRoutingOptionImpl() {
	}

	public long getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(long bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public PublicRoutingOptionImpl bandwidth(long bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

}
