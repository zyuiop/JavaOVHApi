package net.zyuiop.ovhapi.api.objects.cloud.network;

/**
 * Network
 */

public class Network { 

	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String id;
	private java.lang.String type;
	private long vlanId;

	public Network() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Network status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Network name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Network region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Network id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Network type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public Network vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

}
