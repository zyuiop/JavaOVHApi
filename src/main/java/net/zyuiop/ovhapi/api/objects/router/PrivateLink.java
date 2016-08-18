package net.zyuiop.ovhapi.api.objects.router;

/**
 * Private Link to another service
 */

public class PrivateLink { 

	private java.lang.String peerServiceName;
	private java.util.Date creationDate;
	private java.lang.String status;
	private java.lang.String name;
	private long id;

	public PrivateLink() {
	}

	public java.lang.String getPeerServiceName() { 
		return this.peerServiceName;
	} 

	public void setPeerServiceName(java.lang.String peerServiceName) { 
		this.peerServiceName = peerServiceName;
	} 

	public PrivateLink peerServiceName(java.lang.String peerServiceName) { 
		this.peerServiceName = peerServiceName;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLink creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLink status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PrivateLink name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PrivateLink id(long id) { 
		this.id = id;
		return this;
	} 

}
