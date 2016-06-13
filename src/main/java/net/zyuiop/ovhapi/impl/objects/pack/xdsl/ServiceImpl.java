package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.Service;
/**
 * Service link to the pack
 */

public class ServiceImpl implements Service { 

	private java.lang.String domain;
	private double id;
	private java.lang.String type;

	public ServiceImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ServiceImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public double getId() { 
		return this.id;
	} 

	public void setId(double id) { 
		this.id = id;
	} 

	public ServiceImpl id(double id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ServiceImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
