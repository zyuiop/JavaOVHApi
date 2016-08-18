package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure giving operation price and asynchronous task ID
 */

public class ReceiversAsynchronousCleanReport { 

	private double totalCreditsRemoved;
	private long taskId;

	public ReceiversAsynchronousCleanReport() {
	}

	public double getTotalCreditsRemoved() { 
		return this.totalCreditsRemoved;
	} 

	public void setTotalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
	} 

	public ReceiversAsynchronousCleanReport totalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public ReceiversAsynchronousCleanReport taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

}
