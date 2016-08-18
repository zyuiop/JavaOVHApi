package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list managers
 */

public class ExchangeDistributionGroupManager { 

	private java.util.Date creationDate;
	private long managerAccountId;
	private java.lang.String managerEmailAddress;
	private long taskPendingId;

	public ExchangeDistributionGroupManager() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeDistributionGroupManager creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getManagerAccountId() { 
		return this.managerAccountId;
	} 

	public void setManagerAccountId(long managerAccountId) { 
		this.managerAccountId = managerAccountId;
	} 

	public ExchangeDistributionGroupManager managerAccountId(long managerAccountId) { 
		this.managerAccountId = managerAccountId;
		return this;
	} 

	public java.lang.String getManagerEmailAddress() { 
		return this.managerEmailAddress;
	} 

	public void setManagerEmailAddress(java.lang.String managerEmailAddress) { 
		this.managerEmailAddress = managerEmailAddress;
	} 

	public ExchangeDistributionGroupManager managerEmailAddress(java.lang.String managerEmailAddress) { 
		this.managerEmailAddress = managerEmailAddress;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeDistributionGroupManager taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

}
