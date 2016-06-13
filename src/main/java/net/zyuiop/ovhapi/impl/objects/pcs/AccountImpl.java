package net.zyuiop.ovhapi.impl.objects.pcs;

import net.zyuiop.ovhapi.api.objects.pcs.Account;
/**
 * PCS Infrastructure
 */

public class AccountImpl implements Account { 

	private java.lang.String domain;
	private java.util.Date creationDate;
	private java.lang.String userName;

	public AccountImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AccountImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public AccountImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUserName() { 
		return this.userName;
	} 

	public void setUserName(java.lang.String userName) { 
		this.userName = userName;
	} 

	public AccountImpl userName(java.lang.String userName) { 
		this.userName = userName;
		return this;
	} 

}
