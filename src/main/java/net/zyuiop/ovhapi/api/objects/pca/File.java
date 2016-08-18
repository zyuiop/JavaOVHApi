package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives files
 */

public class File { 

	private java.lang.String SHA1;
	private java.lang.String name;
	private java.lang.String state;
	private long size;
	private java.lang.String SHA256;
	private java.lang.String id;
	private java.lang.String type;
	private java.lang.String MD5;

	public File() {
	}

	public java.lang.String getSHA1() { 
		return this.SHA1;
	} 

	public void setSHA1(java.lang.String SHA1) { 
		this.SHA1 = SHA1;
	} 

	public File SHA1(java.lang.String SHA1) { 
		this.SHA1 = SHA1;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public File name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public File state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public File size(long size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String getSHA256() { 
		return this.SHA256;
	} 

	public void setSHA256(java.lang.String SHA256) { 
		this.SHA256 = SHA256;
	} 

	public File SHA256(java.lang.String SHA256) { 
		this.SHA256 = SHA256;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public File id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public File type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getMD5() { 
		return this.MD5;
	} 

	public void setMD5(java.lang.String MD5) { 
		this.MD5 = MD5;
	} 

	public File MD5(java.lang.String MD5) { 
		this.MD5 = MD5;
		return this;
	} 

}
