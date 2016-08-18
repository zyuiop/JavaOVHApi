package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Role
 */

public class Role { 

	private java.lang.String name;
	private java.lang.String id;

	public Role() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Role name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Role id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
