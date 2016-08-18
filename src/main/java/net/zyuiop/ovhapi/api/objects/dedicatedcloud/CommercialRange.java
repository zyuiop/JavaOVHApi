package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * The commercial ranges actually available in your Dedicated Cloud
 */

public class CommercialRange { 

	private java.lang.String commercialRangeName;
	private java.lang.String[] allowedHypervisorVersions;
	private java.lang.String range;
	private java.lang.String[] allowedNetworkRoles;
	private java.lang.String dedicatedCloudVersion;

	public CommercialRange() {
	}

	public java.lang.String getCommercialRangeName() { 
		return this.commercialRangeName;
	} 

	public void setCommercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
	} 

	public CommercialRange commercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
		return this;
	} 

	public java.lang.String[] getAllowedHypervisorVersions() { 
		return this.allowedHypervisorVersions;
	} 

	public void setAllowedHypervisorVersions(java.lang.String[] allowedHypervisorVersions) { 
		this.allowedHypervisorVersions = allowedHypervisorVersions;
	} 

	public CommercialRange allowedHypervisorVersions(java.lang.String[] allowedHypervisorVersions) { 
		this.allowedHypervisorVersions = allowedHypervisorVersions;
		return this;
	} 

	public java.lang.String getRange() { 
		return this.range;
	} 

	public void setRange(java.lang.String range) { 
		this.range = range;
	} 

	public CommercialRange range(java.lang.String range) { 
		this.range = range;
		return this;
	} 

	public java.lang.String[] getAllowedNetworkRoles() { 
		return this.allowedNetworkRoles;
	} 

	public void setAllowedNetworkRoles(java.lang.String[] allowedNetworkRoles) { 
		this.allowedNetworkRoles = allowedNetworkRoles;
	} 

	public CommercialRange allowedNetworkRoles(java.lang.String[] allowedNetworkRoles) { 
		this.allowedNetworkRoles = allowedNetworkRoles;
		return this;
	} 

	public java.lang.String getDedicatedCloudVersion() { 
		return this.dedicatedCloudVersion;
	} 

	public void setDedicatedCloudVersion(java.lang.String dedicatedCloudVersion) { 
		this.dedicatedCloudVersion = dedicatedCloudVersion;
	} 

	public CommercialRange dedicatedCloudVersion(java.lang.String dedicatedCloudVersion) { 
		this.dedicatedCloudVersion = dedicatedCloudVersion;
		return this;
	} 

}
