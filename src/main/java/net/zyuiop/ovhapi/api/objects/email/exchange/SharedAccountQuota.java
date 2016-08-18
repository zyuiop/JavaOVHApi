package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get shared account quota usage in total available space
 */

public class SharedAccountQuota { 

	private long quotaUsed;
	private long quotaReserved;
	private long quotaLimit;

	public SharedAccountQuota() {
	}

	public long getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public SharedAccountQuota quotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public long getQuotaReserved() { 
		return this.quotaReserved;
	} 

	public void setQuotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
	} 

	public SharedAccountQuota quotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
		return this;
	} 

	public long getQuotaLimit() { 
		return this.quotaLimit;
	} 

	public void setQuotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
	} 

	public SharedAccountQuota quotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
		return this;
	} 

}
