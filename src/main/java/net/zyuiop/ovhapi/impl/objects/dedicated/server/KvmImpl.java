package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Kvm;
/**
 * Physical KVM
 */

public class KvmImpl implements Kvm { 

	private java.lang.String ip;
	private java.lang.String name;
	private java.util.Date expiration;

	public KvmImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public KvmImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public KvmImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public KvmImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
