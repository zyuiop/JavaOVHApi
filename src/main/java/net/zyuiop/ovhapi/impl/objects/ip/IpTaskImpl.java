package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.IpTask;
/**
 * IP tasks
 */

public class IpTaskImpl implements IpTask { 

	private long taskId;
	private java.lang.String function;
	private java.lang.String status;
	private net.zyuiop.ovhapi.impl.objects.ip.RoutedToImpl destination;
	private java.util.Date lastUpdate;
	private java.lang.String comment;
	private java.util.Date startDate;
	private java.util.Date doneDate;

	public IpTaskImpl() {
	}

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public IpTaskImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public IpTaskImpl function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IpTaskImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.ip.RoutedToImpl getDestination() { 
		return this.destination;
	} 

	public void setDestination(net.zyuiop.ovhapi.impl.objects.ip.RoutedToImpl destination) { 
		this.destination = destination;
	} 

	public IpTaskImpl destination(net.zyuiop.ovhapi.impl.objects.ip.RoutedToImpl destination) { 
		this.destination = destination;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public IpTaskImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.lang.String getComment() { 
		return this.comment;
	} 

	public void setComment(java.lang.String comment) { 
		this.comment = comment;
	} 

	public IpTaskImpl comment(java.lang.String comment) { 
		this.comment = comment;
		return this;
	} 

	public java.util.Date getStartDate() { 
		return this.startDate;
	} 

	public void setStartDate(java.util.Date startDate) { 
		this.startDate = startDate;
	} 

	public IpTaskImpl startDate(java.util.Date startDate) { 
		this.startDate = startDate;
		return this;
	} 

	public java.util.Date getDoneDate() { 
		return this.doneDate;
	} 

	public void setDoneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
	} 

	public IpTaskImpl doneDate(java.util.Date doneDate) { 
		this.doneDate = doneDate;
		return this;
	} 

}
