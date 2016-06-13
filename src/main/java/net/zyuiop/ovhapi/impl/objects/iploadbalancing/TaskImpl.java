package net.zyuiop.ovhapi.impl.objects.iploadbalancing;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.Task;
/**
 * Task of your iplb
 */

public class TaskImpl implements Task { 

	private java.util.Date creationDate;
	private java.lang.String status;
	private long progress;
	private java.lang.String action;
	private long id;

	public TaskImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public TaskImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
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

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public TaskImpl action(java.lang.String action) { 
		this.action = action;
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
