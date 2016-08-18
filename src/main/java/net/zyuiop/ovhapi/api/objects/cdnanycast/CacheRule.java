package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * CacheRules for a domain
 */

public class CacheRule { 

	private java.lang.String domain;
	private java.lang.String cacheType;
	private long cacheRuleId;
	private java.lang.String fileMatch;
	private long ttl;
	private java.lang.String status;
	private java.lang.String fileType;

	public CacheRule() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public CacheRule domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getCacheType() { 
		return this.cacheType;
	} 

	public void setCacheType(java.lang.String cacheType) { 
		this.cacheType = cacheType;
	} 

	public CacheRule cacheType(java.lang.String cacheType) { 
		this.cacheType = cacheType;
		return this;
	} 

	public long getCacheRuleId() { 
		return this.cacheRuleId;
	} 

	public void setCacheRuleId(long cacheRuleId) { 
		this.cacheRuleId = cacheRuleId;
	} 

	public CacheRule cacheRuleId(long cacheRuleId) { 
		this.cacheRuleId = cacheRuleId;
		return this;
	} 

	public java.lang.String getFileMatch() { 
		return this.fileMatch;
	} 

	public void setFileMatch(java.lang.String fileMatch) { 
		this.fileMatch = fileMatch;
	} 

	public CacheRule fileMatch(java.lang.String fileMatch) { 
		this.fileMatch = fileMatch;
		return this;
	} 

	public long getTtl() { 
		return this.ttl;
	} 

	public void setTtl(long ttl) { 
		this.ttl = ttl;
	} 

	public CacheRule ttl(long ttl) { 
		this.ttl = ttl;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CacheRule status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getFileType() { 
		return this.fileType;
	} 

	public void setFileType(java.lang.String fileType) { 
		this.fileType = fileType;
	} 

	public CacheRule fileType(java.lang.String fileType) { 
		this.fileType = fileType;
		return this;
	} 

}
