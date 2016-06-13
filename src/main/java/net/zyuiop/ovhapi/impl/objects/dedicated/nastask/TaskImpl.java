package net.zyuiop.ovhapi.impl.objects.dedicated.nastask;

import net.zyuiop.ovhapi.api.objects.dedicated.nastask.Task;
/**
 * Storage task
 */

public class TaskImpl implements Task { 

	private long taskId;
	private java.lang.String storageName;
	private java.lang.String status;
	private java.lang.String details;
	private java.util.Date lastUpdate;
	private java.util.Date todoDate;
	private java.lang.String operation;
	private java.util.Date doneDate;

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

	public java.lang.String getStorageName() { 
		return this.storageName;
	} 

	public void setStorageName(java.lang.String storageName) { 
		this.storageName = storageName;
	} 

	public TaskImpl storageName(java.lang.String storageName) { 
		this.storageName = storageName;
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

	public java.lang.String getDetails() { 
		return this.details;
	} 

	public void setDetails(java.lang.String details) { 
		this.details = details;
	} 

	public TaskImpl details(java.lang.String details) { 
		this.details = details;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public TaskImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public TaskImpl todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public java.lang.String getOperation() { 
		return this.operation;
	} 

	public void setOperation(java.lang.String operation) { 
		this.operation = operation;
	} 

	public TaskImpl operation(java.lang.String operation) { 
		this.operation = operation;
		return this;
	} 

	public java.util.Date getDoneDate() { 
		return this.doneDate;
	} 

	public void setDoneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
	} 

	public TaskImpl doneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
		return this;
	} 

}
