package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * User of the click 2 call
 */

public class Click2CallUser { 

	private long id;
	private java.lang.String login;
	private java.util.Date creationDateTime;

	public Click2CallUser() {
	}

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Click2CallUser id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public Click2CallUser login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.util.Date getCreationDateTime() { 
		return this.creationDateTime;
	} 

	public void setCreationDateTime(java.util.Date creationDateTime) { 
		this.creationDateTime = creationDateTime;
	} 

	public Click2CallUser creationDateTime(java.util.Date creationDateTime) { 
		this.creationDateTime = creationDateTime;
		return this;
	} 

}
