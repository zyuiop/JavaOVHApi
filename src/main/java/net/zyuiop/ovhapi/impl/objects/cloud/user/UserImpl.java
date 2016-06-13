package net.zyuiop.ovhapi.impl.objects.cloud.user;

import net.zyuiop.ovhapi.api.objects.cloud.user.User;
/**
 * User
 */

public class UserImpl implements User { 

	private java.util.Date creationDate;
	private java.lang.String status;
	private long id;
	private java.lang.String description;
	private java.lang.String username;

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

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public UserImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public UserImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public UserImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public UserImpl username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

}
