package net.zyuiop.ovhapi.impl.objects.cdn.website;

import net.zyuiop.ovhapi.api.objects.cdn.website.Domain;
/**
 * Domain on CDN
 */

public class DomainImpl implements Domain { 

	private java.lang.String domain;
	private java.lang.String status;

	public DomainImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DomainImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
