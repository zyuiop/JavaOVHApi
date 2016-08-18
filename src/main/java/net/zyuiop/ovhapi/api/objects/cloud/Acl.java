package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud ACL
 */

public class Acl { 

	private java.lang.String accountId;
	private java.lang.String type;

	public Acl() {
	}

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public Acl accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Acl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
