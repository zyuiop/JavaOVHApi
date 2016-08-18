package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * SOTP Two-Factor Authentication
 */

public class SOTPAccount { 

	private long remaining;
	private java.lang.String status;

	public SOTPAccount() {
	}

	public long getRemaining() { 
		return this.remaining;
	} 

	public void setRemaining(long remaining) { 
		this.remaining = remaining;
	} 

	public SOTPAccount remaining(long remaining) { 
		this.remaining = remaining;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SOTPAccount status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
