package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Project
 */

public class Project { 

	private boolean unleash;
	private java.util.Date creationDate;
	private long orderId;
	private java.lang.String status;
	private java.lang.String access;
	private java.lang.String description;
	private java.lang.String project_id;

	public Project() {
	}

	public boolean getUnleash() { 
		return this.unleash;
	} 

	public void setUnleash(boolean unleash) { 
		this.unleash = unleash;
	} 

	public Project unleash(boolean unleash) { 
		this.unleash = unleash;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Project creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Project orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Project status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getAccess() { 
		return this.access;
	} 

	public void setAccess(java.lang.String access) { 
		this.access = access;
	} 

	public Project access(java.lang.String access) { 
		this.access = access;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Project description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getProject_id() { 
		return this.project_id;
	} 

	public void setProject_id(java.lang.String project_id) { 
		this.project_id = project_id;
	} 

	public Project project_id(java.lang.String project_id) { 
		this.project_id = project_id;
		return this;
	} 

}
