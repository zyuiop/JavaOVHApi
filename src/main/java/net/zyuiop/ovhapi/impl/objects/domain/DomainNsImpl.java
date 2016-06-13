package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.DomainNs;
/**
 * Name server
 */

public class DomainNsImpl implements DomainNs { 

	private java.lang.String ip;
	private java.lang.String host;

	public DomainNsImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DomainNsImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public DomainNsImpl host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
