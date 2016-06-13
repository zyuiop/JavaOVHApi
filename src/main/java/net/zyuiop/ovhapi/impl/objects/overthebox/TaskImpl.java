package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.Task;
/**
 * Task
 */

public class TaskImpl implements Task { 

	private java.lang.String taskId;
	private java.lang.String status;
	private java.lang.String name;

	public TaskImpl() {
	}

	public java.lang.String getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(java.lang.String taskId) { 
		this.taskId = taskId;
	} 

	public TaskImpl taskId(java.lang.String taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public TaskImpl status(java.lang.String status) { 
		this.status = status;
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

}
