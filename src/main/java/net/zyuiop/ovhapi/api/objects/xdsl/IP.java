package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Informations about an IP address
 */

public class IP { 

	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private long range;
	private java.lang.String[] dnsList;

	public IP() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IP ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public IP version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IP status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getRange() { 
		return this.range;
	} 

	public void setRange(long range) { 
		this.range = range;
	} 

	public IP range(long range) { 
		this.range = range;
		return this;
	} 

	public java.lang.String[] getDnsList() { 
		return this.dnsList;
	} 

	public void setDnsList(java.lang.String[] dnsList) { 
		this.dnsList = dnsList;
	} 

	public IP dnsList(java.lang.String[] dnsList) { 
		this.dnsList = dnsList;
		return this;
	} 

}
