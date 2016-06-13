package net.zyuiop.ovhapi.impl.objects.pca;

import net.zyuiop.ovhapi.api.objects.pca.File;
/**
 * cloud archives files
 */

public class FileImpl implements File { 

	private java.lang.String SHA1;
	private java.lang.String name;
	private java.lang.String state;
	private long size;
	private java.lang.String SHA256;
	private java.lang.String id;
	private java.lang.String type;
	private java.lang.String MD5;

	public FileImpl() {
	}

	public java.lang.String getSHA1() { 
		return this.SHA1;
	} 

	public void setSHA1(java.lang.String SHA1) { 
		this.SHA1 = SHA1;
	} 

	public FileImpl SHA1(java.lang.String SHA1) { 
		this.SHA1 = SHA1;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public FileImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public FileImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public FileImpl size(long size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String getSHA256() { 
		return this.SHA256;
	} 

	public void setSHA256(java.lang.String SHA256) { 
		this.SHA256 = SHA256;
	} 

	public FileImpl SHA256(java.lang.String SHA256) { 
		this.SHA256 = SHA256;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public FileImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public FileImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getMD5() { 
		return this.MD5;
	} 

	public void setMD5(java.lang.String MD5) { 
		this.MD5 = MD5;
	} 

	public FileImpl MD5(java.lang.String MD5) { 
		this.MD5 = MD5;
		return this;
	} 

}
