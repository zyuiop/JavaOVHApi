package net.zyuiop.ovhapi.api.objects.veeamcloudconnect;

/**
 * Operation with the Cloud Tenant Account
 */

public class Task { 

	private long taskId;
	private long progress;
	private java.util.Date endDate;
	private java.lang.String name;
	private java.util.Date startDate;
	private java.lang.String state;

	public Task() {
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

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public Task startDate(java.util.Date startDate) { 
		this.startDate = startDate;
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

}
