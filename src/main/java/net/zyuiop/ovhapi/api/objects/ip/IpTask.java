package net.zyuiop.ovhapi.api.objects.ip;

/**
 * IP tasks
 */

public class IpTask { 

	private long taskId;
	private java.lang.String function;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.ip.RoutedTo destination;
	private java.util.Date lastUpdate;
	private java.lang.String comment;
	private java.util.Date startDate;
	private java.util.Date doneDate;

	public IpTask() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public IpTask taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public IpTask function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IpTask status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.RoutedTo getDestination() { 
		return this.destination;
	} 

	public void setDestination(net.zyuiop.ovhapi.api.objects.ip.RoutedTo destination) { 
		this.destination = destination;
	} 

	public IpTask destination(net.zyuiop.ovhapi.api.objects.ip.RoutedTo destination) { 
		this.destination = destination;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public IpTask lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public IpTask comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public IpTask startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

	public java.util.Date getDoneDate() { 
		return this.doneDate;
	} 

	public void setDoneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
	} 

	public IpTask doneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
		return this;
	} 

}
