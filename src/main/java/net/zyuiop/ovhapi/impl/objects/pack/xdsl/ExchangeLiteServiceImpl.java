package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeLiteService;
/**
 * Exchange account service
 */

public class ExchangeLiteServiceImpl implements ExchangeLiteService { 

	private java.lang.String domain;

	public ExchangeLiteServiceImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ExchangeLiteServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

}
