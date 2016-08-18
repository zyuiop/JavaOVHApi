package net.zyuiop.ovhapi.api.objects.spare.xdsl;

/**
 * Spare properties
 */

public class XdslSpare { 

	private java.lang.String macAddress;
	private java.lang.String brand;

	public XdslSpare() {
	}

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public XdslSpare macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getBrand() { 
		return this.brand;
	} 

	public void setBrand(java.lang.String brand) { 
		this.brand = brand;
	} 

	public XdslSpare brand(java.lang.String brand) { 
		this.brand = brand;
		return this;
	} 

}
