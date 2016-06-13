package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.Freedom;
/**
 * Freedoms linked to this hosting account
 */

public class FreedomImpl implements Freedom { 

	private java.lang.String domain;
	private java.lang.String status;
	private java.lang.String type;

	public FreedomImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public FreedomImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public FreedomImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public FreedomImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
