package net.zyuiop.ovhapi.impl.objects.cloud.subnet;

import net.zyuiop.ovhapi.api.objects.cloud.subnet.Subnet;
/**
 * Subnet
 */

public class SubnetImpl implements Subnet { 

	private java.lang.String name;
	private java.lang.String id;
	private java.lang.String cidr;
	private net.zyuiop.ovhapi.impl.objects.cloud.network.IPPoolImpl[] ipPools;

	public SubnetImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SubnetImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public SubnetImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCidr() { 
		return this.cidr;
	} 

	public void setCidr(java.lang.String cidr) { 
		this.cidr = cidr;
	} 

	public SubnetImpl cidr(java.lang.String cidr) { 
		this.cidr = cidr;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.network.IPPoolImpl[] getIpPools() { 
		return this.ipPools;
	} 

	public void setIpPools(net.zyuiop.ovhapi.impl.objects.cloud.network.IPPoolImpl[] ipPools) { 
		this.ipPools = ipPools;
	} 

	public SubnetImpl ipPools(net.zyuiop.ovhapi.impl.objects.cloud.network.IPPoolImpl[] ipPools) { 
		this.ipPools = ipPools;
		return this;
	} 

}
