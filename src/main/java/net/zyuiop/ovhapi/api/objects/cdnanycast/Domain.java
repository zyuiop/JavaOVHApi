package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * Domain on CDN
 */

public class Domain { 

	private long cacheRuleUse;
	private java.lang.String domain;
	private java.lang.String status;
	private java.lang.String type;
	private java.lang.String cname;

	public Domain() {
	}

	public long getCacheRuleUse() { 
		return this.cacheRuleUse;
	} 

	public void setCacheRuleUse(long cacheRuleUse) { 
		this.cacheRuleUse = cacheRuleUse;
	} 

	public Domain cacheRuleUse(long cacheRuleUse) { 
		this.cacheRuleUse = cacheRuleUse;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Domain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Domain status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Domain type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getCname() { 
		return this.cname;
	} 

	public void setCname(java.lang.String cname) { 
		this.cname = cname;
	} 

	public Domain cname(java.lang.String cname) { 
		this.cname = cname;
		return this;
	} 

}
