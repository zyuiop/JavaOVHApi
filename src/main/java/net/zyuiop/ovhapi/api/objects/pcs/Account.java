package net.zyuiop.ovhapi.api.objects.pcs;

/**
 * PCS Infrastructure
 */

public class Account { 

	private java.lang.String domain;
	private java.util.Date creationDate;
	private java.lang.String userName;

	public Account() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Account domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Account creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUserName() { 
		return this.userName;
	} 

	public void setUserName(java.lang.String userName) { 
		this.userName = userName;
	} 

	public Account userName(java.lang.String userName) { 
		this.userName = userName;
		return this;
	} 

}
