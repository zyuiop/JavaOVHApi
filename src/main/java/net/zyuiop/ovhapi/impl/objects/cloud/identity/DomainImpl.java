package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Domain;
/**
 * Domain
 */

public class DomainImpl implements Domain { 

	private java.lang.String name;

	public DomainImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DomainImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
