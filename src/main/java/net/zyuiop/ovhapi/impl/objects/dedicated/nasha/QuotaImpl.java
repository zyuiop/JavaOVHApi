package net.zyuiop.ovhapi.impl.objects.dedicated.nasha;

import net.zyuiop.ovhapi.api.objects.dedicated.nasha.Quota;
/**
 * Partition Quota
 */

public class QuotaImpl implements Quota { 

	private long uid;
	private long size;

	public QuotaImpl() {
	}

	public long getUid() { 
		return this.uid;
	} 

	public void setUid(long uid) { 
		this.uid = uid;
	} 

	public QuotaImpl uid(long uid) { 
		this.uid = uid;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public QuotaImpl size(long size) { 
		this.size = size;
		return this;
	} 

}
