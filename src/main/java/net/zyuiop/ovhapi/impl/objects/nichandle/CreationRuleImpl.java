package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.CreationRule;
/**
 * Describe all rules for a given field
 */

public class CreationRuleImpl implements CreationRule { 

	private boolean mandatory;
	private java.lang.String regularExpression;

	public CreationRuleImpl() {
	}

	public boolean getMandatory() { 
		return this.mandatory;
	} 

	public void setMandatory(boolean mandatory) { 
		this.mandatory = mandatory;
	} 

	public CreationRuleImpl mandatory(boolean mandatory) { 
		this.mandatory = mandatory;
		return this;
	} 

	public java.lang.String getRegularExpression() { 
		return this.regularExpression;
	} 

	public void setRegularExpression(java.lang.String regularExpression) { 
		this.regularExpression = regularExpression;
	} 

	public CreationRuleImpl regularExpression(java.lang.String regularExpression) { 
		this.regularExpression = regularExpression;
		return this;
	} 

}
