package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describes the current status of a task
 */

public class Task { 

	private java.lang.String function;
	private java.util.Date updateDate;
	private java.lang.String status;
	private long id;

	public Task() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public Task function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.util.Date getUpdateDate() { 
		return this.updateDate;
	} 

	public void setUpdateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
	} 

	public Task updateDate(java.util.Date updateDate) { 
		this.updateDate = updateDate;
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

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Task id(long id) { 
		this.id = id;
		return this;
	} 

}
