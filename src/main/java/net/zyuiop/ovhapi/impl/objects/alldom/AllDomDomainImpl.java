package net.zyuiop.ovhapi.impl.objects.alldom;

import net.zyuiop.ovhapi.api.objects.alldom.AllDomDomain;
/**
 * Domain name of a allDom
 */

public class AllDomDomainImpl implements AllDomDomain { 

	private java.lang.String domain;

	public AllDomDomainImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AllDomDomainImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
