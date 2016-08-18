package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Aliases on this mailbox
 */

public class ExchangeAccountAlias { 

	private java.util.Date creationDate;
	private java.lang.String alias;
	private long taskPendingId;

	public ExchangeAccountAlias() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeAccountAlias creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAlias() { 
		return this.alias;
	} 

	public void setAlias(java.lang.String alias) { 
		this.alias = alias;
	} 

	public ExchangeAccountAlias alias(java.lang.String alias) { 
		this.alias = alias;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeAccountAlias taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
