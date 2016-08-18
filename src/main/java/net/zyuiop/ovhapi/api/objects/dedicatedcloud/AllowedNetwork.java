package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Network allowed to connect to the Dedicated Cloud management interface
 */

public class AllowedNetwork { 

	private long networkAccessId;
	private java.lang.String network;
	private java.lang.String state;

	public AllowedNetwork() {
	}

	public long getNetworkAccessId() { 
		return this.networkAccessId;
	} 

	public void setNetworkAccessId(long networkAccessId) { 
		this.networkAccessId = networkAccessId;
	} 

	public AllowedNetwork networkAccessId(long networkAccessId) { 
		this.networkAccessId = networkAccessId;
		return this;
	} 

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public AllowedNetwork network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public AllowedNetwork state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
