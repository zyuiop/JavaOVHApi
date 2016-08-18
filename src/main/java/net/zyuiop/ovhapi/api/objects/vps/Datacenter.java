package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Information about a datacenter of a VPS Virtual Machine
 */

public class Datacenter { 

	private java.lang.String longName;
	private java.lang.String name;

	public Datacenter() {
	}

	public java.lang.String getLongName() { 
		return this.longName;
	} 

	public void setLongName(java.lang.String longName) { 
		this.longName = longName;
	} 

	public Datacenter longName(java.lang.String longName) { 
		this.longName = longName;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Datacenter name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
