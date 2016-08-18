package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Users
 */

public class User { 

	private java.util.Date creationDate;
	private java.lang.String userName;

	public User() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public User creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUserName() { 
		return this.userName;
	} 

	public void setUserName(java.lang.String userName) { 
		this.userName = userName;
	} 

	public User userName(java.lang.String userName) { 
		this.userName = userName;
		return this;
	} 

}
