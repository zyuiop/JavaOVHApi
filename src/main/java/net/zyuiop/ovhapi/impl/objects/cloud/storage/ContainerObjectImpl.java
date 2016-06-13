package net.zyuiop.ovhapi.impl.objects.cloud.storage;

import net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject;
/**
 * ContainerObject
 */

public class ContainerObjectImpl implements ContainerObject { 

	private java.util.Date lastModified;
	private java.lang.String name;
	private java.lang.String contentType;
	private long size;

	public ContainerObjectImpl() {
	}

	public java.util.Date getLastModified() { 
		return this.lastModified;
	} 

	public void setLastModified(java.util.Date lastModified) { 
		this.lastModified = lastModified;
	} 

	public ContainerObjectImpl lastModified(java.util.Date lastModified) { 
		this.lastModified = lastModified;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ContainerObjectImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getContentType() { 
		return this.contentType;
	} 

	public void setContentType(java.lang.String contentType) { 
		this.contentType = contentType;
	} 

	public ContainerObjectImpl contentType(java.lang.String contentType) { 
		this.contentType = contentType;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public ContainerObjectImpl size(long size) { 
		this.size = size;
		return this;
	} 

}
