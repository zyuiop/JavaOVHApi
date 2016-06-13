package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org;
/**
 * Details about an IP block organisation
 */

public class Ipv4OrgImpl implements Ipv4Org { 

	private java.lang.String organisationId;
	private java.lang.String firstname;
	private java.lang.String country;
	private java.lang.String registry;
	private java.lang.String lastname;
	private java.lang.String phone;
	private java.lang.String abuse_mailbox;
	private java.lang.String city;
	private java.lang.String zip;
	private java.lang.String address;

	public Ipv4OrgImpl() {
	}

	public java.lang.String getOrganisationId() { 
		return this.organisationId;
	} 

	public void setOrganisationId(java.lang.String organisationId) { 
		this.organisationId = organisationId;
	} 

	public Ipv4OrgImpl organisationId(java.lang.String organisationId) { 
		this.organisationId = organisationId;
		return this;
	} 

	public java.lang.String getFirstname() { 
		return this.firstname;
	} 

	public void setFirstname(java.lang.String firstname) { 
		this.firstname = firstname;
	} 

	public Ipv4OrgImpl firstname(java.lang.String firstname) { 
		this.firstname = firstname;
		return this;
	} 

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public Ipv4OrgImpl country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getRegistry() { 
		return this.registry;
	} 

	public void setRegistry(java.lang.String registry) { 
		this.registry = registry;
	} 

	public Ipv4OrgImpl registry(java.lang.String registry) { 
		this.registry = registry;
		return this;
	} 

	public java.lang.String getLastname() { 
		return this.lastname;
	} 

	public void setLastname(java.lang.String lastname) { 
		this.lastname = lastname;
	} 

	public Ipv4OrgImpl lastname(java.lang.String lastname) { 
		this.lastname = lastname;
		return this;
	} 

	public java.lang.String getPhone() { 
		return this.phone;
	} 

	public void setPhone(java.lang.String phone) { 
		this.phone = phone;
	} 

	public Ipv4OrgImpl phone(java.lang.String phone) { 
		this.phone = phone;
		return this;
	} 

	public java.lang.String getAbuse_mailbox() { 
		return this.abuse_mailbox;
	} 

	public void setAbuse_mailbox(java.lang.String abuse_mailbox) { 
		this.abuse_mailbox = abuse_mailbox;
	} 

	public Ipv4OrgImpl abuse_mailbox(java.lang.String abuse_mailbox) { 
		this.abuse_mailbox = abuse_mailbox;
		return this;
	} 

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public Ipv4OrgImpl city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getZip() { 
		return this.zip;
	} 

	public void setZip(java.lang.String zip) { 
		this.zip = zip;
	} 

	public Ipv4OrgImpl zip(java.lang.String zip) { 
		this.zip = zip;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public Ipv4OrgImpl address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

}
