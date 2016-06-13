package net.zyuiop.ovhapi.impl.objects.spare.xdsl;

import net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare;
/**
 * Spare properties
 */

public class XdslSpareImpl implements XdslSpare { 

	private java.lang.String macAddress;
	private java.lang.String brand;

	public XdslSpareImpl() {
	}

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public XdslSpareImpl macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getBrand() { 
		return this.brand;
	} 

	public void setBrand(java.lang.String brand) { 
		this.brand = brand;
	} 

	public XdslSpareImpl brand(java.lang.String brand) { 
		this.brand = brand;
		return this;
	} 

}
