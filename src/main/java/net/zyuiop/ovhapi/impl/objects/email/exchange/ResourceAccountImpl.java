package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount;
/**
 * Exchange resource account
 */

public class ResourceAccountImpl implements ResourceAccount { 

	private java.lang.String resourceEmailAddress;
	private boolean allowConflict;
	private long capacity;
	private java.lang.String state;
	private java.util.Date creationDate;
	private java.lang.String type;
	private long taskPendingId;
	private java.lang.String displayName;

	public ResourceAccountImpl() {
	}

	public java.lang.String getResourceEmailAddress() { 
		return this.resourceEmailAddress;
	} 

	public void setResourceEmailAddress(java.lang.String resourceEmailAddress) { 
		this.resourceEmailAddress = resourceEmailAddress;
	} 

	public ResourceAccountImpl resourceEmailAddress(java.lang.String resourceEmailAddress) { 
		this.resourceEmailAddress = resourceEmailAddress;
		return this;
	} 

	public boolean getAllowConflict() { 
		return this.allowConflict;
	} 

	public void setAllowConflict(boolean allowConflict) { 
		this.allowConflict = allowConflict;
	} 

	public ResourceAccountImpl allowConflict(boolean allowConflict) { 
		this.allowConflict = allowConflict;
		return this;
	} 

	public long getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(long capacity) { 
		this.capacity = capacity;
	} 

	public ResourceAccountImpl capacity(long capacity) { 
		this.capacity = capacity;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public ResourceAccountImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ResourceAccountImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ResourceAccountImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ResourceAccountImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public ResourceAccountImpl displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

}
