package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay's network configuration
 */

public class IpInfo { 

	private java.lang.String network;
	private java.lang.String gateway;
	private java.lang.String[] reservedAddresses;

	public IpInfo() {
	}

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public IpInfo network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getGateway() { 
		return this.gateway;
	} 

	public void setGateway(java.lang.String gateway) { 
		this.gateway = gateway;
	} 

	public IpInfo gateway(java.lang.String gateway) { 
		this.gateway = gateway;
		return this;
	} 

	public java.lang.String[] getReservedAddresses() { 
		return this.reservedAddresses;
	} 

	public void setReservedAddresses(java.lang.String[] reservedAddresses) { 
		this.reservedAddresses = reservedAddresses;
	} 

	public IpInfo reservedAddresses(java.lang.String[] reservedAddresses) { 
		this.reservedAddresses = reservedAddresses;
		return this;
	} 

}
