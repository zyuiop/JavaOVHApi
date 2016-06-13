package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Task;
/**
 * Operation on a SMS service
 */

public class TaskImpl implements Task { 

	private java.lang.String step;
	private long taskId;
	private java.lang.String function;
	private java.lang.String status;

	public TaskImpl() {
	}

	public java.lang.String getStep() { 
		return this.step;
	} 

	public void setStep(java.lang.String step) { 
		this.step = step;
	} 

	public TaskImpl step(java.lang.String step) { 
		this.step = step;
		return this;
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

}
