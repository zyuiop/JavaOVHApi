package net.zyuiop.ovhapi.api.objects.license;

/**
 * License change ip status return
 */

public class ChangeIpStatus { 

	private boolean success;
	private java.lang.String message;

	public ChangeIpStatus() {
	}

	public boolean getSuccess() { 
		return this.success;
	} 

	public void setSuccess(boolean success) { 
		this.success = success;
	} 

	public ChangeIpStatus success(boolean success) { 
		this.success = success;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public ChangeIpStatus message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
