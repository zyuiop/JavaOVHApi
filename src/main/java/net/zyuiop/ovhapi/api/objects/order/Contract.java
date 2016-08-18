package net.zyuiop.ovhapi.api.objects.order;

/**
 * A contract
 */

public class Contract { 

	private java.lang.String name;
	private java.lang.String url;
	private java.lang.String content;

	public Contract() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Contract name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public Contract url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getContent() { 
		return this.content;
	} 

	public void setContent(java.lang.String content) { 
		this.content = content;
	} 

	public Contract content(java.lang.String content) { 
		this.content = content;
		return this;
	} 

}
