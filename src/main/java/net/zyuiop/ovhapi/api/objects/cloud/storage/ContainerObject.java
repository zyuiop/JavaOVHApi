package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerObject
 */

public class ContainerObject { 

	private java.util.Date lastModified;
	private java.lang.String name;
	private java.lang.String contentType;
	private long size;

	public ContainerObject() {
	}

	public java.util.Date getLastModified() { 
		return this.lastModified;
	} 

	public void setLastModified(java.util.Date lastModified) { 
		this.lastModified = lastModified;
	} 

	public ContainerObject lastModified(java.util.Date lastModified) { 
		this.lastModified = lastModified;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContainerObject name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getContentType() { 
		return this.contentType;
	} 

	public void setContentType(java.lang.String contentType) { 
		this.contentType = contentType;
	} 

	public ContainerObject contentType(java.lang.String contentType) { 
		this.contentType = contentType;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public ContainerObject size(long size) { 
		this.size = size;
		return this;
	} 

}
