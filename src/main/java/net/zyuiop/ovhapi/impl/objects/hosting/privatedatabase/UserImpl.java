package net.zyuiop.ovhapi.impl.objects.hosting.privatedatabase;

import net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.User;
/**
 * Users
 */

public class UserImpl implements User { 

	private java.util.Date creationDate;
	private java.lang.String userName;

	public UserImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public UserImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUserName() { 
		return this.userName;
	} 

	public void setUserName(java.lang.String userName) { 
		this.userName = userName;
	} 

	public UserImpl userName(java.lang.String userName) { 
		this.userName = userName;
		return this;
	} 

}
