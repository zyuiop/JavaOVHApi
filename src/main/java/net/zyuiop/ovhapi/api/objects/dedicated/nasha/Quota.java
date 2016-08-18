package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Partition Quota
 */

public class Quota { 

	private long uid;
	private long size;

	public Quota() {
	}

	public long getUid() { 
		return this.uid;
	} 

	public void setUid(long uid) { 
		this.uid = uid;
	} 

	public Quota uid(long uid) { 
		this.uid = uid;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public Quota size(long size) { 
		this.size = size;
		return this;
	} 

}
