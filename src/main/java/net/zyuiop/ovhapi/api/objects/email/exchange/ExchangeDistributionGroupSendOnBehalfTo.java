package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get users authorized to Send On Behalf To mails from this mailing list
 */

public class ExchangeDistributionGroupSendOnBehalfTo { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private long taskPendingId;

	public ExchangeDistributionGroupSendOnBehalfTo() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeDistributionGroupSendOnBehalfTo creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangeDistributionGroupSendOnBehalfTo allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeDistributionGroupSendOnBehalfTo taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
