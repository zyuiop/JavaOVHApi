package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Task
 */

public class Task { 

	private java.lang.String taskId;
	private java.lang.String status;
	private java.lang.String name;

	public Task() {
	}

	public java.lang.String getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(java.lang.String taskId) { 
		this.taskId = taskId;
	} 

	public Task taskId(java.lang.String taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Task status(java.lang.String status) { 
		this.status = status;
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

}
