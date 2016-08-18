package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Storage volume used on your project
 */

public class StorageVolumeUsage { 

	private long storedBytes;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public StorageVolumeUsage() {
	}

	public long getStoredBytes() { 
		return this.storedBytes;
	} 

	public void setStoredBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
	} 

	public StorageVolumeUsage storedBytes(long storedBytes) { 
		this.storedBytes = storedBytes;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public StorageVolumeUsage region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public StorageVolumeUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
