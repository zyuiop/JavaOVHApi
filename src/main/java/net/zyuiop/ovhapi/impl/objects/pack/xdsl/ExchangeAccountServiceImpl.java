package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeAccountService;
/**
 * Exchange 2013 service
 */

public class ExchangeAccountServiceImpl implements ExchangeAccountService { 

	private java.lang.String domain;
	private java.lang.String exchangeService;
	private java.lang.String organizationName;

	public ExchangeAccountServiceImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ExchangeAccountServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getExchangeService() { 
		return this.exchangeService;
	} 

	public void setExchangeService(java.lang.String exchangeService) { 
		this.exchangeService = exchangeService;
	} 

	public ExchangeAccountServiceImpl exchangeService(java.lang.String exchangeService) { 
		this.exchangeService = exchangeService;
		return this;
	} 

	public java.lang.String getOrganizationName() { 
		return this.organizationName;
	} 

	public void setOrganizationName(java.lang.String organizationName) { 
		this.organizationName = organizationName;
	} 

	public ExchangeAccountServiceImpl organizationName(java.lang.String organizationName) { 
		this.organizationName = organizationName;
		return this;
	} 

}
