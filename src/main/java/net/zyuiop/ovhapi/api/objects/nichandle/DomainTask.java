package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Domain tasks
 */

public class DomainTask { 

	private java.lang.String function;
	private java.lang.String status;
	private boolean canAccelerate;
	private java.lang.String domain;
	private java.lang.String comment;
	private java.util.Date lastUpdate;
	private java.util.Date creationDate;
	private java.util.Date todoDate;
	private long id;
	private boolean canCancel;
	private java.util.Date doneDate;
	private boolean canRelaunch;

	public DomainTask() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public DomainTask function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DomainTask status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public boolean getCanAccelerate() { 
		return this.canAccelerate;
	} 

	public void setCanAccelerate(boolean canAccelerate) { 
		this.canAccelerate = canAccelerate;
	} 

	public DomainTask canAccelerate(boolean canAccelerate) { 
		this.canAccelerate = canAccelerate;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public DomainTask domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public DomainTask comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public DomainTask lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public DomainTask creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public DomainTask todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DomainTask id(long id) { 
		this.id = id;
		return this;
	} 

	public boolean getCanCancel() { 
		return this.canCancel;
	} 

	public void setCanCancel(boolean canCancel) { 
		this.canCancel = canCancel;
	} 

	public DomainTask canCancel(boolean canCancel) { 
		this.canCancel = canCancel;
		return this;
	} 

	public java.util.Date getDoneDate() { 
		return this.doneDate;
	} 

	public void setDoneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
	} 

	public DomainTask doneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
		return this;
	} 

	public boolean getCanRelaunch() { 
		return this.canRelaunch;
	} 

	public void setCanRelaunch(boolean canRelaunch) { 
		this.canRelaunch = canRelaunch;
	} 

	public DomainTask canRelaunch(boolean canRelaunch) { 
		this.canRelaunch = canRelaunch;
		return this;
	} 

}
