package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain;
/**
 * SiteBuilder available domain infos
 */

public class SiteBuilderDomainImpl implements SiteBuilderDomain { 

	private java.lang.String domain;
	private java.lang.String defaultSubDomain;

	public SiteBuilderDomainImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public SiteBuilderDomainImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getDefaultSubDomain() { 
		return this.defaultSubDomain;
	} 

	public void setDefaultSubDomain(java.lang.String defaultSubDomain) { 
		this.defaultSubDomain = defaultSubDomain;
	} 

	public SiteBuilderDomainImpl defaultSubDomain(java.lang.String defaultSubDomain) { 
		this.defaultSubDomain = defaultSubDomain;
		return this;
	} 

}
