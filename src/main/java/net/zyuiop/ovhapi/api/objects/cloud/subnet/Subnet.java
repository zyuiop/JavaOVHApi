package net.zyuiop.ovhapi.api.objects.cloud.subnet;

/**
 * Subnet
 */

public class Subnet { 

	private java.lang.String name;
	private java.lang.String id;
	private java.lang.String cidr;
	private net.zyuiop.ovhapi.api.objects.cloud.network.IPPool[] ipPools;

	public Subnet() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Subnet name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Subnet id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCidr() { 
		return this.cidr;
	} 

	public void setCidr(java.lang.String cidr) { 
		this.cidr = cidr;
	} 

	public Subnet cidr(java.lang.String cidr) { 
		this.cidr = cidr;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.network.IPPool[] getIpPools() { 
		return this.ipPools;
	} 

	public void setIpPools(net.zyuiop.ovhapi.api.objects.cloud.network.IPPool[] ipPools) { 
		this.ipPools = ipPools;
	} 

	public Subnet ipPools(net.zyuiop.ovhapi.api.objects.cloud.network.IPPool[] ipPools) { 
		this.ipPools = ipPools;
		return this;
	} 

}
