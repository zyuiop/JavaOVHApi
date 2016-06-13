package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Netboot;
/**
 * Available boots
 */

public class NetbootImpl implements Netboot { 

	private java.lang.String bootType;
	private java.lang.String kernel;
	private long bootId;
	private java.lang.String description;

	public NetbootImpl() {
	}

	public java.lang.String getBootType() { 
		return this.bootType;
	} 

	public void setBootType(java.lang.String bootType) { 
		this.bootType = bootType;
	} 

	public NetbootImpl bootType(java.lang.String bootType) { 
		this.bootType = bootType;
		return this;
	} 

	public java.lang.String getKernel() { 
		return this.kernel;
	} 

	public void setKernel(java.lang.String kernel) { 
		this.kernel = kernel;
	} 

	public NetbootImpl kernel(java.lang.String kernel) { 
		this.kernel = kernel;
		return this;
	} 

	public long getBootId() { 
		return this.bootId;
	} 

	public void setBootId(long bootId) { 
		this.bootId = bootId;
	} 

	public NetbootImpl bootId(long bootId) { 
		this.bootId = bootId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NetbootImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
