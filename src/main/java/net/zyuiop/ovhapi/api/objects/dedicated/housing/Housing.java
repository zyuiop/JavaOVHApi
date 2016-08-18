package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * Housing bay
 */

public class Housing { 

	private net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo[] network;
	private java.lang.String datacenter;
	private net.zyuiop.ovhapi.api.objects.dedicated.housing.Options options;
	private java.lang.String securityCode;
	private java.lang.String rack;
	private java.lang.String name;

	public Housing() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo[] getNetwork() { 
		return this.network;
	} 

	public void setNetwork(net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo[] network) { 
		this.network = network;
	} 

	public Housing network(net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo[] network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public Housing datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.Options getOptions() { 
		return this.options;
	} 

	public void setOptions(net.zyuiop.ovhapi.api.objects.dedicated.housing.Options options) { 
		this.options = options;
	} 

	public Housing options(net.zyuiop.ovhapi.api.objects.dedicated.housing.Options options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getSecurityCode() { 
		return this.securityCode;
	} 

	public void setSecurityCode(java.lang.String securityCode) { 
		this.securityCode = securityCode;
	} 

	public Housing securityCode(java.lang.String securityCode) { 
		this.securityCode = securityCode;
		return this;
	} 

	public java.lang.String getRack() { 
		return this.rack;
	} 

	public void setRack(java.lang.String rack) { 
		this.rack = rack;
	} 

	public Housing rack(java.lang.String rack) { 
		this.rack = rack;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Housing name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
