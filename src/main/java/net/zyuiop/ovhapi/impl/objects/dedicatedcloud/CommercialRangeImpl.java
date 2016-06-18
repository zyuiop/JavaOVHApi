package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.CommercialRange;
/**
 * The commercial ranges actually available in your Dedicated Cloud
 */

public class CommercialRangeImpl implements CommercialRange { 

	private java.lang.String commercialRangeName;
	private java.lang.String[] allowedHypervisorVersions;
	private java.lang.String range;
	private java.lang.String[] allowedNetworkRoles;
	private java.lang.String dedicatedCloudVersion;

	public CommercialRangeImpl() {
	}

	public java.lang.String getCommercialRangeName() { 
		return this.commercialRangeName;
	} 

	public void setCommercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
	} 

	public CommercialRangeImpl commercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
		return this;
	} 

	public java.lang.String[] getAllowedHypervisorVersions() { 
		return this.allowedHypervisorVersions;
	} 

	public void setAllowedHypervisorVersions(java.lang.String[] allowedHypervisorVersions) { 
		this.allowedHypervisorVersions = allowedHypervisorVersions;
	} 

	public CommercialRangeImpl allowedHypervisorVersions(java.lang.String[] allowedHypervisorVersions) { 
		this.allowedHypervisorVersions = allowedHypervisorVersions;
		return this;
	} 

	public java.lang.String getRange() { 
		return this.range;
	} 

	public void setRange(java.lang.String range) { 
		this.range = range;
	} 

	public CommercialRangeImpl range(java.lang.String range) { 
		this.range = range;
		return this;
	} 

	public java.lang.String[] getAllowedNetworkRoles() { 
		return this.allowedNetworkRoles;
	} 

	public void setAllowedNetworkRoles(java.lang.String[] allowedNetworkRoles) { 
		this.allowedNetworkRoles = allowedNetworkRoles;
	} 

	public CommercialRangeImpl allowedNetworkRoles(java.lang.String[] allowedNetworkRoles) { 
		this.allowedNetworkRoles = allowedNetworkRoles;
		return this;
	} 

	public java.lang.String getDedicatedCloudVersion() { 
		return this.dedicatedCloudVersion;
	} 

	public void setDedicatedCloudVersion(java.lang.String dedicatedCloudVersion) { 
		this.dedicatedCloudVersion = dedicatedCloudVersion;
	} 

	public CommercialRangeImpl dedicatedCloudVersion(java.lang.String dedicatedCloudVersion) { 
		this.dedicatedCloudVersion = dedicatedCloudVersion;
		return this;
	} 

}
