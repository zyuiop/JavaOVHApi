package net.zyuiop.ovhapi.api.objects.alldom;

/**
 * Domain name of a allDom
 */

public class AllDomDomain { 

	private java.lang.String domain;

	public AllDomDomain() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AllDomDomain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
