package net.zyuiop.ovhapi.impl.objects.stack.mis;

import net.zyuiop.ovhapi.api.objects.stack.mis.Product;
/**
 * Stack MIS
 */

public class ProductImpl implements Product { 

	private java.lang.String domain;
	private java.lang.String type;

	public ProductImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public ProductImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ProductImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
