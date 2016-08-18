package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Shipping address
 */

public class ShippingAddress { 

	private java.lang.String firstName;
	private java.lang.String zipCode;
	private long shippingId;
	private java.lang.String cityName;
	private java.lang.String lastName;
	private java.lang.String address;
	private java.lang.String countryCode;

	public ShippingAddress() {
	}

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public ShippingAddress firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getZipCode() { 
		return this.zipCode;
	} 

	public void setZipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
	} 

	public ShippingAddress zipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
		return this;
	} 

	public long getShippingId() { 
		return this.shippingId;
	} 

	public void setShippingId(long shippingId) { 
		this.shippingId = shippingId;
	} 

	public ShippingAddress shippingId(long shippingId) { 
		this.shippingId = shippingId;
		return this;
	} 

	public java.lang.String getCityName() { 
		return this.cityName;
	} 

	public void setCityName(java.lang.String cityName) { 
		this.cityName = cityName;
	} 

	public ShippingAddress cityName(java.lang.String cityName) { 
		this.cityName = cityName;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public ShippingAddress lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public ShippingAddress address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

	public java.lang.String getCountryCode() { 
		return this.countryCode;
	} 

	public void setCountryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
	} 

	public ShippingAddress countryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
		return this;
	} 

}
