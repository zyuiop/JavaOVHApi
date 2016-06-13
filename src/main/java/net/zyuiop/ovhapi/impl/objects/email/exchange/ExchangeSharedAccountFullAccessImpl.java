package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountFullAccess;
/**
 * Users having full access on this shared mailbox
 */

public class ExchangeSharedAccountFullAccessImpl implements ExchangeSharedAccountFullAccess { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private long taskPendingId;

	public ExchangeSharedAccountFullAccessImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeSharedAccountFullAccessImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangeSharedAccountFullAccessImpl allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeSharedAccountFullAccessImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
