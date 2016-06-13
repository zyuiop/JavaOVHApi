package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress;
/**
 * IpAddress
 */

public class IpAddressImpl implements IpAddress { 

	private java.lang.String ip;
	private java.lang.String type;

	public IpAddressImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IpAddressImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public IpAddressImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
