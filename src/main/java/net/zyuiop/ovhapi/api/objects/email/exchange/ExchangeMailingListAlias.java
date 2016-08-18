package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get aliases on this mailingList
 */

public class ExchangeMailingListAlias { 

	private java.util.Date creationDate;
	private java.lang.String alias;
	private long taskPendingId;

	public ExchangeMailingListAlias() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeMailingListAlias creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAlias() { 
		return this.alias;
	} 

	public void setAlias(java.lang.String alias) { 
		this.alias = alias;
	} 

	public ExchangeMailingListAlias alias(java.lang.String alias) { 
		this.alias = alias;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeMailingListAlias taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
