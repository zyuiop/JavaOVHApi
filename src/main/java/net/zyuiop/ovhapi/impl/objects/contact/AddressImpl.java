package net.zyuiop.ovhapi.impl.objects.contact;

import net.zyuiop.ovhapi.api.objects.contact.Address;
/**
 * Representation of an Address
 */

public class AddressImpl implements Address { 

	private java.lang.String country;
	private java.lang.String line1;
	private java.lang.String line2;
	private java.lang.String otherDetails;
	private java.lang.String line3;
	private java.lang.String city;
	private java.lang.String zip;
	private java.lang.String province;

	public AddressImpl() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public AddressImpl country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getLine1() { 
		return this.line1;
	} 

	public void setLine1(java.lang.String line1) { 
		this.line1 = line1;
	} 

	public AddressImpl line1(java.lang.String line1) { 
		this.line1 = line1;
		return this;
	} 

	public java.lang.String getLine2() { 
		return this.line2;
	} 

	public void setLine2(java.lang.String line2) { 
		this.line2 = line2;
	} 

	public AddressImpl line2(java.lang.String line2) { 
		this.line2 = line2;
		return this;
	} 

	public java.lang.String getOtherDetails() { 
		return this.otherDetails;
	} 

	public void setOtherDetails(java.lang.String otherDetails) { 
		this.otherDetails = otherDetails;
	} 

	public AddressImpl otherDetails(java.lang.String otherDetails) { 
		this.otherDetails = otherDetails;
		return this;
	} 

	public java.lang.String getLine3() { 
		return this.line3;
	} 

	public void setLine3(java.lang.String line3) { 
		this.line3 = line3;
	} 

	public AddressImpl line3(java.lang.String line3) { 
		this.line3 = line3;
		return this;
	} 

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public AddressImpl city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getZip() { 
		return this.zip;
	} 

	public void setZip(java.lang.String zip) { 
		this.zip = zip;
	} 

	public AddressImpl zip(java.lang.String zip) { 
		this.zip = zip;
		return this;
	} 

	public java.lang.String getProvince() { 
		return this.province;
	} 

	public void setProvince(java.lang.String province) { 
		this.province = province;
	} 

	public AddressImpl province(java.lang.String province) { 
		this.province = province;
		return this;
	} 

}
