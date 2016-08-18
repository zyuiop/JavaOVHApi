package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Domain
 */

public class Domain { 

	private java.lang.String name;

	public Domain() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Domain name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
