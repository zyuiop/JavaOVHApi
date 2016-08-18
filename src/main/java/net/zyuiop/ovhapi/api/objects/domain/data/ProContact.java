package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of an .pro Contact Resource
 */

public class ProContact { 

	private java.lang.String licenseNumber;
	private java.lang.String jobDescription;
	private java.lang.String authorityWebsite;
	private long id;
	private java.lang.String authority;

	public ProContact() {
	}

	public java.lang.String getLicenseNumber() { 
		return this.licenseNumber;
	} 

	public void setLicenseNumber(java.lang.String licenseNumber) { 
		this.licenseNumber = licenseNumber;
	} 

	public ProContact licenseNumber(java.lang.String licenseNumber) { 
		this.licenseNumber = licenseNumber;
		return this;
	} 

	public java.lang.String getJobDescription() { 
		return this.jobDescription;
	} 

	public void setJobDescription(java.lang.String jobDescription) { 
		this.jobDescription = jobDescription;
	} 

	public ProContact jobDescription(java.lang.String jobDescription) { 
		this.jobDescription = jobDescription;
		return this;
	} 

	public java.lang.String getAuthorityWebsite() { 
		return this.authorityWebsite;
	} 

	public void setAuthorityWebsite(java.lang.String authorityWebsite) { 
		this.authorityWebsite = authorityWebsite;
	} 

	public ProContact authorityWebsite(java.lang.String authorityWebsite) { 
		this.authorityWebsite = authorityWebsite;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ProContact id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getAuthority() { 
		return this.authority;
	} 

	public void setAuthority(java.lang.String authority) { 
		this.authority = authority;
	} 

	public ProContact authority(java.lang.String authority) { 
		this.authority = authority;
		return this;
	} 

}
