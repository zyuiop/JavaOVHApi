package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.Rule;
/**
 * Rule List
 */

public class RuleImpl implements Rule { 

	private java.lang.String value;
	private java.lang.String operand;
	private long id;
	private java.lang.String header;

	public RuleImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public RuleImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getOperand() { 
		return this.operand;
	} 

	public void setOperand(java.lang.String operand) { 
		this.operand = operand;
	} 

	public RuleImpl operand(java.lang.String operand) { 
		this.operand = operand;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public RuleImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getHeader() { 
		return this.header;
	} 

	public void setHeader(java.lang.String header) { 
		this.header = header;
	} 

	public RuleImpl header(java.lang.String header) { 
		this.header = header;
		return this;
	} 

}
