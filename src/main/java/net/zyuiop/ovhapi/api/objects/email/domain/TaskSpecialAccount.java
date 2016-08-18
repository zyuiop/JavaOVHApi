package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task special account List
 */

public class TaskSpecialAccount { 

	private java.lang.String domain;
	private java.lang.String account;
	private java.util.Date date;
	private java.lang.String action;
	private long id;
	private java.lang.String type;

	public TaskSpecialAccount() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskSpecialAccount domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public TaskSpecialAccount account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public TaskSpecialAccount date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskSpecialAccount action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskSpecialAccount id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public TaskSpecialAccount type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
