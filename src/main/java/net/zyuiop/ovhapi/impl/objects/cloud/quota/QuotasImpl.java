package net.zyuiop.ovhapi.impl.objects.cloud.quota;

import net.zyuiop.ovhapi.api.objects.cloud.quota.Quotas;
/**
 * Quotas
 */

public class QuotasImpl implements Quotas { 

	private net.zyuiop.ovhapi.impl.objects.cloud.quota.KeypairQuotasImpl keypair;
	private net.zyuiop.ovhapi.impl.objects.cloud.quota.VolumeQuotasImpl volume;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.cloud.quota.InstanceQuotasImpl instance;

	public QuotasImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.cloud.quota.KeypairQuotasImpl getKeypair() { 
		return this.keypair;
	} 

	public void setKeypair(net.zyuiop.ovhapi.impl.objects.cloud.quota.KeypairQuotasImpl keypair) { 
		this.keypair = keypair;
	} 

	public QuotasImpl keypair(net.zyuiop.ovhapi.impl.objects.cloud.quota.KeypairQuotasImpl keypair) { 
		this.keypair = keypair;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.quota.VolumeQuotasImpl getVolume() { 
		return this.volume;
	} 

	public void setVolume(net.zyuiop.ovhapi.impl.objects.cloud.quota.VolumeQuotasImpl volume) { 
		this.volume = volume;
	} 

	public QuotasImpl volume(net.zyuiop.ovhapi.impl.objects.cloud.quota.VolumeQuotasImpl volume) { 
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

	public net.zyuiop.ovhapi.impl.objects.cloud.quota.InstanceQuotasImpl getInstance() { 
		return this.instance;
	} 

	public void setInstance(net.zyuiop.ovhapi.impl.objects.cloud.quota.InstanceQuotasImpl instance) { 
		this.instance = instance;
	} 

	public QuotasImpl instance(net.zyuiop.ovhapi.impl.objects.cloud.quota.InstanceQuotasImpl instance) { 
		this.instance = instance;
		return this;
	} 

}
