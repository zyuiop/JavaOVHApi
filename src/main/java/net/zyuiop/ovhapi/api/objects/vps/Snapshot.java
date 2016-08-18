package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Information about the snapshot of a VPS Virtual Machine
 */

public class Snapshot { 

	private java.util.Date creationDate;
	private java.lang.String description;

	public Snapshot() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Snapshot creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Snapshot description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
