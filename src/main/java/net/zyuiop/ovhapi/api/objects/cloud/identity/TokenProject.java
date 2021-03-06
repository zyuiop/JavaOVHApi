package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * TokenProject
 */

public class TokenProject { 

	private net.zyuiop.ovhapi.api.objects.cloud.identity.Domain domain;
	private java.lang.String name;
	private java.lang.String id;

	public TokenProject() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.identity.Domain getDomain() { 
		return this.domain;
	} 

	public void setDomain(net.zyuiop.ovhapi.api.objects.cloud.identity.Domain domain) { 
		this.domain = domain;
	} 

	public TokenProject domain(net.zyuiop.ovhapi.api.objects.cloud.identity.Domain domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TokenProject name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public TokenProject id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
