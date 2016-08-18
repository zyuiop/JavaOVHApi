package net.zyuiop.ovhapi.api.objects.cloud.user;

/**
 * UserDetail
 */

public class UserDetail { 

	private java.lang.String password;
	private java.util.Date creationDate;
	private java.lang.String UserStatusEnum;
	private long id;
	private java.lang.String description;
	private java.lang.String username;

	public UserDetail() {
	}

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public UserDetail password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public UserDetail creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUserStatusEnum() { 
		return this.UserStatusEnum;
	} 

	public void setUserStatusEnum(java.lang.String UserStatusEnum) { 
		this.UserStatusEnum = UserStatusEnum;
	} 

	public UserDetail UserStatusEnum(java.lang.String UserStatusEnum) { 
		this.UserStatusEnum = UserStatusEnum;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public UserDetail id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public UserDetail description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getUsername() { 
		return this.username;
	} 

	public void setUsername(java.lang.String username) { 
		this.username = username;
	} 

	public UserDetail username(java.lang.String username) { 
		this.username = username;
		return this;
	} 

}
