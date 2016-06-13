package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountAlias;
/**
 * Aliases on this mailbox
 */

public class ExchangeAccountAliasImpl implements ExchangeAccountAlias { 

	private java.util.Date creationDate;
	private java.lang.String alias;
	private long taskPendingId;

	public ExchangeAccountAliasImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeAccountAliasImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getAlias() { 
		return this.alias;
	} 

	public void setAlias(java.lang.String alias) { 
		this.alias = alias;
	} 

	public ExchangeAccountAliasImpl alias(java.lang.String alias) { 
		this.alias = alias;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeAccountAliasImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
