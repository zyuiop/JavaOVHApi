package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * SiteBuilder available domain infos
 */

public class SiteBuilderDomain { 

	private java.lang.String domain;
	private java.lang.String defaultSubDomain;

	public SiteBuilderDomain() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public SiteBuilderDomain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getDefaultSubDomain() { 
		return this.defaultSubDomain;
	} 

	public void setDefaultSubDomain(java.lang.String defaultSubDomain) { 
		this.defaultSubDomain = defaultSubDomain;
	} 

	public SiteBuilderDomain defaultSubDomain(java.lang.String defaultSubDomain) { 
		this.defaultSubDomain = defaultSubDomain;
		return this;
	} 

}
