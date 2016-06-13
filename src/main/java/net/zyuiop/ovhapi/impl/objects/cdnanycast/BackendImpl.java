package net.zyuiop.ovhapi.impl.objects.cdnanycast;

import net.zyuiop.ovhapi.api.objects.cdnanycast.Backend;
/**
 * Backend for a domain
 */

public class BackendImpl implements Backend { 

	private java.lang.String ip;

	public BackendImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public BackendImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

}
