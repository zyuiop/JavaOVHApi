package net.zyuiop.ovhapi.impl.objects.cloud.quota;

import net.zyuiop.ovhapi.api.objects.cloud.quota.KeypairQuotas;
/**
 * KeypairQuotas
 */

public class KeypairQuotasImpl implements KeypairQuotas { 

	private long maxCount;

	public KeypairQuotasImpl() {
	}

	public long getMaxCount() { 
		return this.maxCount;
	} 

	public void setMaxCount(long maxCount) { 
		this.maxCount = maxCount;
	} 

	public KeypairQuotasImpl maxCount(long maxCount) { 
		this.maxCount = maxCount;
		return this;
	} 

}
