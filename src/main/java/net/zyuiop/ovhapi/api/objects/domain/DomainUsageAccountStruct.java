package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Structure of usage account
 */

public class DomainUsageAccountStruct { 

	private long quota;
	private long emailCount;
	private java.util.Date date;

	public DomainUsageAccountStruct() {
	}

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public DomainUsageAccountStruct quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public long getEmailCount() { 
		return this.emailCount;
	} 

	public void setEmailCount(long emailCount) { 
		this.emailCount = emailCount;
	} 

	public DomainUsageAccountStruct emailCount(long emailCount) { 
		this.emailCount = emailCount;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DomainUsageAccountStruct date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
