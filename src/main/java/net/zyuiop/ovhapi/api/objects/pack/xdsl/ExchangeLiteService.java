package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Exchange account service
 */

public class ExchangeLiteService { 

	private java.lang.String domain;

	public ExchangeLiteService() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ExchangeLiteService domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
