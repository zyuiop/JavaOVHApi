package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.Project;
/**
 * Project
 */

public class ProjectImpl implements Project { 

	private boolean unleash;
	private java.util.Date creationDate;
	private long orderId;
	private java.lang.String status;
	private java.lang.String access;
	private java.lang.String description;
	private java.lang.String project_id;

	public ProjectImpl() {
	}

	public boolean getUnleash() { 
		return this.unleash;
	} 

	public void setUnleash(boolean unleash) { 
		this.unleash = unleash;
	} 

	public ProjectImpl unleash(boolean unleash) { 
		this.unleash = unleash;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ProjectImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public ProjectImpl orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ProjectImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getAccess() { 
		return this.access;
	} 

	public void setAccess(java.lang.String access) { 
		this.access = access;
	} 

	public ProjectImpl access(java.lang.String access) { 
		this.access = access;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public ProjectImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getProject_id() { 
		return this.project_id;
	} 

	public void setProject_id(java.lang.String project_id) { 
		this.project_id = project_id;
	} 

	public ProjectImpl project_id(java.lang.String project_id) { 
		this.project_id = project_id;
		return this;
	} 

}
