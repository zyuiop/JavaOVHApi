package net.zyuiop.ovhapi.impl.objects.dedicated.nasha;

import net.zyuiop.ovhapi.api.objects.dedicated.nasha.Access;
/**
 * Define Acl for partition
 */

public class AccessImpl implements Access { 

	private java.lang.String ip;
	private long accessId;

	public AccessImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public AccessImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public long getAccessId() { 
		return this.accessId;
	} 

	public void setAccessId(long accessId) { 
		this.accessId = accessId;
	} 

	public AccessImpl accessId(long accessId) { 
		this.accessId = accessId;
		return this;
	} 

}
