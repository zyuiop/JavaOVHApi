package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of domain name order properties
 */

public class DomainSettings { 

	private java.lang.String domain;

	public DomainSettings() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainSettings domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
