package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Delegation List
 */

public class Delegation { 

	private java.lang.String accountId;

	public Delegation() {
	}

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public Delegation accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

}
