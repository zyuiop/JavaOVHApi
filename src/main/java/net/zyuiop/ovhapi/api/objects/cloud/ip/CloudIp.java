package net.zyuiop.ovhapi.api.objects.cloud.ip;

/**
 * CloudIp
 */

public class CloudIp { 

	private java.lang.String ip;
	private java.lang.String status;
	private java.lang.String id;
	private java.lang.String type;

	public CloudIp() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CloudIp ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CloudIp status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public CloudIp id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CloudIp type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
