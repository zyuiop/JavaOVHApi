package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount;
/**
 * Task special account List
 */

public class TaskSpecialAccountImpl implements TaskSpecialAccount { 

	private java.lang.String domain;
	private java.lang.String account;
	private java.util.Date date;
	private java.lang.String action;
	private long id;
	private java.lang.String type;

	public TaskSpecialAccountImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskSpecialAccountImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public TaskSpecialAccountImpl account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public TaskSpecialAccountImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskSpecialAccountImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskSpecialAccountImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public TaskSpecialAccountImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
