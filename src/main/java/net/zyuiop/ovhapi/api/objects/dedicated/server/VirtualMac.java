package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A virtual MAC address associated to one or more IPs
 */

public class VirtualMac { 

	private java.lang.String macAddress;
	private java.lang.String type;

	public VirtualMac() {
	}

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public VirtualMac macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public VirtualMac type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
