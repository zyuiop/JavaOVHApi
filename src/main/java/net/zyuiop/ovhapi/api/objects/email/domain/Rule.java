package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Rule List
 */

public class Rule { 

	private java.lang.String value;
	private java.lang.String operand;
	private long id;
	private java.lang.String header;

	public Rule() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public Rule value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.lang.String getOperand() { 
		return this.operand;
	} 

	public void setOperand(java.lang.String operand) { 
		this.operand = operand;
	} 

	public Rule operand(java.lang.String operand) { 
		this.operand = operand;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Rule id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getHeader() { 
		return this.header;
	} 

	public void setHeader(java.lang.String header) { 
		this.header = header;
	} 

	public Rule header(java.lang.String header) { 
		this.header = header;
		return this;
	} 

}
