package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject;
/**
 * TokenProject
 */

public class TokenProjectImpl implements TokenProject { 

	private net.zyuiop.ovhapi.impl.objects.cloud.identity.DomainImpl domain;
	private java.lang.String name;
	private java.lang.String id;

	public TokenProjectImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.cloud.identity.DomainImpl getDomain() { 
		return this.domain;
	} 

	public void setDomain(net.zyuiop.ovhapi.impl.objects.cloud.identity.DomainImpl domain) { 
		this.domain = domain;
	} 

	public TokenProjectImpl domain(net.zyuiop.ovhapi.impl.objects.cloud.identity.DomainImpl domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TokenProjectImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public TokenProjectImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
