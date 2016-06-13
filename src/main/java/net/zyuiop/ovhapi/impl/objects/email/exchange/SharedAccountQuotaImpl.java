package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccountQuota;
/**
 * Get shared account quota usage in total available space
 */

public class SharedAccountQuotaImpl implements SharedAccountQuota { 

	private long quotaUsed;
	private long quotaReserved;
	private long quotaLimit;

	public SharedAccountQuotaImpl() {
	}

	public long getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public SharedAccountQuotaImpl quotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public long getQuotaReserved() { 
		return this.quotaReserved;
	} 

	public void setQuotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
	} 

	public SharedAccountQuotaImpl quotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
		return this;
	} 

	public long getQuotaLimit() { 
		return this.quotaLimit;
	} 

	public void setQuotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
	} 

	public SharedAccountQuotaImpl quotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
		return this;
	} 

}
