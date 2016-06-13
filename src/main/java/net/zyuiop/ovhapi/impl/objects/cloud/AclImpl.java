package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.Acl;
/**
 * Cloud ACL
 */

public class AclImpl implements Acl { 

	private java.lang.String accountId;
	private java.lang.String type;

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

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public AclImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
