package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Virtual service
 */

public class AttachedDomain { 

	private java.lang.String domain;
	private java.lang.String cdn;
	private java.lang.String ipLocation;
	private java.lang.String ownLog;
	private java.lang.String firewall;
	private boolean ssl;
	private java.lang.String path;

	public AttachedDomain() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AttachedDomain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getCdn() { 
		return this.cdn;
	} 

	public void setCdn(java.lang.String cdn) { 
		this.cdn = cdn;
	} 

	public AttachedDomain cdn(java.lang.String cdn) { 
		this.cdn = cdn;
		return this;
	} 

	public java.lang.String getIpLocation() { 
		return this.ipLocation;
	} 

	public void setIpLocation(java.lang.String ipLocation) { 
		this.ipLocation = ipLocation;
	} 

	public AttachedDomain ipLocation(java.lang.String ipLocation) { 
		this.ipLocation = ipLocation;
		return this;
	} 

	public java.lang.String getOwnLog() { 
		return this.ownLog;
	} 

	public void setOwnLog(java.lang.String ownLog) { 
		this.ownLog = ownLog;
	} 

	public AttachedDomain ownLog(java.lang.String ownLog) { 
		this.ownLog = ownLog;
		return this;
	} 

	public java.lang.String getFirewall() { 
		return this.firewall;
	} 

	public void setFirewall(java.lang.String firewall) { 
		this.firewall = firewall;
	} 

	public AttachedDomain firewall(java.lang.String firewall) { 
		this.firewall = firewall;
		return this;
	} 

	public boolean getSsl() { 
		return this.ssl;
	} 

	public void setSsl(boolean ssl) { 
		this.ssl = ssl;
	} 

	public AttachedDomain ssl(boolean ssl) { 
		this.ssl = ssl;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public AttachedDomain path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

}
