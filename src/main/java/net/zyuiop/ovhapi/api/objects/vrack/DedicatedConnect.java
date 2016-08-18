package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack dedicated connect interface
 */

public class DedicatedConnect { 

	private java.lang.String name;

	public DedicatedConnect() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DedicatedConnect name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
