package net.zyuiop.ovhapi.api.objects.cdn.website;

/**
 * Backend on zone
 */

public class Backend { 

	private java.lang.String ipv4;
	private java.lang.String status;

	public Backend() {
	}

	public java.lang.String getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(java.lang.String ipv4) { 
		this.ipv4 = ipv4;
	} 

	public Backend ipv4(java.lang.String ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Backend status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
