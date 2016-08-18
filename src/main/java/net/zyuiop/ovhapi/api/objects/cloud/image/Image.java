package net.zyuiop.ovhapi.api.objects.cloud.image;

/**
 * Image
 */

public class Image { 

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

	public Image() {
	}

	public java.lang.String getVisibility() { 
		return this.visibility;
	} 

	public void setVisibility(java.lang.String visibility) { 
		this.visibility = visibility;
	} 

	public Image visibility(java.lang.String visibility) { 
		this.visibility = visibility;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Image status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Image name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Image region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getMinDisk() { 
		return this.minDisk;
	} 

	public void setMinDisk(long minDisk) { 
		this.minDisk = minDisk;
	} 

	public Image minDisk(long minDisk) { 
		this.minDisk = minDisk;
		return this;
	} 

	public java.lang.String getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.lang.String creationDate) { 
		this.creationDate = creationDate;
	} 

	public Image creationDate(java.lang.String creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getMinRam() { 
		return this.minRam;
	} 

	public void setMinRam(long minRam) { 
		this.minRam = minRam;
	} 

	public Image minRam(long minRam) { 
		this.minRam = minRam;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public Image user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Image type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Image id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
