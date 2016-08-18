package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Filter List
 */

public class Filter { 

	private long priority;
	private java.lang.String domain;
	private java.lang.String actionParam;
	private boolean active;
	private java.lang.String name;
	private java.lang.String action;
	private java.lang.String pop;

	public Filter() {
	}

	public long getPriority() { 
		return this.priority;
	} 

	public void setPriority(long priority) { 
		this.priority = priority;
	} 

	public Filter priority(long priority) { 
		this.priority = priority;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Filter domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getActionParam() { 
		return this.actionParam;
	} 

	public void setActionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
	} 

	public Filter actionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public Filter active(boolean active) { 
		this.active = active;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Filter name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public Filter action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public java.lang.String getPop() { 
		return this.pop;
	} 

	public void setPop(java.lang.String pop) { 
		this.pop = pop;
	} 

	public Filter pop(java.lang.String pop) { 
		this.pop = pop;
		return this;
	} 

}
