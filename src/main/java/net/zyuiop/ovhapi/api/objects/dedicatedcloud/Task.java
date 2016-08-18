package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Operation on a Dedicated Cloud component
 */

public class Task { 

	private java.util.Date maintenanceDateFrom;
	private long taskId;
	private java.util.Date maintenanceDateTo;
	private long progress;
	private java.lang.String name;
	private java.util.Date lastModificationDate;
	private java.lang.String description;
	private java.lang.String state;
	private java.util.Date endDate;
	private java.util.Date executionDate;
	private java.lang.String type;

	public Task() {
	}

	public java.util.Date getMaintenanceDateFrom() { 
		return this.maintenanceDateFrom;
	} 

	public void setMaintenanceDateFrom(java.util.Date maintenanceDateFrom) { 
		this.maintenanceDateFrom = maintenanceDateFrom;
	} 

	public Task maintenanceDateFrom(java.util.Date maintenanceDateFrom) { 
		this.maintenanceDateFrom = maintenanceDateFrom;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public Task taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.util.Date getMaintenanceDateTo() { 
		return this.maintenanceDateTo;
	} 

	public void setMaintenanceDateTo(java.util.Date maintenanceDateTo) { 
		this.maintenanceDateTo = maintenanceDateTo;
	} 

	public Task maintenanceDateTo(java.util.Date maintenanceDateTo) { 
		this.maintenanceDateTo = maintenanceDateTo;
		return this;
	} 

	public long getProgress() { 
		return this.progress;
	} 

	public void setProgress(long progress) { 
		this.progress = progress;
	} 

	public Task progress(long progress) { 
		this.progress = progress;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Task name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getLastModificationDate() { 
		return this.lastModificationDate;
	} 

	public void setLastModificationDate(java.util.Date lastModificationDate) { 
		this.lastModificationDate = lastModificationDate;
	} 

	public Task lastModificationDate(java.util.Date lastModificationDate) { 
		this.lastModificationDate = lastModificationDate;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Task description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Task state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public Task endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public java.util.Date getExecutionDate() { 
		return this.executionDate;
	} 

	public void setExecutionDate(java.util.Date executionDate) { 
		this.executionDate = executionDate;
	} 

	public Task executionDate(java.util.Date executionDate) { 
		this.executionDate = executionDate;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Task type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
