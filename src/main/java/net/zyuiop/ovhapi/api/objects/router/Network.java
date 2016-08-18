package net.zyuiop.ovhapi.api.objects.router;

/**
 * Network
 */

public class Network { 

	private long vlanTag;
	private java.util.Date creationDate;
	private java.lang.String status;
	private long id;
	private java.lang.String ipNet;
	private java.lang.String description;

	public Network() {
	}

	public long getVlanTag() { 
		return this.vlanTag;
	} 

	public void setVlanTag(long vlanTag) { 
		this.vlanTag = vlanTag;
	} 

	public Network vlanTag(long vlanTag) { 
		this.vlanTag = vlanTag;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Network creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
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

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Network id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getIpNet() { 
		return this.ipNet;
	} 

	public void setIpNet(java.lang.String ipNet) { 
		this.ipNet = ipNet;
	} 

	public Network ipNet(java.lang.String ipNet) { 
		this.ipNet = ipNet;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Network description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
