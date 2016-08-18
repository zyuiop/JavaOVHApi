package net.zyuiop.ovhapi.api.objects.veeamcloudconnect;

/**
 * Veeam Backup Repository
 */

public class BackupRepository { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed;
	private java.lang.String inventoryName;

	public BackupRepository() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuota() { 
		return this.quota;
	} 

	public void setQuota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
	} 

	public BackupRepository quota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public BackupRepository quotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public java.lang.String getInventoryName() { 
		return this.inventoryName;
	} 

	public void setInventoryName(java.lang.String inventoryName) { 
		this.inventoryName = inventoryName;
	} 

	public BackupRepository inventoryName(java.lang.String inventoryName) { 
		this.inventoryName = inventoryName;
		return this;
	} 

}
