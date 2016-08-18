package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Define Acl for partition
 */

public class Access { 

	private java.lang.String ip;
	private long accessId;

	public Access() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Access ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getAccessId() { 
		return this.accessId;
	} 

	public void setAccessId(long accessId) { 
		this.accessId = accessId;
	} 

	public Access accessId(long accessId) { 
		this.accessId = accessId;
		return this;
	} 

}
