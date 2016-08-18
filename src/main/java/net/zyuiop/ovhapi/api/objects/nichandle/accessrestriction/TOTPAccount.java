package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * TOTP Two-Factor Authentication
 */

public class TOTPAccount { 

	private java.lang.String status;
	private long id;

	public TOTPAccount() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TOTPAccount status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TOTPAccount id(long id) { 
		this.id = id;
		return this;
	} 

}
