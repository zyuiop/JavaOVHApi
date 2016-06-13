package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud;
/**
 * Dedicated Cloud
 */

public class DedicatedCloudImpl implements DedicatedCloud { 

	private long userLimitConcurrentSession;
	private java.lang.String managementInterface;
	private java.lang.String billingType;
	private java.lang.String location;
	private boolean sslV3;
	private java.lang.String serviceName;
	private long userSessionTimeout;
	private java.lang.String description;
	private java.lang.String commercialRange;
	private java.lang.String state;
	private boolean spla;
	private java.lang.String userAccessPolicy;
	private java.lang.String bandwidth;
	private java.lang.String userLogoutPolicy;
	private java.lang.String vScopeUrl;

	public DedicatedCloudImpl() {
	}

	public long getUserLimitConcurrentSession() { 
		return this.userLimitConcurrentSession;
	} 

	public void setUserLimitConcurrentSession(long userLimitConcurrentSession) { 
		this.userLimitConcurrentSession = userLimitConcurrentSession;
	} 

	public DedicatedCloudImpl userLimitConcurrentSession(long userLimitConcurrentSession) { 
		this.userLimitConcurrentSession = userLimitConcurrentSession;
		return this;
	} 

	public java.lang.String getManagementInterface() { 
		return this.managementInterface;
	} 

	public void setManagementInterface(java.lang.String managementInterface) { 
		this.managementInterface = managementInterface;
	} 

	public DedicatedCloudImpl managementInterface(java.lang.String managementInterface) { 
		this.managementInterface = managementInterface;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public DedicatedCloudImpl billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public java.lang.String getLocation() { 
		return this.location;
	} 

	public void setLocation(java.lang.String location) { 
		this.location = location;
	} 

	public DedicatedCloudImpl location(java.lang.String location) { 
		this.location = location;
		return this;
	} 

	public boolean getSslV3() { 
		return this.sslV3;
	} 

	public void setSslV3(boolean sslV3) { 
		this.sslV3 = sslV3;
	} 

	public DedicatedCloudImpl sslV3(boolean sslV3) { 
		this.sslV3 = sslV3;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public DedicatedCloudImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getUserSessionTimeout() { 
		return this.userSessionTimeout;
	} 

	public void setUserSessionTimeout(long userSessionTimeout) { 
		this.userSessionTimeout = userSessionTimeout;
	} 

	public DedicatedCloudImpl userSessionTimeout(long userSessionTimeout) { 
		this.userSessionTimeout = userSessionTimeout;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DedicatedCloudImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getCommercialRange() { 
		return this.commercialRange;
	} 

	public void setCommercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
	} 

	public DedicatedCloudImpl commercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public DedicatedCloudImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public boolean getSpla() { 
		return this.spla;
	} 

	public void setSpla(boolean spla) { 
		this.spla = spla;
	} 

	public DedicatedCloudImpl spla(boolean spla) { 
		this.spla = spla;
		return this;
	} 

	public java.lang.String getUserAccessPolicy() { 
		return this.userAccessPolicy;
	} 

	public void setUserAccessPolicy(java.lang.String userAccessPolicy) { 
		this.userAccessPolicy = userAccessPolicy;
	} 

	public DedicatedCloudImpl userAccessPolicy(java.lang.String userAccessPolicy) { 
		this.userAccessPolicy = userAccessPolicy;
		return this;
	} 

	public java.lang.String getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(java.lang.String bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public DedicatedCloudImpl bandwidth(java.lang.String bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

	public java.lang.String getUserLogoutPolicy() { 
		return this.userLogoutPolicy;
	} 

	public void setUserLogoutPolicy(java.lang.String userLogoutPolicy) { 
		this.userLogoutPolicy = userLogoutPolicy;
	} 

	public DedicatedCloudImpl userLogoutPolicy(java.lang.String userLogoutPolicy) { 
		this.userLogoutPolicy = userLogoutPolicy;
		return this;
	} 

	public java.lang.String getVScopeUrl() { 
		return this.vScopeUrl;
	} 

	public void setVScopeUrl(java.lang.String vScopeUrl) { 
		this.vScopeUrl = vScopeUrl;
	} 

	public DedicatedCloudImpl vScopeUrl(java.lang.String vScopeUrl) { 
		this.vScopeUrl = vScopeUrl;
		return this;
	} 

}
