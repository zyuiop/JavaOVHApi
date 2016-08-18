package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task Mailing List
 */

public class TaskMl { 

	private java.lang.String domain;
	private java.lang.String language;
	private java.lang.String account;
	private java.util.Date date;
	private java.lang.String action;
	private long id;

	public TaskMl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskMl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public TaskMl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public TaskMl account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public TaskMl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskMl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskMl id(long id) { 
		this.id = id;
		return this;
	} 

}
