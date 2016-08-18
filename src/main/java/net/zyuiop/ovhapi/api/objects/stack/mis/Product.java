package net.zyuiop.ovhapi.api.objects.stack.mis;

/**
 * Stack MIS
 */

public class Product { 

	private java.lang.String domain;
	private java.lang.String type;

	public Product() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Product domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Product type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
