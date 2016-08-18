package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about motherboard
 */

public class RtmMotherboardHw { 

	private java.lang.String manufacturer;
	private java.lang.String name;

	public RtmMotherboardHw() {
	}

	public java.lang.String getManufacturer() { 
		return this.manufacturer;
	} 

	public void setManufacturer(java.lang.String manufacturer) { 
		this.manufacturer = manufacturer;
	} 

	public RtmMotherboardHw manufacturer(java.lang.String manufacturer) { 
		this.manufacturer = manufacturer;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RtmMotherboardHw name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
