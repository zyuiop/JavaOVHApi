package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule;
/**
 * IP Restriction default rule
 */

public class IpRestrictionDefaultRuleImpl implements IpRestrictionDefaultRule { 

	private boolean warning;
	private java.lang.String rule;

	public IpRestrictionDefaultRuleImpl() {
	}

	public boolean getWarning() { 
		return this.warning;
	} 

	public void setWarning(boolean warning) { 
		this.warning = warning;
	} 

	public IpRestrictionDefaultRuleImpl warning(boolean warning) { 
		this.warning = warning;
		return this;
	} 

	public java.lang.String getRule() { 
		return this.rule;
	} 

	public void setRule(java.lang.String rule) { 
		this.rule = rule;
	} 

	public IpRestrictionDefaultRuleImpl rule(java.lang.String rule) { 
		this.rule = rule;
		return this;
	} 

}
