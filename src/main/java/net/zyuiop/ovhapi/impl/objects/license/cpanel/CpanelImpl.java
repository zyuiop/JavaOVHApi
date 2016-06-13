package net.zyuiop.ovhapi.impl.objects.license.cpanel;

import net.zyuiop.ovhapi.api.objects.license.cpanel.Cpanel;
/**
 * Your Cpanel license
 */

public class CpanelImpl implements Cpanel { 

	private java.lang.String domain;
	private java.lang.String licenseId;
	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private java.util.Date creation;
	private boolean deleteAtExpiration;

	public CpanelImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public CpanelImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLicenseId() { 
		return this.licenseId;
	} 

	public void setLicenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
	} 

	public CpanelImpl licenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CpanelImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public CpanelImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CpanelImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public CpanelImpl creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public CpanelImpl deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

}
