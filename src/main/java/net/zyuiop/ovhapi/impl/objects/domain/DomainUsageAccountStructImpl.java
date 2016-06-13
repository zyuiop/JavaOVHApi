package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct;
/**
 * Structure of usage account
 */

public class DomainUsageAccountStructImpl implements DomainUsageAccountStruct { 

	private long quota;
	private long emailCount;
	private java.util.Date date;

	public DomainUsageAccountStructImpl() {
	}

	public long getQuota() { 
		return this.quota;
	} 

	public void setQuota(long quota) { 
		this.quota = quota;
	} 

	public DomainUsageAccountStructImpl quota(long quota) { 
		this.quota = quota;
		return this;
	} 

	public long getEmailCount() { 
		return this.emailCount;
	} 

	public void setEmailCount(long emailCount) { 
		this.emailCount = emailCount;
	} 

	public DomainUsageAccountStructImpl emailCount(long emailCount) { 
		this.emailCount = emailCount;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DomainUsageAccountStructImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
