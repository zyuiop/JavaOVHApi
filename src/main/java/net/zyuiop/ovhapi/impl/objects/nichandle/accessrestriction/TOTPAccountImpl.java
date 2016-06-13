package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.TOTPAccount;
/**
 * TOTP Two-Factor Authentication
 */

public class TOTPAccountImpl implements TOTPAccount { 

	private java.lang.String status;
	private long id;

	public TOTPAccountImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TOTPAccountImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TOTPAccountImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
