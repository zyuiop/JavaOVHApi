package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.GlueRecord;
/**
 * Glue record
 */

public class GlueRecordImpl implements GlueRecord { 

	private java.lang.String[] ips;
	private java.lang.String host;

	public GlueRecordImpl() {
	}

	public java.lang.String[] getIps() { 
		return this.ips;
	} 

	public void setIps(java.lang.String[] ips) { 
		this.ips = ips;
	} 

	public GlueRecordImpl ips(java.lang.String[] ips) { 
		this.ips = ips;
		return this;
	} 

	public java.lang.String getHost() { 
		return this.host;
	} 

	public void setHost(java.lang.String host) { 
		this.host = host;
	} 

	public GlueRecordImpl host(java.lang.String host) { 
		this.host = host;
		return this;
	} 

}
