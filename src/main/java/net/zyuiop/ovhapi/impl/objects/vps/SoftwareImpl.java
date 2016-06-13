package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Software;
/**
 * Available softwares on a Template
 */

public class SoftwareImpl implements Software { 

	private java.lang.String status;
	private java.lang.String name;
	private long id;
	private java.lang.String type;

	public SoftwareImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SoftwareImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SoftwareImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SoftwareImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SoftwareImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
