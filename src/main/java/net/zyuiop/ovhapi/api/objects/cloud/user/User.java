package net.zyuiop.ovhapi.api.objects.cloud.user;

/**
 * User
 */

public class User { 

	private java.util.Date creationDate;
	private java.lang.String status;
	private long id;
	private java.lang.String description;
	private java.lang.String username;

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

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public User status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public User id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public User description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public User username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

}
