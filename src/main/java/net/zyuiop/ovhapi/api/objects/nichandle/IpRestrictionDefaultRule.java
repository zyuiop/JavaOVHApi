package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * IP Restriction default rule
 */

public class IpRestrictionDefaultRule { 

	private boolean warning;
	private java.lang.String rule;

	public IpRestrictionDefaultRule() {
	}

	public boolean getWarning() { 
		return this.warning;
	} 

	public void setWarning(boolean warning) { 
		this.warning = warning;
	} 

	public IpRestrictionDefaultRule warning(boolean warning) { 
		this.warning = warning;
		return this;
	} 

	public java.lang.String getRule() { 
		return this.rule;
	} 

	public void setRule(java.lang.String rule) { 
		this.rule = rule;
	} 

	public IpRestrictionDefaultRule rule(java.lang.String rule) { 
		this.rule = rule;
		return this;
	} 

}
