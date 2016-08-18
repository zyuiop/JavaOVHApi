package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all IP Restrictions
 */

public class IpRestriction { 

	private java.lang.String ip;
	private boolean warning;
	private long id;
	private java.lang.String rule;

	public IpRestriction() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IpRestriction ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getWarning() { 
		return this.warning;
	} 

	public void setWarning(boolean warning) { 
		this.warning = warning;
	} 

	public IpRestriction warning(boolean warning) { 
		this.warning = warning;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public IpRestriction id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getRule() { 
		return this.rule;
	} 

	public void setRule(java.lang.String rule) { 
		this.rule = rule;
	} 

	public IpRestriction rule(java.lang.String rule) { 
		this.rule = rule;
		return this;
	} 

}
