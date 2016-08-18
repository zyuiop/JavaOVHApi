package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Name server
 */

public class DomainNs { 

	private java.lang.String ip;
	private java.lang.String host;

	public DomainNs() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DomainNs ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public DomainNs host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
