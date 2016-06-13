package net.zyuiop.ovhapi.impl.objects.order;

import net.zyuiop.ovhapi.api.objects.order.Contract;
/**
 * A contract
 */

public class ContractImpl implements Contract { 

	private java.lang.String name;
	private java.lang.String url;
	private java.lang.String content;

	public ContractImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContractImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public ContractImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getContent() { 
		return this.content;
	} 

	public void setContent(java.lang.String content) { 
		this.content = content;
	} 

	public ContractImpl content(java.lang.String content) { 
		this.content = content;
		return this;
	} 

}
