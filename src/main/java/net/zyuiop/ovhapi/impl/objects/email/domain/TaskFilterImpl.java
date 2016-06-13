package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter;
/**
 * Task filter List
 */

public class TaskFilterImpl implements TaskFilter { 

	private java.lang.String domain;
	private java.util.Date timestamp;
	private java.lang.String account;
	private java.lang.String action;
	private long id;

	public TaskFilterImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskFilterImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
	} 

	public TaskFilterImpl timestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public java.lang.String getAccount() { 
		return this.account;
	} 

	public void setAccount(java.lang.String account) { 
		this.account = account;
	} 

	public TaskFilterImpl account(java.lang.String account) { 
		this.account = account;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskFilterImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskFilterImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
