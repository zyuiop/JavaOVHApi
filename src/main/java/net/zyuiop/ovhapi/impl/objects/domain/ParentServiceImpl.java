package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.ParentService;
/**
 * Parent service
 */

public class ParentServiceImpl implements ParentService { 

	private java.lang.String name;
	private java.lang.String type;

	public ParentServiceImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ParentServiceImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ParentServiceImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
