package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * Backend for a domain
 */

public class Backend { 

	private java.lang.String ip;

	public Backend() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Backend ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

}
