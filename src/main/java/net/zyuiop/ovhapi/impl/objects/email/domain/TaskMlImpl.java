package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.TaskMl;
/**
 * Task Mailing List
 */

public class TaskMlImpl implements TaskMl { 

	private java.lang.String domain;
	private java.lang.String language;
	private java.lang.String account;
	private java.util.Date date;
	private java.lang.String action;
	private long id;

	public TaskMlImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskMlImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public TaskMlImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public TaskMlImpl account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public TaskMlImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskMlImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskMlImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
