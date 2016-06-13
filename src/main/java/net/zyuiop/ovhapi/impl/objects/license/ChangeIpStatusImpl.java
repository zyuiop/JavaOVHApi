package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.ChangeIpStatus;
/**
 * License change ip status return
 */

public class ChangeIpStatusImpl implements ChangeIpStatus { 

	private boolean success;
	private java.lang.String message;

	public ChangeIpStatusImpl() {
	}

	public boolean getSuccess() { 
		return this.success;
	} 

	public void setSuccess(boolean success) { 
		this.success = success;
	} 

	public ChangeIpStatusImpl success(boolean success) { 
		this.success = success;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public ChangeIpStatusImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
