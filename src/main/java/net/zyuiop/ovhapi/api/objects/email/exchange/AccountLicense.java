package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange account license
 */

public class AccountLicense { 

	private long licenseQuantity;
	private java.lang.String license;

	public AccountLicense() {
	}

	public long getLicenseQuantity() { 
		return this.licenseQuantity;
	} 

	public void setLicenseQuantity(long licenseQuantity) { 
		this.licenseQuantity = licenseQuantity;
	} 

	public AccountLicense licenseQuantity(long licenseQuantity) { 
		this.licenseQuantity = licenseQuantity;
		return this;
	} 

	public java.lang.String getLicense() { 
		return this.license;
	} 

	public void setLicense(java.lang.String license) { 
		this.license = license;
	} 

	public AccountLicense license(java.lang.String license) { 
		this.license = license;
		return this;
	} 

}
