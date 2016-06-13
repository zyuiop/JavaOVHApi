package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolderQuota;
/**
 * Get public folder quota usage in total available space
 */

public class PublicFolderQuotaImpl implements PublicFolderQuota { 

	private long quotaUsed;
	private long quotaReserved;
	private long quotaLimit;

	public PublicFolderQuotaImpl() {
	}

	public long getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public PublicFolderQuotaImpl quotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public long getQuotaReserved() { 
		return this.quotaReserved;
	} 

	public void setQuotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
	} 

	public PublicFolderQuotaImpl quotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
		return this;
	} 

	public long getQuotaLimit() { 
		return this.quotaLimit;
	} 

	public void setQuotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
	} 

	public PublicFolderQuotaImpl quotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
		return this;
	} 

}
