package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud
 */

public class DedicatedCloud { 

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

	public DedicatedCloud() {
	}

	public long getUserLimitConcurrentSession() { 
		return this.userLimitConcurrentSession;
	} 

	public void setUserLimitConcurrentSession(long userLimitConcurrentSession) { 
		this.userLimitConcurrentSession = userLimitConcurrentSession;
	} 

	public DedicatedCloud userLimitConcurrentSession(long userLimitConcurrentSession) { 
		this.userLimitConcurrentSession = userLimitConcurrentSession;
		return this;
	} 

	public java.lang.String getManagementInterface() { 
		return this.managementInterface;
	} 

	public void setManagementInterface(java.lang.String managementInterface) { 
		this.managementInterface = managementInterface;
	} 

	public DedicatedCloud managementInterface(java.lang.String managementInterface) { 
		this.managementInterface = managementInterface;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public DedicatedCloud billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public java.lang.String getLocation() { 
		return this.location;
	} 

	public void setLocation(java.lang.String location) { 
		this.location = location;
	} 

	public DedicatedCloud location(java.lang.String location) { 
		this.location = location;
		return this;
	} 

	public boolean getSslV3() { 
		return this.sslV3;
	} 

	public void setSslV3(boolean sslV3) { 
		this.sslV3 = sslV3;
	} 

	public DedicatedCloud sslV3(boolean sslV3) { 
		this.sslV3 = sslV3;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public DedicatedCloud serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getUserSessionTimeout() { 
		return this.userSessionTimeout;
	} 

	public void setUserSessionTimeout(long userSessionTimeout) { 
		this.userSessionTimeout = userSessionTimeout;
	} 

	public DedicatedCloud userSessionTimeout(long userSessionTimeout) { 
		this.userSessionTimeout = userSessionTimeout;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DedicatedCloud description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getCommercialRange() { 
		return this.commercialRange;
	} 

	public void setCommercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
	} 

	public DedicatedCloud commercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public DedicatedCloud state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public boolean getSpla() { 
		return this.spla;
	} 

	public void setSpla(boolean spla) { 
		this.spla = spla;
	} 

	public DedicatedCloud spla(boolean spla) { 
		this.spla = spla;
		return this;
	} 

	public java.lang.String getUserAccessPolicy() { 
		return this.userAccessPolicy;
	} 

	public void setUserAccessPolicy(java.lang.String userAccessPolicy) { 
		this.userAccessPolicy = userAccessPolicy;
	} 

	public DedicatedCloud userAccessPolicy(java.lang.String userAccessPolicy) { 
		this.userAccessPolicy = userAccessPolicy;
		return this;
	} 

	public java.lang.String getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(java.lang.String bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public DedicatedCloud bandwidth(java.lang.String bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

	public java.lang.String getUserLogoutPolicy() { 
		return this.userLogoutPolicy;
	} 

	public void setUserLogoutPolicy(java.lang.String userLogoutPolicy) { 
		this.userLogoutPolicy = userLogoutPolicy;
	} 

	public DedicatedCloud userLogoutPolicy(java.lang.String userLogoutPolicy) { 
		this.userLogoutPolicy = userLogoutPolicy;
		return this;
	} 

	public java.lang.String getVScopeUrl() { 
		return this.vScopeUrl;
	} 

	public void setVScopeUrl(java.lang.String vScopeUrl) { 
		this.vScopeUrl = vScopeUrl;
	} 

	public DedicatedCloud vScopeUrl(java.lang.String vScopeUrl) { 
		this.vScopeUrl = vScopeUrl;
		return this;
	} 

}
