package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Role (ie set of Hadoop services) of the Node
 */

public class Role { 

	private long id;
	private java.lang.String type;

	public Role() {
	}

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Role id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Role type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
