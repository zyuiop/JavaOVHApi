package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.UserLogs;
/**
 * Hosting users logs
 */

public class UserLogsImpl implements UserLogs { 

	private java.util.Date creationDate;
	private java.lang.String description;
	private java.lang.String login;

	public UserLogsImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public UserLogsImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public UserLogsImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public UserLogsImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

}
