package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Glue record
 */

public class GlueRecord { 

	private java.lang.String[] ips;
	private java.lang.String host;

	public GlueRecord() {
	}

	public java.lang.String[] getIps() { 
		return this.ips;
	} 

	public void setIps(java.lang.String[] ips) { 
		this.ips = ips;
	} 

	public GlueRecord ips(java.lang.String[] ips) { 
		this.ips = ips;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public GlueRecord host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
