package net.zyuiop.ovhapi.impl.objects.cloud.volume;

import net.zyuiop.ovhapi.api.objects.cloud.volume.Volume;
/**
 * Volume
 */

public class VolumeImpl implements Volume { 

	private java.lang.String[] attachedTo;
	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String description;
	private long size;
	private java.util.Date creationDate;
	private java.lang.String id;
	private java.lang.String type;
	private boolean bootable;

	public VolumeImpl() {
	}

	public java.lang.String[] getAttachedTo() { 
		return this.attachedTo;
	} 

	public void setAttachedTo(java.lang.String[] attachedTo) { 
		this.attachedTo = attachedTo;
	} 

	public VolumeImpl attachedTo(java.lang.String[] attachedTo) { 
		this.attachedTo = attachedTo;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public VolumeImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VolumeImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public VolumeImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public VolumeImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public VolumeImpl size(long size) { 
		this.size = size;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public VolumeImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public VolumeImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public VolumeImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public boolean getBootable() { 
		return this.bootable;
	} 

	public void setBootable(boolean bootable) { 
		this.bootable = bootable;
	} 

	public VolumeImpl bootable(boolean bootable) { 
		this.bootable = bootable;
		return this;
	} 

}
