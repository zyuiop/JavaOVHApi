package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Account List
 */

public class AccountDelegated { 

	private boolean isBlocked;
	private java.lang.String email;
	private java.lang.String domain;
	private java.lang.String description;
	private java.lang.String accountName;
	private long size;

	public AccountDelegated() {
	}

	public boolean getIsBlocked() { 
		return this.isBlocked;
	} 

	public void setIsBlocked(boolean isBlocked) { 
		this.isBlocked = isBlocked;
	} 

	public AccountDelegated isBlocked(boolean isBlocked) { 
		this.isBlocked = isBlocked;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public AccountDelegated email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public AccountDelegated domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public AccountDelegated description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getAccountName() { 
		return this.accountName;
	} 

	public void setAccountName(java.lang.String accountName) { 
		this.accountName = accountName;
	} 

	public AccountDelegated accountName(java.lang.String accountName) { 
		this.accountName = accountName;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public AccountDelegated size(long size) { 
		this.size = size;
		return this;
	} 

}
