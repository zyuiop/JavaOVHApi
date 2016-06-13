package net.zyuiop.ovhapi.impl.objects.cloud.quota;

import net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas;
/**
 * VolumeQuotas
 */

public class VolumeQuotasImpl implements VolumeQuotas { 

	private long maxGigabytes;
	private long volumeCount;
	private long usedGigabytes;

	public VolumeQuotasImpl() {
	}

	public long getMaxGigabytes() { 
		return this.maxGigabytes;
	} 

	public void setMaxGigabytes(long maxGigabytes) { 
		this.maxGigabytes = maxGigabytes;
	} 

	public VolumeQuotasImpl maxGigabytes(long maxGigabytes) { 
		this.maxGigabytes = maxGigabytes;
		return this;
	} 

	public long getVolumeCount() { 
		return this.volumeCount;
	} 

	public void setVolumeCount(long volumeCount) { 
		this.volumeCount = volumeCount;
	} 

	public VolumeQuotasImpl volumeCount(long volumeCount) { 
		this.volumeCount = volumeCount;
		return this;
	} 

	public long getUsedGigabytes() { 
		return this.usedGigabytes;
	} 

	public void setUsedGigabytes(long usedGigabytes) { 
		this.usedGigabytes = usedGigabytes;
	} 

	public VolumeQuotasImpl usedGigabytes(long usedGigabytes) { 
		this.usedGigabytes = usedGigabytes;
		return this;
	} 

}
