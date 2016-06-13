package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeMailingListAlias;
/**
 * Get aliases on this mailingList
 */

public class ExchangeMailingListAliasImpl implements ExchangeMailingListAlias { 

	private java.util.Date creationDate;
	private java.lang.String alias;
	private long taskPendingId;

	public ExchangeMailingListAliasImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeMailingListAliasImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAlias() { 
		return this.alias;
	} 

	public void setAlias(java.lang.String alias) { 
		this.alias = alias;
	} 

	public ExchangeMailingListAliasImpl alias(java.lang.String alias) { 
		this.alias = alias;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeMailingListAliasImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
