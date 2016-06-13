package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Phone;
/**
 * Plug & Phone
 */

public class PhoneImpl implements Phone { 

	private java.lang.String protocol;
	private java.lang.String macAddress;
	private java.lang.String brand;

	public PhoneImpl() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public PhoneImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public PhoneImpl macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getBrand() { 
		return this.brand;
	} 

	public void setBrand(java.lang.String brand) { 
		this.brand = brand;
	} 

	public PhoneImpl brand(java.lang.String brand) { 
		this.brand = brand;
		return this;
	} 

}
