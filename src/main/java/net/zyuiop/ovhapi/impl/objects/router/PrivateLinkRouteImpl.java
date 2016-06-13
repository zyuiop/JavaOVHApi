package net.zyuiop.ovhapi.impl.objects.router;

import net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute;
/**
 * Outgoing routes configured inside a Private Link
 */

public class PrivateLinkRouteImpl implements PrivateLinkRoute { 

	private java.lang.String network;
	private java.util.Date creationDate;
	private java.lang.String status;
	private long id;

	public PrivateLinkRouteImpl() {
	}

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public PrivateLinkRouteImpl network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLinkRouteImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLinkRouteImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public PrivateLinkRouteImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
