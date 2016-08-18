package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * Quotas
 */

public class Quotas { 

	private net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair;
	private net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance;

	public Quotas() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas getKeypair() { 
		return this.keypair;
	} 

	public void setKeypair(net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair) { 
		this.keypair = keypair;
	} 

	public Quotas keypair(net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair) { 
		this.keypair = keypair;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas getVolume() { 
		return this.volume;
	} 

	public void setVolume(net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume) { 
		this.volume = volume;
	} 

	public Quotas volume(net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume) { 
		this.volume = volume;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Quotas region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas getInstance() { 
		return this.instance;
	} 

	public void setInstance(net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance) { 
		this.instance = instance;
	} 

	public Quotas instance(net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance) { 
		this.instance = instance;
		return this;
	} 

}
