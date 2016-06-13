package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupManager;
/**
 * Mailing list managers
 */

public class ExchangeDistributionGroupManagerImpl implements ExchangeDistributionGroupManager { 

	private java.util.Date creationDate;
	private long managerAccountId;
	private java.lang.String managerEmailAddress;
	private long taskPendingId;

	public ExchangeDistributionGroupManagerImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeDistributionGroupManagerImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getManagerAccountId() { 
		return this.managerAccountId;
	} 

	public void setManagerAccountId(long managerAccountId) { 
		this.managerAccountId = managerAccountId;
	} 

	public ExchangeDistributionGroupManagerImpl managerAccountId(long managerAccountId) { 
		this.managerAccountId = managerAccountId;
		return this;
	} 

	public java.lang.String getManagerEmailAddress() { 
		return this.managerEmailAddress;
	} 

	public void setManagerEmailAddress(java.lang.String managerEmailAddress) { 
		this.managerEmailAddress = managerEmailAddress;
	} 

	public ExchangeDistributionGroupManagerImpl managerEmailAddress(java.lang.String managerEmailAddress) { 
		this.managerEmailAddress = managerEmailAddress;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeDistributionGroupManagerImpl taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
