package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * IpAddress
 */

public class IpAddress { 

	private java.lang.String ip;
	private java.lang.String type;

	public IpAddress() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IpAddress ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public IpAddress type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
