package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Web Hosting
 */

public class Service { 

	private net.zyuiop.ovhapi.api.objects.hosting.web.CountriesIp[] countriesIp;
	private java.lang.String offer;
	private java.lang.String hostingIpv6;
	private java.lang.String primaryLogin;
	private java.lang.String filer;
	private java.lang.String state;
	private boolean hasCdn;
	private java.lang.String operatingSystem;
	private java.lang.String home;
	private java.lang.String token;
	private java.lang.String displayName;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize;
	private net.zyuiop.ovhapi.api.objects.hosting.web.AvailableOfferStruct[] availableBoostOffer;
	private java.lang.String cluster;
	private java.lang.String resourceType;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaUsed;
	private java.lang.String serviceName;
	private java.lang.String clusterIpv6;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaSize;
	private java.lang.String clusterIp;
	private java.lang.String boostOffer;
	private net.zyuiop.ovhapi.api.objects.hosting.web.PhpVersion[] phpVersions;
	private boolean hasHostedSsl;
	private java.lang.String hostingIp;

	public Service() {
	}

	public net.zyuiop.ovhapi.api.objects.hosting.web.CountriesIp[] getCountriesIp() { 
		return this.countriesIp;
	} 

	public void setCountriesIp(net.zyuiop.ovhapi.api.objects.hosting.web.CountriesIp[] countriesIp) { 
		this.countriesIp = countriesIp;
	} 

	public Service countriesIp(net.zyuiop.ovhapi.api.objects.hosting.web.CountriesIp[] countriesIp) { 
		this.countriesIp = countriesIp;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public Service offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getHostingIpv6() { 
		return this.hostingIpv6;
	} 

	public void setHostingIpv6(java.lang.String hostingIpv6) { 
		this.hostingIpv6 = hostingIpv6;
	} 

	public Service hostingIpv6(java.lang.String hostingIpv6) { 
		this.hostingIpv6 = hostingIpv6;
		return this;
	} 

	public java.lang.String getPrimaryLogin() { 
		return this.primaryLogin;
	} 

	public void setPrimaryLogin(java.lang.String primaryLogin) { 
		this.primaryLogin = primaryLogin;
	} 

	public Service primaryLogin(java.lang.String primaryLogin) { 
		this.primaryLogin = primaryLogin;
		return this;
	} 

	public java.lang.String getFiler() { 
		return this.filer;
	} 

	public void setFiler(java.lang.String filer) { 
		this.filer = filer;
	} 

	public Service filer(java.lang.String filer) { 
		this.filer = filer;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Service state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public boolean getHasCdn() { 
		return this.hasCdn;
	} 

	public void setHasCdn(boolean hasCdn) { 
		this.hasCdn = hasCdn;
	} 

	public Service hasCdn(boolean hasCdn) { 
		this.hasCdn = hasCdn;
		return this;
	} 

	public java.lang.String getOperatingSystem() { 
		return this.operatingSystem;
	} 

	public void setOperatingSystem(java.lang.String operatingSystem) { 
		this.operatingSystem = operatingSystem;
	} 

	public Service operatingSystem(java.lang.String operatingSystem) { 
		this.operatingSystem = operatingSystem;
		return this;
	} 

	public java.lang.String getHome() { 
		return this.home;
	} 

	public void setHome(java.lang.String home) { 
		this.home = home;
	} 

	public Service home(java.lang.String home) { 
		this.home = home;
		return this;
	} 

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public Service token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public Service displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaSize() { 
		return this.quotaSize;
	} 

	public void setQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
	} 

	public Service quotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaSize) { 
		this.quotaSize = quotaSize;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.web.AvailableOfferStruct[] getAvailableBoostOffer() { 
		return this.availableBoostOffer;
	} 

	public void setAvailableBoostOffer(net.zyuiop.ovhapi.api.objects.hosting.web.AvailableOfferStruct[] availableBoostOffer) { 
		this.availableBoostOffer = availableBoostOffer;
	} 

	public Service availableBoostOffer(net.zyuiop.ovhapi.api.objects.hosting.web.AvailableOfferStruct[] availableBoostOffer) { 
		this.availableBoostOffer = availableBoostOffer;
		return this;
	} 

	public java.lang.String getCluster() { 
		return this.cluster;
	} 

	public void setCluster(java.lang.String cluster) { 
		this.cluster = cluster;
	} 

	public Service cluster(java.lang.String cluster) { 
		this.cluster = cluster;
		return this;
	} 

	public java.lang.String getResourceType() { 
		return this.resourceType;
	} 

	public void setResourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
	} 

	public Service resourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public Service quotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getTrafficQuotaUsed() { 
		return this.trafficQuotaUsed;
	} 

	public void setTrafficQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaUsed) { 
		this.trafficQuotaUsed = trafficQuotaUsed;
	} 

	public Service trafficQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaUsed) { 
		this.trafficQuotaUsed = trafficQuotaUsed;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Service serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getClusterIpv6() { 
		return this.clusterIpv6;
	} 

	public void setClusterIpv6(java.lang.String clusterIpv6) { 
		this.clusterIpv6 = clusterIpv6;
	} 

	public Service clusterIpv6(java.lang.String clusterIpv6) { 
		this.clusterIpv6 = clusterIpv6;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getTrafficQuotaSize() { 
		return this.trafficQuotaSize;
	} 

	public void setTrafficQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaSize) { 
		this.trafficQuotaSize = trafficQuotaSize;
	} 

	public Service trafficQuotaSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue trafficQuotaSize) { 
		this.trafficQuotaSize = trafficQuotaSize;
		return this;
	} 

	public java.lang.String getClusterIp() { 
		return this.clusterIp;
	} 

	public void setClusterIp(java.lang.String clusterIp) { 
		this.clusterIp = clusterIp;
	} 

	public Service clusterIp(java.lang.String clusterIp) { 
		this.clusterIp = clusterIp;
		return this;
	} 

	public java.lang.String getBoostOffer() { 
		return this.boostOffer;
	} 

	public void setBoostOffer(java.lang.String boostOffer) { 
		this.boostOffer = boostOffer;
	} 

	public Service boostOffer(java.lang.String boostOffer) { 
		this.boostOffer = boostOffer;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.hosting.web.PhpVersion[] getPhpVersions() { 
		return this.phpVersions;
	} 

	public void setPhpVersions(net.zyuiop.ovhapi.api.objects.hosting.web.PhpVersion[] phpVersions) { 
		this.phpVersions = phpVersions;
	} 

	public Service phpVersions(net.zyuiop.ovhapi.api.objects.hosting.web.PhpVersion[] phpVersions) { 
		this.phpVersions = phpVersions;
		return this;
	} 

	public boolean getHasHostedSsl() { 
		return this.hasHostedSsl;
	} 

	public void setHasHostedSsl(boolean hasHostedSsl) { 
		this.hasHostedSsl = hasHostedSsl;
	} 

	public Service hasHostedSsl(boolean hasHostedSsl) { 
		this.hasHostedSsl = hasHostedSsl;
		return this;
	} 

	public java.lang.String getHostingIp() { 
		return this.hostingIp;
	} 

	public void setHostingIp(java.lang.String hostingIp) { 
		this.hostingIp = hostingIp;
	} 

	public Service hostingIp(java.lang.String hostingIp) { 
		this.hostingIp = hostingIp;
		return this;
	} 

}
