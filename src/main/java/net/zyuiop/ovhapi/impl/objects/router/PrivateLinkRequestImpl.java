package net.zyuiop.ovhapi.impl.objects.router;

import net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest;
/**
 * Received Private Link requests
 */

public class PrivateLinkRequestImpl implements PrivateLinkRequest { 

	private java.util.Date creationDate;
	private java.lang.String status;

	public PrivateLinkRequestImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLinkRequestImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLinkRequestImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
