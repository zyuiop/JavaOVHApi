package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Role;
/**
 * Role
 */

public class RoleImpl implements Role { 

	private java.lang.String name;
	private java.lang.String id;

	public RoleImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RoleImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public RoleImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
