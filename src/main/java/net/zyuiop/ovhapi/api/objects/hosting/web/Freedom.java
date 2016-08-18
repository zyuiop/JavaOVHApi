package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Freedoms linked to this hosting account
 */

public class Freedom { 

	private java.lang.String domain;
	private java.lang.String status;
	private java.lang.String type;

	public Freedom() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Freedom domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Freedom status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Freedom type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
