package net.zyuiop.ovhapi.impl.objects.cdn.website;

import net.zyuiop.ovhapi.api.objects.cdn.website.Backend;
/**
 * Backend on zone
 */

public class BackendImpl implements Backend { 

	private java.lang.String ipv4;
	private java.lang.String status;

	public BackendImpl() {
	}

	public java.lang.String getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(java.lang.String ipv4) { 
		this.ipv4 = ipv4;
	} 

	public BackendImpl ipv4(java.lang.String ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public BackendImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
