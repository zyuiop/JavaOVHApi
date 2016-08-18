package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting users logs
 */

public class UserLogs { 

	private java.util.Date creationDate;
	private java.lang.String description;
	private java.lang.String login;

	public UserLogs() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public UserLogs creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public UserLogs description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public UserLogs login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

}
