package net.zyuiop.ovhapi.impl.objects.cloud.quota;

import net.zyuiop.ovhapi.api.objects.cloud.quota.Quotas;
/**
 * Quotas
 */

public class QuotasImpl implements Quotas { 

	private net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair;
	private net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance;

	public QuotasImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas getKeypair() { 
		return this.keypair;
	} 

	public void setKeypair(net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair) { 
		this.keypair = keypair;
	} 

	public QuotasImpl keypair(net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas keypair) { 
		this.keypair = keypair;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas getVolume() { 
		return this.volume;
	} 

	public void setVolume(net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume) { 
		this.volume = volume;
	} 

	public QuotasImpl volume(net.zyuiop.ovhapi.api.objects.cloud.quota.VolumeQuotas volume) { 
		this.volume = volume;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public QuotasImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas getInstance() { 
		return this.instance;
	} 

	public void setInstance(net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance) { 
		this.instance = instance;
	} 

	public QuotasImpl instance(net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas instance) { 
		this.instance = instance;
		return this;
	} 

}
