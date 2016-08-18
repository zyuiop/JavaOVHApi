package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Operation on a telephony service
 */

public class Task { 

	private java.lang.String serviceType;
	private long taskId;
	private java.lang.String status;
	private java.lang.String action;
	private java.lang.String message;

	public Task() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public Task serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public Task taskId(long taskId) { 
		this.taskId = taskId;
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

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public Task action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public Task message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
