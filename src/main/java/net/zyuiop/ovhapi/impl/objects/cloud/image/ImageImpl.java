package net.zyuiop.ovhapi.impl.objects.cloud.image;

import net.zyuiop.ovhapi.api.objects.cloud.image.Image;
/**
 * Image
 */

public class ImageImpl implements Image { 

	private java.lang.String visibility;
	private java.lang.String status;
	private java.lang.String name;
	private java.lang.String region;
	private long minDisk;
	private java.lang.String creationDate;
	private long minRam;
	private java.lang.String user;
	private java.lang.String type;
	private java.lang.String id;

	public ImageImpl() {
	}

	public java.lang.String getVisibility() { 
		return this.visibility;
	} 

	public void setVisibility(java.lang.String visibility) { 
		this.visibility = visibility;
	} 

	public ImageImpl visibility(java.lang.String visibility) { 
		this.visibility = visibility;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ImageImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ImageImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public ImageImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getMinDisk() { 
		return this.minDisk;
	} 

	public void setMinDisk(long minDisk) { 
		this.minDisk = minDisk;
	} 

	public ImageImpl minDisk(long minDisk) { 
		this.minDisk = minDisk;
		return this;
	} 

	public java.lang.String getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.lang.String creationDate) { 
		this.creationDate = creationDate;
	} 

	public ImageImpl creationDate(java.lang.String creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getMinRam() { 
		return this.minRam;
	} 

	public void setMinRam(long minRam) { 
		this.minRam = minRam;
	} 

	public ImageImpl minRam(long minRam) { 
		this.minRam = minRam;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public ImageImpl user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ImageImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public ImageImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
