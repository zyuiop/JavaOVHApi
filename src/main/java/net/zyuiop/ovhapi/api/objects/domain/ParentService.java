package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Parent service
 */

public class ParentService { 

	private java.lang.String name;
	private java.lang.String type;

	public ParentService() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ParentService name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ParentService type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
