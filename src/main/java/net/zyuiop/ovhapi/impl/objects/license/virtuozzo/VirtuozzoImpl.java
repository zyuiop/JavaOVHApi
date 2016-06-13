package net.zyuiop.ovhapi.impl.objects.license.virtuozzo;

import net.zyuiop.ovhapi.api.objects.license.virtuozzo.Virtuozzo;
/**
 * Your Virtuozzo license
 */

public class VirtuozzoImpl implements Virtuozzo { 

	private java.lang.String ip;
	private java.lang.String version;
	private java.lang.String status;
	private java.lang.String domain;
	private java.lang.String informationKey;
	private java.lang.String productKey;
	private java.lang.String containerNumber;
	private java.lang.String licenseId;
	private java.util.Date creation;
	private boolean deleteAtExpiration;

	public VirtuozzoImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public VirtuozzoImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public VirtuozzoImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public VirtuozzoImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public VirtuozzoImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getInformationKey() { 
		return this.informationKey;
	} 

	public void setInformationKey(java.lang.String informationKey) { 
		this.informationKey = informationKey;
	} 

	public VirtuozzoImpl informationKey(java.lang.String informationKey) { 
		this.informationKey = informationKey;
		return this;
	} 

	public java.lang.String getProductKey() { 
		return this.productKey;
	} 

	public void setProductKey(java.lang.String productKey) { 
		this.productKey = productKey;
	} 

	public VirtuozzoImpl productKey(java.lang.String productKey) { 
		this.productKey = productKey;
		return this;
	} 

	public java.lang.String getContainerNumber() { 
		return this.containerNumber;
	} 

	public void setContainerNumber(java.lang.String containerNumber) { 
		this.containerNumber = containerNumber;
	} 

	public VirtuozzoImpl containerNumber(java.lang.String containerNumber) { 
		this.containerNumber = containerNumber;
		return this;
	} 

	public java.lang.String getLicenseId() { 
		return this.licenseId;
	} 

	public void setLicenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
	} 

	public VirtuozzoImpl licenseId(java.lang.String licenseId) { 
		this.licenseId = licenseId;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public VirtuozzoImpl creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

	public boolean getDeleteAtExpiration() { 
		return this.deleteAtExpiration;
	} 

	public void setDeleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
	} 

	public VirtuozzoImpl deleteAtExpiration(boolean deleteAtExpiration) { 
		this.deleteAtExpiration = deleteAtExpiration;
		return this;
	} 

}
