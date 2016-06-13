package net.zyuiop.ovhapi.impl.objects.iploadbalancing;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer;
/**
 * Server
 */

public class CustomerServerImpl implements CustomerServer { 

	private java.lang.String zone;
	private java.lang.String status;
	private long id;
	private java.lang.String address;
	private java.lang.String type;

	public CustomerServerImpl() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public CustomerServerImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CustomerServerImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CustomerServerImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public CustomerServerImpl address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CustomerServerImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
