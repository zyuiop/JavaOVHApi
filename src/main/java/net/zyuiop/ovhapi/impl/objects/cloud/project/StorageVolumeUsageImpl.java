package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage;
/**
 * Storage volume used on your project
 */

public class StorageVolumeUsageImpl implements StorageVolumeUsage { 

	private long storedBytes;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl total;

	public StorageVolumeUsageImpl() {
	}

	public long getStoredBytes() { 
		return this.storedBytes;
	} 

	public void setStoredBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
	} 

	public StorageVolumeUsageImpl storedBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public StorageVolumeUsageImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total) { 
		this.total = total;
	} 

	public StorageVolumeUsageImpl total(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total) { 
		this.total = total;
		return this;
	} 

}
