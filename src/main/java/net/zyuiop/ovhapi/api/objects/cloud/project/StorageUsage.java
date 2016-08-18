package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Usage information for current month on your project
 */

public class StorageUsage { 

	private net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage[] bandwidth;
	private net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage[] volume;
	private net.zyuiop.ovhapi.api.objects.order.Price total;

	public StorageUsage() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage[] getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage[] bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public StorageUsage bandwidth(net.zyuiop.ovhapi.api.objects.cloud.project.BandwidthStorageUsage[] bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage[] getVolume() { 
		return this.volume;
	} 

	public void setVolume(net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage[] volume) { 
		this.volume = volume;
	} 

	public StorageUsage volume(net.zyuiop.ovhapi.api.objects.cloud.project.StorageVolumeUsage[] volume) { 
		this.volume = volume;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
	} 

	public StorageUsage total(net.zyuiop.ovhapi.api.objects.order.Price total) { 
		this.total = total;
		return this;
	} 

}
