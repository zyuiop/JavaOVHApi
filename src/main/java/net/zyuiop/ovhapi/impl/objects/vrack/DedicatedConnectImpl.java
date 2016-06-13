package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect;
/**
 * vrack dedicated connect interface
 */

public class DedicatedConnectImpl implements DedicatedConnect { 

	private java.lang.String name;

	public DedicatedConnectImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DedicatedConnectImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
