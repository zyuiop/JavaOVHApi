package net.zyuiop.ovhapi.api.objects.license.directadmin;

/**
 * Your DirectAdmin license
 */

public class DirectAdmin { 

	private long clientId;
	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private java.lang.String os;
	private java.lang.String domain;
	private java.lang.String licenseId;
	private java.util.Date creation;
	private boolean deleteAtExpiration;

	public DirectAdmin() {
	}

	public long getClientId() { 
		return this.clientId;
	} 

	public void setClientId(long clientId) { 
		this.clientId = clientId;
	} 

	public DirectAdmin clientId(long clientId) { 
		this.clientId = clientId;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DirectAdmin ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public DirectAdmin version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DirectAdmin status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getOs() { 
		return this.os;
	} 

	public void setOs(java.lang.String os) { 
		this.os = os;
	} 

	public DirectAdmin os(java.lang.String os) { 
		this.os = os;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DirectAdmin domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLicenseId() { 
		return this.licenseId;
	} 

	public void setLicenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
	} 

	public DirectAdmin licenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public DirectAdmin creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public DirectAdmin deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

}
