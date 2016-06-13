package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.AccountLicense;
/**
 * Exchange account license
 */

public class AccountLicenseImpl implements AccountLicense { 

	private long licenseQuantity;
	private java.lang.String license;

	public AccountLicenseImpl() {
	}

	public long getLicenseQuantity() { 
		return this.licenseQuantity;
	} 

	public void setLicenseQuantity(long licenseQuantity) { 
		this.licenseQuantity = licenseQuantity;
	} 

	public AccountLicenseImpl licenseQuantity(long licenseQuantity) { 
		this.licenseQuantity = licenseQuantity;
		return this;
	} 

	public java.lang.String getLicense() { 
		return this.license;
	} 

	public void setLicense(java.lang.String license) { 
		this.license = license;
	} 

	public AccountLicenseImpl license(java.lang.String license) { 
		this.license = license;
		return this;
	} 

}
