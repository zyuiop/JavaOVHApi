package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information for current month on your project
 */

public class BandwidthStorageUsage { 

	private java.lang.String region;
	private long downloadedBytes;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public BandwidthStorageUsage() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public BandwidthStorageUsage region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getDownloadedBytes() { 
		return this.downloadedBytes;
	} 

	public void setDownloadedBytes(long downloadedBytes) { 
		this.downloadedBytes = downloadedBytes;
	} 

	public BandwidthStorageUsage downloadedBytes(long downloadedBytes) { 
		this.downloadedBytes = downloadedBytes;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public BandwidthStorageUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
