package net.zyuiop.ovhapi.impl.objects.router;

import net.zyuiop.ovhapi.api.objects.router.PrivateLink;
/**
 * Private Link to another service
 */

public class PrivateLinkImpl implements PrivateLink { 

	private java.lang.String peerServiceName;
	private java.util.Date creationDate;
	private java.lang.String status;
	private java.lang.String name;
	private long id;

	public PrivateLinkImpl() {
	}

	public java.lang.String getPeerServiceName() { 
		return this.peerServiceName;
	} 

	public void setPeerServiceName(java.lang.String peerServiceName) { 
		this.peerServiceName = peerServiceName;
	} 

	public PrivateLinkImpl peerServiceName(java.lang.String peerServiceName) { 
		this.peerServiceName = peerServiceName;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLinkImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLinkImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public PrivateLinkImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PrivateLinkImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
