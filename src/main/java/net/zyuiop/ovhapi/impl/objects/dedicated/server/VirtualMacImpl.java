package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.VirtualMac;
/**
 * A virtual MAC address associated to one or more IPs
 */

public class VirtualMacImpl implements VirtualMac { 

	private java.lang.String macAddress;
	private java.lang.String type;

	public VirtualMacImpl() {
	}

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public VirtualMacImpl macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public VirtualMacImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
