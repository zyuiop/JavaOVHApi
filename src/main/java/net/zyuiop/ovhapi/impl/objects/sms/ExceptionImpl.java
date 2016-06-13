package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Exception;
/**
 * Sms reach list
 */

public class ExceptionImpl implements Exception { 

	private java.lang.String countrySuffixe;
	private java.lang.String messages;
	private java.lang.String restrictionCode;
	private java.lang.String operators;
	private java.lang.String substitution;

	public ExceptionImpl() {
	}

	public java.lang.String getCountrySuffixe() { 
		return this.countrySuffixe;
	} 

	public void setCountrySuffixe(java.lang.String countrySuffixe) { 
		this.countrySuffixe = countrySuffixe;
	} 

	public ExceptionImpl countrySuffixe(java.lang.String countrySuffixe) { 
		this.countrySuffixe = countrySuffixe;
		return this;
	} 

	public java.lang.String getMessages() { 
		return this.messages;
	} 

	public void setMessages(java.lang.String messages) { 
		this.messages = messages;
	} 

	public ExceptionImpl messages(java.lang.String messages) { 
		this.messages = messages;
		return this;
	} 

	public java.lang.String getRestrictionCode() { 
		return this.restrictionCode;
	} 

	public void setRestrictionCode(java.lang.String restrictionCode) { 
		this.restrictionCode = restrictionCode;
	} 

	public ExceptionImpl restrictionCode(java.lang.String restrictionCode) { 
		this.restrictionCode = restrictionCode;
		return this;
	} 

	public java.lang.String getOperators() { 
		return this.operators;
	} 

	public void setOperators(java.lang.String operators) { 
		this.operators = operators;
	} 

	public ExceptionImpl operators(java.lang.String operators) { 
		this.operators = operators;
		return this;
	} 

	public java.lang.String getSubstitution() { 
		return this.substitution;
	} 

	public void setSubstitution(java.lang.String substitution) { 
		this.substitution = substitution;
	} 

	public ExceptionImpl substitution(java.lang.String substitution) { 
		this.substitution = substitution;
		return this;
	} 

}
