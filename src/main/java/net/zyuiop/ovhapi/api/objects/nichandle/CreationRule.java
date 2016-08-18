package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Describe all rules for a given field
 */

public class CreationRule { 

	private boolean mandatory;
	private java.lang.String regularExpression;

	public CreationRule() {
	}

	public boolean getMandatory() { 
		return this.mandatory;
	} 

	public void setMandatory(boolean mandatory) { 
		this.mandatory = mandatory;
	} 

	public CreationRule mandatory(boolean mandatory) { 
		this.mandatory = mandatory;
		return this;
	} 

	public java.lang.String getRegularExpression() { 
		return this.regularExpression;
	} 

	public void setRegularExpression(java.lang.String regularExpression) { 
		this.regularExpression = regularExpression;
	} 

	public CreationRule regularExpression(java.lang.String regularExpression) { 
		this.regularExpression = regularExpression;
		return this;
	} 

}
