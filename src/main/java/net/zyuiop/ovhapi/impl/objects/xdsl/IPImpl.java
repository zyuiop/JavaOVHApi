package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.IP;
/**
 * Informations about an IP address
 */

public class IPImpl implements IP { 

	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private long range;
	private java.lang.String[] dnsList;

	public IPImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IPImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public IPImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IPImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getRange() { 
		return this.range;
	} 

	public void setRange(long range) { 
		this.range = range;
	} 

	public IPImpl range(long range) { 
		this.range = range;
		return this;
	} 

	public java.lang.String[] getDnsList() { 
		return this.dnsList;
	} 

	public void setDnsList(java.lang.String[] dnsList) { 
		this.dnsList = dnsList;
	} 

	public IPImpl dnsList(java.lang.String[] dnsList) { 
		this.dnsList = dnsList;
		return this;
	} 

}
