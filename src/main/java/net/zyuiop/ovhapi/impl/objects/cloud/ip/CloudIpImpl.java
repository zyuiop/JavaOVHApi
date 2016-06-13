package net.zyuiop.ovhapi.impl.objects.cloud.ip;

import net.zyuiop.ovhapi.api.objects.cloud.ip.CloudIp;
/**
 * CloudIp
 */

public class CloudIpImpl implements CloudIp { 

	private java.lang.String ip;
	private java.lang.String status;
	private java.lang.String id;
	private java.lang.String type;

	public CloudIpImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CloudIpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CloudIpImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public CloudIpImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CloudIpImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
