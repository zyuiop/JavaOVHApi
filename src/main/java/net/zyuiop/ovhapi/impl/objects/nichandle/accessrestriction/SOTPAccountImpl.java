package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SOTPAccount;
/**
 * SOTP Two-Factor Authentication
 */

public class SOTPAccountImpl implements SOTPAccount { 

	private long remaining;
	private java.lang.String status;

	public SOTPAccountImpl() {
	}

	public long getRemaining() { 
		return this.remaining;
	} 

	public void setRemaining(long remaining) { 
		this.remaining = remaining;
	} 

	public SOTPAccountImpl remaining(long remaining) { 
		this.remaining = remaining;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SOTPAccountImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
