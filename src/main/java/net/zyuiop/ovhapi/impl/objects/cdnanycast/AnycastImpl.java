package net.zyuiop.ovhapi.impl.objects.cdnanycast;

import net.zyuiop.ovhapi.api.objects.cdnanycast.Anycast;
/**
 * Anycast IP of a CDN customer
 */

public class AnycastImpl implements Anycast { 

	private long quota;
	private long backendUse;
	private java.util.Date lastQuotaOrder;
	private java.lang.String offer;
	private java.lang.String anycast;
	private java.lang.String service;
	private java.lang.String logUrl;
	private long cacheRuleLimitPerDomain;
	private long backendLimit;

	public AnycastImpl() {
	}

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public AnycastImpl quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public long getBackendUse() { 
		return this.backendUse;
	} 

	public void setBackendUse(long backendUse) { 
		this.backendUse = backendUse;
	} 

	public AnycastImpl backendUse(long backendUse) { 
		this.backendUse = backendUse;
		return this;
	} 

	public java.util.Date getLastQuotaOrder() { 
		return this.lastQuotaOrder;
	} 

	public void setLastQuotaOrder(java.util.Date lastQuotaOrder) { 
		this.lastQuotaOrder = lastQuotaOrder;
	} 

	public AnycastImpl lastQuotaOrder(java.util.Date lastQuotaOrder) { 
		this.lastQuotaOrder = lastQuotaOrder;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public AnycastImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getAnycast() { 
		return this.anycast;
	} 

	public void setAnycast(java.lang.String anycast) { 
		this.anycast = anycast;
	} 

	public AnycastImpl anycast(java.lang.String anycast) { 
		this.anycast = anycast;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public AnycastImpl service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

	public java.lang.String getLogUrl() { 
		return this.logUrl;
	} 

	public void setLogUrl(java.lang.String logUrl) { 
		this.logUrl = logUrl;
	} 

	public AnycastImpl logUrl(java.lang.String logUrl) { 
		this.logUrl = logUrl;
		return this;
	} 

	public long getCacheRuleLimitPerDomain() { 
		return this.cacheRuleLimitPerDomain;
	} 

	public void setCacheRuleLimitPerDomain(long cacheRuleLimitPerDomain) { 
		this.cacheRuleLimitPerDomain = cacheRuleLimitPerDomain;
	} 

	public AnycastImpl cacheRuleLimitPerDomain(long cacheRuleLimitPerDomain) { 
		this.cacheRuleLimitPerDomain = cacheRuleLimitPerDomain;
		return this;
	} 

	public long getBackendLimit() { 
		return this.backendLimit;
	} 

	public void setBackendLimit(long backendLimit) { 
		this.backendLimit = backendLimit;
	} 

	public AnycastImpl backendLimit(long backendLimit) { 
		this.backendLimit = backendLimit;
		return this;
	} 

}
