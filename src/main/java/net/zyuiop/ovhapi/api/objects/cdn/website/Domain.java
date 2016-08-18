package net.zyuiop.ovhapi.api.objects.cdn.website;

/**
 * Domain on CDN
 */

public class Domain { 

	private java.lang.String domain;
	private java.lang.String status;

	public Domain() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Domain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Domain status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
