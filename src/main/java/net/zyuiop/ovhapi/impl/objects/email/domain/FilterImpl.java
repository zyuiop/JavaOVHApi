package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.Filter;
/**
 * Filter List
 */

public class FilterImpl implements Filter { 

	private long priority;
	private java.lang.String domain;
	private java.lang.String actionParam;
	private boolean active;
	private java.lang.String name;
	private java.lang.String action;
	private java.lang.String pop;

	public FilterImpl() {
	}

	public long getPriority() { 
		return this.priority;
	} 

	public void setPriority(long priority) { 
		this.priority = priority;
	} 

	public FilterImpl priority(long priority) { 
		this.priority = priority;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public FilterImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getActionParam() { 
		return this.actionParam;
	} 

	public void setActionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
	} 

	public FilterImpl actionParam(java.lang.String actionParam) { 
		this.actionParam = actionParam;
		return this;
	} 

	public boolean getActive() { 
		return this.active;
	} 

	public void setActive(boolean active) { 
		this.active = active;
	} 

	public FilterImpl active(boolean active) { 
		this.active = active;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public FilterImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public FilterImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public java.lang.String getPop() { 
		return this.pop;
	} 

	public void setPop(java.lang.String pop) { 
		this.pop = pop;
	} 

	public FilterImpl pop(java.lang.String pop) { 
		this.pop = pop;
		return this;
	} 

}
