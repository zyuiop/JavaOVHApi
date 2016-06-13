package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport;
/**
 * A structure giving operation price and asynchronous task ID
 */

public class ReceiversAsynchronousCleanReportImpl implements ReceiversAsynchronousCleanReport { 

	private double totalCreditsRemoved;
	private long taskId;

	public ReceiversAsynchronousCleanReportImpl() {
	}

	public double getTotalCreditsRemoved() { 
		return this.totalCreditsRemoved;
	} 

	public void setTotalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
	} 

	public ReceiversAsynchronousCleanReportImpl totalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public ReceiversAsynchronousCleanReportImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

}
