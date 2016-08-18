package net.zyuiop.ovhapi.api.objects.router;

/**
 * Received Private Link requests
 */

public class PrivateLinkRequest { 

	private java.util.Date creationDate;
	private java.lang.String status;

	public PrivateLinkRequest() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public PrivateLinkRequest creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PrivateLinkRequest status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
