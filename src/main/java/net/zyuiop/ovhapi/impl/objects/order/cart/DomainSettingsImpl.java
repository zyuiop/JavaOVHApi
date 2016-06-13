package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.DomainSettings;
/**
 * Representation of domain name order properties
 */

public class DomainSettingsImpl implements DomainSettings { 

	private java.lang.String domain;

	public DomainSettingsImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainSettingsImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
