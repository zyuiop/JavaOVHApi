package net.zyuiop.ovhapi.impl.objects.vps.veeam;

import net.zyuiop.ovhapi.api.objects.vps.veeam.RestorePoint;
/**
 * Informations about a VPS Veeam restore points
 */

public class RestorePointImpl implements RestorePoint { 

	private java.util.Date creationTime;
	private long id;

	public RestorePointImpl() {
	}

	public java.util.Date getCreationTime() { 
		return this.creationTime;
	} 

	public void setCreationTime(java.util.Date creationTime) { 
		this.creationTime = creationTime;
	} 

	public RestorePointImpl creationTime(java.util.Date creationTime) { 
		this.creationTime = creationTime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public RestorePointImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
