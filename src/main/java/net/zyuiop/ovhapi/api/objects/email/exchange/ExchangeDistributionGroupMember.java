package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Mailing list members
 */

public class ExchangeDistributionGroupMember { 

	private long memberContactId;
	private java.util.Date creationDate;
	private long memberAccountId;
	private long taskPendingId;
	private java.lang.String memberEmailAddress;

	public ExchangeDistributionGroupMember() {
	}

	public long getMemberContactId() { 
		return this.memberContactId;
	} 

	public void setMemberContactId(long memberContactId) { 
		this.memberContactId = memberContactId;
	} 

	public ExchangeDistributionGroupMember memberContactId(long memberContactId) { 
		this.memberContactId = memberContactId;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public ExchangeDistributionGroupMember creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getMemberAccountId() { 
		return this.memberAccountId;
	} 

	public void setMemberAccountId(long memberAccountId) { 
		this.memberAccountId = memberAccountId;
	} 

	public ExchangeDistributionGroupMember memberAccountId(long memberAccountId) { 
		this.memberAccountId = memberAccountId;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public ExchangeDistributionGroupMember taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public java.lang.String getMemberEmailAddress() { 
		return this.memberEmailAddress;
	} 

	public void setMemberEmailAddress(java.lang.String memberEmailAddress) { 
		this.memberEmailAddress = memberEmailAddress;
	} 

	public ExchangeDistributionGroupMember memberEmailAddress(java.lang.String memberEmailAddress) { 
		this.memberEmailAddress = memberEmailAddress;
		return this;
	} 

}
