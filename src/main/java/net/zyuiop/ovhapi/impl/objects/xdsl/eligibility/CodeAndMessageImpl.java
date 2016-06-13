package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.CodeAndMessage;
/**
 * A message and its code
 */

public class CodeAndMessageImpl implements CodeAndMessage { 

	private java.lang.String code;
	private java.lang.String message;

	public CodeAndMessageImpl() {
	}

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public CodeAndMessageImpl code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public CodeAndMessageImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
