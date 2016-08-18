package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Moderators List
 */

public class Moderator { 

	private java.lang.String email;
	private java.lang.String domain;
	private java.lang.String mailinglist;

	public Moderator() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Moderator email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Moderator domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getMailinglist() { 
		return this.mailinglist;
	} 

	public void setMailinglist(java.lang.String mailinglist) { 
		this.mailinglist = mailinglist;
	} 

	public Moderator mailinglist(java.lang.String mailinglist) { 
		this.mailinglist = mailinglist;
		return this;
	} 

}
