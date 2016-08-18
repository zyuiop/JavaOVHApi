package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Resource accounts delegates
 */

public class ExchangeResourceAccountDelegate { 

	private java.util.Date creationDate;
	private long allowedAccountId;
	private java.lang.String delegateEmailAddress;
	private long taskPendingId;

	public ExchangeResourceAccountDelegate() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeResourceAccountDelegate creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getAllowedAccountId() { 
		return this.allowedAccountId;
	} 

	public void setAllowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
	} 

	public ExchangeResourceAccountDelegate allowedAccountId(long allowedAccountId) { 
		this.allowedAccountId = allowedAccountId;
		return this;
	} 

	public java.lang.String getDelegateEmailAddress() { 
		return this.delegateEmailAddress;
	} 

	public void setDelegateEmailAddress(java.lang.String delegateEmailAddress) { 
		this.delegateEmailAddress = delegateEmailAddress;
	} 

	public ExchangeResourceAccountDelegate delegateEmailAddress(java.lang.String delegateEmailAddress) { 
		this.delegateEmailAddress = delegateEmailAddress;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeResourceAccountDelegate taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
