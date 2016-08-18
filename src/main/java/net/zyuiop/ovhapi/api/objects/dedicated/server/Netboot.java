package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Available boots
 */

public class Netboot { 

	private java.lang.String bootType;
	private java.lang.String kernel;
	private long bootId;
	private java.lang.String description;

	public Netboot() {
	}

	public java.lang.String getBootType() { 
		return this.bootType;
	} 

	public void setBootType(java.lang.String bootType) { 
		this.bootType = bootType;
	} 

	public Netboot bootType(java.lang.String bootType) { 
		this.bootType = bootType;
		return this;
	} 

	public java.lang.String getKernel() { 
		return this.kernel;
	} 

	public void setKernel(java.lang.String kernel) { 
		this.kernel = kernel;
	} 

	public Netboot kernel(java.lang.String kernel) { 
		this.kernel = kernel;
		return this;
	} 

	public long getBootId() { 
		return this.bootId;
	} 

	public void setBootId(long bootId) { 
		this.bootId = bootId;
	} 

	public Netboot bootId(long bootId) { 
		this.bootId = bootId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Netboot description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
