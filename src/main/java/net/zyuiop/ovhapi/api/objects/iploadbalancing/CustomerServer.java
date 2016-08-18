package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Server
 */

public class CustomerServer { 

	private java.lang.String zone;
	private java.lang.String status;
	private long id;
	private java.lang.String address;
	private java.lang.String type;

	public CustomerServer() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public CustomerServer zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CustomerServer status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CustomerServer id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getAddress() { 
		return this.address;
	} 

	public void setAddress(java.lang.String address) { 
		this.address = address;
	} 

	public CustomerServer address(java.lang.String address) { 
		this.address = address;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CustomerServer type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
