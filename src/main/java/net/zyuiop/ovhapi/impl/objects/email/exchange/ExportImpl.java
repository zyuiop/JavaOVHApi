package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.Export;
/**
 * Export PST file request
 */

public class ExportImpl implements Export { 

	private java.util.Date creationDate;
	private long percentComplete;
	private long taskPendingId;

	public ExportImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExportImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getPercentComplete() { 
		return this.percentComplete;
	} 

	public void setPercentComplete(long percentComplete) { 
		this.percentComplete = percentComplete;
	} 

	public ExportImpl percentComplete(long percentComplete) { 
		this.percentComplete = percentComplete;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExportImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
