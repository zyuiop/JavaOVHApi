package net.zyuiop.ovhapi.api.objects.license.cloudlinux;

/**
 * Your CloudLinux license
 */

public class CloudLinux { 

	private java.lang.String domain;
	private java.lang.String licenseId;
	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private java.util.Date creation;

	public CloudLinux() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public CloudLinux domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLicenseId() { 
		return this.licenseId;
	} 

	public void setLicenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
	} 

	public CloudLinux licenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CloudLinux ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public CloudLinux version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CloudLinux status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public CloudLinux creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

}
