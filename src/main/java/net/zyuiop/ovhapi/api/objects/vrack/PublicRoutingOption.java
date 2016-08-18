package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * A structure describing the public routing option
 */

public class PublicRoutingOption { 

	private long bandwidth;

	public PublicRoutingOption() {
	}

	public long getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(long bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public PublicRoutingOption bandwidth(long bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

}
