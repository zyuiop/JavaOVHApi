package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendAs;
/**
 * Get users authorized to Send On Behalf To mails from this mailbox
 */

public class ExchangeDistributionGroupSendAsImpl implements ExchangeDistributionGroupSendAs { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private long taskPendingId;

	public ExchangeDistributionGroupSendAsImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeDistributionGroupSendAsImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangeDistributionGroupSendAsImpl allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeDistributionGroupSendAsImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
