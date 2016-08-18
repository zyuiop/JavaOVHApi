package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * KeypairQuotas
 */

public class KeypairQuotas { 

	private long maxCount;

	public KeypairQuotas() {
	}

	public long getMaxCount() { 
		return this.maxCount;
	} 

	public void setMaxCount(long maxCount) { 
		this.maxCount = maxCount;
	} 

	public KeypairQuotas maxCount(long maxCount) { 
		this.maxCount = maxCount;
		return this;
	} 

}
