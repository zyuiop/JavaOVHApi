package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Task;
/**
 * Server tasks
 */

public class TaskImpl implements Task { 

	private long taskId;
	private java.lang.String function;
	private java.util.Date lastUpdate;
	private java.lang.String comment;
	private java.lang.String status;
	private java.util.Date startDate;
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

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public TaskImpl function(java.lang.String function) { 
		this.function = function;
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

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public TaskImpl comment(java.lang.String comment) { 
		this.comment = comment;
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