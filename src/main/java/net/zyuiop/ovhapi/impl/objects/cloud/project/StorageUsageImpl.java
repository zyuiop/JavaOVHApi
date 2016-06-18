package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.StorageUsage;
/**
 * Usage information for current month on your project
 */

public class StorageUsageImpl implements StorageUsage { 

	private net.zyuiop.ovhapi.impl.objects.cloud.project.BandwidthStorageUsageImpl[] bandwidth;
	private net.zyuiop.ovhapi.impl.objects.cloud.project.StorageVolumeUsageImpl[] volume;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl total;

	public StorageUsageImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.cloud.project.BandwidthStorageUsageImpl[] getBandwidth() { 
		return this.bandwidth;
	} 

	public void setBandwidth(net.zyuiop.ovhapi.impl.objects.cloud.project.BandwidthStorageUsageImpl[] bandwidth) { 
		this.bandwidth = bandwidth;
	} 

	public StorageUsageImpl bandwidth(net.zyuiop.ovhapi.impl.objects.cloud.project.BandwidthStorageUsageImpl[] bandwidth) { 
		this.bandwidth = bandwidth;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.project.StorageVolumeUsageImpl[] getVolume() { 
		return this.volume;
	} 

	public void setVolume(net.zyuiop.ovhapi.impl.objects.cloud.project.StorageVolumeUsageImpl[] volume) { 
		this.volume = volume;
	} 

	public StorageUsageImpl volume(net.zyuiop.ovhapi.impl.objects.cloud.project.StorageVolumeUsageImpl[] volume) { 
		this.volume = volume;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTotal() { 
		return this.total;
	} 

	public void setTotal(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total) { 
		this.total = total;
	} 

	public StorageUsageImpl total(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total) { 
		this.total = total;
		return this;
	} 

}
