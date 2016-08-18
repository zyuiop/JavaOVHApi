package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * IP Blocks associated with a Dedicated Cloud
 */

public class Ip { 

	private java.lang.String country;
	private java.lang.String register;
	private java.lang.String network;
	private long vlanNumber;
	private java.lang.String description;
	private java.lang.String networkName;

	public Ip() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public Ip country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getRegister() { 
		return this.register;
	} 

	public void setRegister(java.lang.String register) { 
		this.register = register;
	} 

	public Ip register(java.lang.String register) { 
		this.register = register;
		return this;
	} 

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public Ip network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public long getVlanNumber() { 
		return this.vlanNumber;
	} 

	public void setVlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
	} 

	public Ip vlanNumber(long vlanNumber) { 
		this.vlanNumber = vlanNumber;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Ip description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getNetworkName() { 
		return this.networkName;
	} 

	public void setNetworkName(java.lang.String networkName) { 
		this.networkName = networkName;
	} 

	public Ip networkName(java.lang.String networkName) { 
		this.networkName = networkName;
		return this;
	} 

}
