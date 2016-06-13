package net.zyuiop.ovhapi.impl.objects.license.office;

import net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant;
/**
 * Office tenant
 */

public class OfficeTenantImpl implements OfficeTenant { 

	private java.lang.String firstName;
	private java.lang.String zipCode;
	private java.lang.String status;
	private java.lang.String phone;
	private java.lang.String city;
	private java.lang.String lastName;
	private java.lang.String address;
	private java.lang.String displayName;

	public OfficeTenantImpl() {
	}

	public java.lang.String getFirstName() { 
		return this.firstName;
	} 

	public void setFirstName(java.lang.String firstName) { 
		this.firstName = firstName;
	} 

	public OfficeTenantImpl firstName(java.lang.String firstName) { 
		this.firstName = firstName;
		return this;
	} 

	public java.lang.String getZipCode() { 
		return this.zipCode;
	} 

	public void setZipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
	} 

	public OfficeTenantImpl zipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeTenantImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getPhone() { 
		return this.phone;
	} 

	public void setPhone(java.lang.String phone) { 
		this.phone = phone;
	} 

	public OfficeTenantImpl phone(java.lang.String phone) { 
		this.phone = phone;
		return this;
	} 

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public OfficeTenantImpl city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getLastName() { 
		return this.lastName;
	} 

	public void setLastName(java.lang.String lastName) { 
		this.lastName = lastName;
	} 

	public OfficeTenantImpl lastName(java.lang.String lastName) { 
		this.lastName = lastName;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public OfficeTenantImpl address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public OfficeTenantImpl displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

}
