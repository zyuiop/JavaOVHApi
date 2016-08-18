package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * VolumeQuotas
 */

public class VolumeQuotas { 

	private long maxGigabytes;
	private long volumeCount;
	private long usedGigabytes;

	public VolumeQuotas() {
	}

	public long getMaxGigabytes() { 
		return this.maxGigabytes;
	} 

	public void setMaxGigabytes(long maxGigabytes) { 
		this.maxGigabytes = maxGigabytes;
	} 

	public VolumeQuotas maxGigabytes(long maxGigabytes) { 
		this.maxGigabytes = maxGigabytes;
		return this;
	} 

	public long getVolumeCount() { 
		return this.volumeCount;
	} 

	public void setVolumeCount(long volumeCount) { 
		this.volumeCount = volumeCount;
	} 

	public VolumeQuotas volumeCount(long volumeCount) { 
		this.volumeCount = volumeCount;
		return this;
	} 

	public long getUsedGigabytes() { 
		return this.usedGigabytes;
	} 

	public void setUsedGigabytes(long usedGigabytes) { 
		this.usedGigabytes = usedGigabytes;
	} 

	public VolumeQuotas usedGigabytes(long usedGigabytes) { 
		this.usedGigabytes = usedGigabytes;
		return this;
	} 

}
