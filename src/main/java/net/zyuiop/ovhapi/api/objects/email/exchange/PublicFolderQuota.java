package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get public folder quota usage in total available space
 */

public class PublicFolderQuota { 

	private long quotaUsed;
	private long quotaReserved;
	private long quotaLimit;

	public PublicFolderQuota() {
	}

	public long getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public PublicFolderQuota quotaUsed(long quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public long getQuotaReserved() { 
		return this.quotaReserved;
	} 

	public void setQuotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
	} 

	public PublicFolderQuota quotaReserved(long quotaReserved) { 
		this.quotaReserved = quotaReserved;
		return this;
	} 

	public long getQuotaLimit() { 
		return this.quotaLimit;
	} 

	public void setQuotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
	} 

	public PublicFolderQuota quotaLimit(long quotaLimit) { 
		this.quotaLimit = quotaLimit;
		return this;
	} 

}
