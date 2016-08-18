package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Contact informations structure
 */

public class Contact { 

	private java.lang.String firstname;
	private java.lang.String country;
	private java.lang.String organisation;
	private java.lang.String name;
	private java.lang.String phone;
	private java.lang.String email;
	private java.lang.String zip;
	private java.lang.String city;
	private java.lang.String address;

	public Contact() {
	}

	public java.lang.String getFirstname() { 
		return this.firstname;
	} 

	public void setFirstname(java.lang.String firstname) { 
		this.firstname = firstname;
	} 

	public Contact firstname(java.lang.String firstname) { 
		this.firstname = firstname;
		return this;
	} 

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public Contact country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getOrganisation() { 
		return this.organisation;
	} 

	public void setOrganisation(java.lang.String organisation) { 
		this.organisation = organisation;
	} 

	public Contact organisation(java.lang.String organisation) { 
		this.organisation = organisation;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Contact name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getPhone() { 
		return this.phone;
	} 

	public void setPhone(java.lang.String phone) { 
		this.phone = phone;
	} 

	public Contact phone(java.lang.String phone) { 
		this.phone = phone;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Contact email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getZip() { 
		return this.zip;
	} 

	public void setZip(java.lang.String zip) { 
		this.zip = zip;
	} 

	public Contact zip(java.lang.String zip) { 
		this.zip = zip;
		return this;
	} 

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public Contact city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public Contact address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

}
