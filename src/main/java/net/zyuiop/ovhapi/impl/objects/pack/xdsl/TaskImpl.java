package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.Task;
/**
 * Describes the current status of a task
 */

public class TaskImpl implements Task { 

	private java.lang.String function;
	private java.util.Date updateDate;
	private java.lang.String status;
	private long id;

	public TaskImpl() {
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

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public TaskImpl updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
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

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
