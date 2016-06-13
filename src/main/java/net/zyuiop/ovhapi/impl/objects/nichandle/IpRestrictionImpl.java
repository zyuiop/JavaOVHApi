package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction;
/**
 * List of all IP Restrictions
 */

public class IpRestrictionImpl implements IpRestriction { 

	private java.lang.String ip;
	private boolean warning;
	private long id;
	private java.lang.String rule;

	public IpRestrictionImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IpRestrictionImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public boolean getWarning() { 
		return this.warning;
	} 

	public void setWarning(boolean warning) { 
		this.warning = warning;
	} 

	public IpRestrictionImpl warning(boolean warning) { 
		this.warning = warning;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public IpRestrictionImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getRule() { 
		return this.rule;
	} 

	public void setRule(java.lang.String rule) { 
		this.rule = rule;
	} 

	public IpRestrictionImpl rule(java.lang.String rule) { 
		this.rule = rule;
		return this;
	} 

}
