package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Datacenter;
/**
 * Information about a datacenter of a VPS Virtual Machine
 */

public class DatacenterImpl implements Datacenter { 

	private java.lang.String longName;
	private java.lang.String name;

	public DatacenterImpl() {
	}

	public java.lang.String getLongName() { 
		return this.longName;
	} 

	public void setLongName(java.lang.String longName) { 
		this.longName = longName;
	} 

	public DatacenterImpl longName(java.lang.String longName) { 
		this.longName = longName;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DatacenterImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
