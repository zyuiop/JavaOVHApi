package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * A message and its code
 */

public class CodeAndMessage { 

	private java.lang.String code;
	private java.lang.String message;

	public CodeAndMessage() {
	}

	public java.lang.String getCode() { 
		return this.code;
	} 

	public void setCode(java.lang.String code) { 
		this.code = code;
	} 

	public CodeAndMessage code(java.lang.String code) { 
		this.code = code;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public CodeAndMessage message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
