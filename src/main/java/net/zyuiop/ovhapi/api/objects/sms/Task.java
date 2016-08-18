package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Operation on a SMS service
 */

public class Task { 

	private java.lang.String step;
	private long taskId;
	private java.lang.String function;
	private java.lang.String status;

	public Task() {
	}

	public java.lang.String getStep() { 
		return this.step;
	} 

	public void setStep(java.lang.String step) { 
		this.step = step;
	} 

	public Task step(java.lang.String step) { 
		this.step = step;
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

}
