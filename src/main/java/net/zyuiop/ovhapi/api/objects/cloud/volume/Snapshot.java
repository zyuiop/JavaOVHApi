package net.zyuiop.ovhapi.api.objects.cloud.volume;

/**
 * Snapshot
 */

public class Snapshot { 

	private java.lang.String volumeId;
	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String description;
	private long size;
	private java.util.Date creationDate;
	private java.lang.String id;

	public Snapshot() {
	}

	public java.lang.String getVolumeId() { 
		return this.volumeId;
	} 

	public void setVolumeId(java.lang.String volumeId) { 
		this.volumeId = volumeId;
	} 

	public Snapshot volumeId(java.lang.String volumeId) { 
		this.volumeId = volumeId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Snapshot status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Snapshot name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Snapshot region(java.lang.String region) { 
		this.region = region;
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

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public Snapshot size(long size) { 
		this.size = size;
		return this;
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

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Snapshot id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
