package net.zyuiop.ovhapi.impl.objects.hosting.privatedatabase;

import net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Task;
/**
 * Tasks
 */

public class TaskImpl implements Task { 

	private java.lang.String function;
	private java.lang.String status;
	private long dumpId;
	private java.lang.String databaseName;
	private java.util.Date lastUpdate;
	private long id;
	private java.lang.String userName;
	private java.util.Date startDate;
	private java.util.Date doneDate;

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

	public long getDumpId() { 
		return this.dumpId;
	} 

	public void setDumpId(long dumpId) { 
		this.dumpId = dumpId;
	} 

	public TaskImpl dumpId(long dumpId) { 
		this.dumpId = dumpId;
		return this;
	} 

	public java.lang.String getDatabaseName() { 
		return this.databaseName;
	} 

	public void setDatabaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
	} 

	public TaskImpl databaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
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

	public java.lang.String getUserName() { 
		return this.userName;
	} 

	public void setUserName(java.lang.String userName) { 
		this.userName = userName;
	} 

	public TaskImpl userName(java.lang.String userName) { 
		this.userName = userName;
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
