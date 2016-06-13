package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmMotherboardHw;
/**
 * A structure describing informations about motherboard
 */

public class RtmMotherboardHwImpl implements RtmMotherboardHw { 

	private java.lang.String manufacturer;
	private java.lang.String name;

	public RtmMotherboardHwImpl() {
	}

	public java.lang.String getManufacturer() { 
		return this.manufacturer;
	} 

	public void setManufacturer(java.lang.String manufacturer) { 
		this.manufacturer = manufacturer;
	} 

	public RtmMotherboardHwImpl manufacturer(java.lang.String manufacturer) { 
		this.manufacturer = manufacturer;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RtmMotherboardHwImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
