package net.zyuiop.ovhapi.impl.objects.veeamcloudconnect;

import net.zyuiop.ovhapi.api.objects.veeamcloudconnect.Task;
/**
 * Operation with the Cloud Tenant Account
 */

public class TaskImpl implements Task { 

	private long taskId;
	private long progress;
	private java.util.Date endDate;
	private java.lang.String name;
	private java.util.Date startDate;
	private java.lang.String state;

	public TaskImpl() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public TaskImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public long getProgress() { 
		return this.progress;
	} 

	public void setProgress(long progress) { 
		this.progress = progress;
	} 

	public TaskImpl progress(long progress) { 
		this.progress = progress;
		return this;
	} 

	public java.util.Date getEndDate() { 
		return this.endDate;
	} 

	public void setEndDate(java.util.Date endDate) { 
		this.endDate = endDate;
	} 

	public TaskImpl endDate(java.util.Date endDate) { 
		this.endDate = endDate;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public TaskImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public TaskImpl startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public TaskImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
