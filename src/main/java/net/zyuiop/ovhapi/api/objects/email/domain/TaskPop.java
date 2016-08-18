package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task Pop List
 */

public class TaskPop { 

	private java.lang.String domain;
	private java.util.Date date;
	private java.lang.String name;
	private java.lang.String action;
	private long id;

	public TaskPop() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public TaskPop domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public TaskPop date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TaskPop name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskPop action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskPop id(long id) { 
		this.id = id;
		return this;
	} 

}
