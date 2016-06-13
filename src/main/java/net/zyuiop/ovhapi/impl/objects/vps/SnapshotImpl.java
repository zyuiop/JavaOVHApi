package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Snapshot;
/**
 * Information about the snapshot of a VPS Virtual Machine
 */

public class SnapshotImpl implements Snapshot { 

	private java.util.Date creationDate;
	private java.lang.String description;

	public SnapshotImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public SnapshotImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public SnapshotImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
