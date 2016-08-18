package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Export PST file request
 */

public class Export { 

	private java.util.Date creationDate;
	private long percentComplete;
	private long taskPendingId;

	public Export() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Export creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getPercentComplete() { 
		return this.percentComplete;
	} 

	public void setPercentComplete(long percentComplete) { 
		this.percentComplete = percentComplete;
	} 

	public Export percentComplete(long percentComplete) { 
		this.percentComplete = percentComplete;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public Export taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
