package net.zyuiop.ovhapi.impl.objects.cluster.hadoop;

import net.zyuiop.ovhapi.api.objects.cluster.hadoop.Role;
/**
 * Role (ie set of Hadoop services) of the Node
 */

public class RoleImpl implements Role { 

	private long id;
	private java.lang.String type;

	public RoleImpl() {
	}

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public RoleImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public RoleImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
