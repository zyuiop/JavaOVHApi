package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.Delegation;
/**
 * Delegation List
 */

public class DelegationImpl implements Delegation { 

	private java.lang.String accountId;

	public DelegationImpl() {
	}

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public DelegationImpl accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

}
