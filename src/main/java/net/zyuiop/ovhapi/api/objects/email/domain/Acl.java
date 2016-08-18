package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Email ACL
 */

public class Acl { 

	private java.lang.String accountId;

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

}
