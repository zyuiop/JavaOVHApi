package net.zyuiop.ovhapi.impl.objects.dedicated.nasha;

import net.zyuiop.ovhapi.api.objects.dedicated.nasha.Vrack;
/**
 * Partition Vrack
 */

public class VrackImpl implements Vrack { 

	private java.lang.String vrackName;
	private long id;
	private java.lang.String serviceIp;
	private java.lang.String type;

	public VrackImpl() {
	}

	public java.lang.String getVrackName() { 
		return this.vrackName;
	} 

	public void setVrackName(java.lang.String vrackName) { 
		this.vrackName = vrackName;
	} 

	public VrackImpl vrackName(java.lang.String vrackName) { 
		this.vrackName = vrackName;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public VrackImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getServiceIp() { 
		return this.serviceIp;
	} 

	public void setServiceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
	} 

	public VrackImpl serviceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public VrackImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
