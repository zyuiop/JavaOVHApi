package net.zyuiop.ovhapi.api.objects.router;

/**
 * Outgoing routes configured inside a Private Link
 */

public class PrivateLinkRoute { 

	private java.lang.String network;
	private java.util.Date creationDate;
	private java.lang.String status;
	private long id;

	public PrivateLinkRoute() {
	}

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public PrivateLinkRoute network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLinkRoute creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLinkRoute status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PrivateLinkRoute id(long id) { 
		this.id = id;
		return this;
	} 

}
