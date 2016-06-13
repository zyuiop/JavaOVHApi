package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.Acl;
/**
 * Email ACL
 */

public class AclImpl implements Acl { 

	private java.lang.String accountId;

	public AclImpl() {
	}

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public AclImpl accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

}
