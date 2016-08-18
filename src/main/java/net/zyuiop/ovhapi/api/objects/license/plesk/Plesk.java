package net.zyuiop.ovhapi.api.objects.license.plesk;

/**
 * Your Plesk license
 */

public class Plesk { 

	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private java.lang.String key;
	private java.lang.String domain;
	private java.lang.String informationKey;
	private java.lang.String productKey;
	private java.lang.String licenseId;
	private java.util.Date creation;
	private boolean deleteAtExpiration;
	private java.lang.String domainNumber;

	public Plesk() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Plesk ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public Plesk version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Plesk status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getKey() { 
		return this.key;
	} 

	public void setKey(java.lang.String key) { 
		this.key = key;
	} 

	public Plesk key(java.lang.String key) { 
		this.key = key;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Plesk domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getInformationKey() { 
		return this.informationKey;
	} 

	public void setInformationKey(java.lang.String informationKey) { 
		this.informationKey = informationKey;
	} 

	public Plesk informationKey(java.lang.String informationKey) { 
		this.informationKey = informationKey;
		return this;
	} 

	public java.lang.String getProductKey() { 
		return this.productKey;
	} 

	public void setProductKey(java.lang.String productKey) { 
		this.productKey = productKey;
	} 

	public Plesk productKey(java.lang.String productKey) { 
		this.productKey = productKey;
		return this;
	} 

	public java.lang.String getLicenseId() { 
		return this.licenseId;
	} 

	public void setLicenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
	} 

	public Plesk licenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public Plesk creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public Plesk deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

	public java.lang.String getDomainNumber() { 
		return this.domainNumber;
	} 

	public void setDomainNumber(java.lang.String domainNumber) { 
		this.domainNumber = domainNumber;
	} 

	public Plesk domainNumber(java.lang.String domainNumber) { 
		this.domainNumber = domainNumber;
		return this;
	} 

}
