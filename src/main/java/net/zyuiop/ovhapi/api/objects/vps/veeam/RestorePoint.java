package net.zyuiop.ovhapi.api.objects.vps.veeam;

/**
 * Informations about a VPS Veeam restore points
 */

public class RestorePoint { 

	private java.util.Date creationTime;
	private long id;

	public RestorePoint() {
	}

	public java.util.Date getCreationTime() { 
		return this.creationTime;
	} 

	public void setCreationTime(java.util.Date creationTime) { 
		this.creationTime = creationTime;
	} 

	public RestorePoint creationTime(java.util.Date creationTime) { 
		this.creationTime = creationTime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public RestorePoint id(long id) { 
		this.id = id;
		return this;
	} 

}
