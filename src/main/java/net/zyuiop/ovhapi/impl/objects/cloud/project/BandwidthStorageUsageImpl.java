package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage;
/**
 * Usage information for current month on your project
 */

public class BandwidthStorageUsageImpl implements BandwidthStorageUsage { 

	private java.lang.String region;
	private long downloadedBytes;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public BandwidthStorageUsageImpl() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public BandwidthStorageUsageImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public long getDownloadedBytes() { 
		return this.downloadedBytes;
	} 

	public void setDownloadedBytes(long downloadedBytes) { 
		this.downloadedBytes = downloadedBytes;
	} 

	public BandwidthStorageUsageImpl downloadedBytes(long downloadedBytes) { 
		this.downloadedBytes = downloadedBytes;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public BandwidthStorageUsageImpl total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
