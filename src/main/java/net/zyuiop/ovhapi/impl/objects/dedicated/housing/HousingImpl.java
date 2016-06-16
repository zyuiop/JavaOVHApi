package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.Housing;
/**
 * Housing bay
 */

public class HousingImpl implements Housing { 

	private net.zyuiop.ovhapi.impl.objects.dedicated.housing.NetworkInfoImpl network;
	private java.lang.String datacenter;
	private net.zyuiop.ovhapi.impl.objects.dedicated.housing.OptionsImpl options;
	private java.lang.String securityCode;
	private java.lang.String rack;
	private java.lang.String name;

	public HousingImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.dedicated.housing.NetworkInfoImpl getNetwork() { 
		return this.network;
	} 

	public void setNetwork(net.zyuiop.ovhapi.impl.objects.dedicated.housing.NetworkInfoImpl network) { 
		this.network = network;
	} 

	public HousingImpl network(net.zyuiop.ovhapi.impl.objects.dedicated.housing.NetworkInfoImpl network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public HousingImpl datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.dedicated.housing.OptionsImpl getOptions() { 
		return this.options;
	} 

	public void setOptions(net.zyuiop.ovhapi.impl.objects.dedicated.housing.OptionsImpl options) { 
		this.options = options;
	} 

	public HousingImpl options(net.zyuiop.ovhapi.impl.objects.dedicated.housing.OptionsImpl options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getSecurityCode() { 
		return this.securityCode;
	} 

	public void setSecurityCode(java.lang.String securityCode) { 
		this.securityCode = securityCode;
	} 

	public HousingImpl securityCode(java.lang.String securityCode) { 
		this.securityCode = securityCode;
		return this;
	} 

	public java.lang.String getRack() { 
		return this.rack;
	} 

	public void setRack(java.lang.String rack) { 
		this.rack = rack;
	} 

	public HousingImpl rack(java.lang.String rack) { 
		this.rack = rack;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HousingImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
