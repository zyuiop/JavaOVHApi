package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Service link to the pack
 */

public class Service { 

	private java.lang.String domain;
	private double id;
	private java.lang.String type;

	public Service() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Service domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public double getId() { 
		return this.id;
	} 

	public void setId(double id) { 
		this.id = id;
	} 

	public Service id(double id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Service type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
