package net.zyuiop.ovhapi.api.objects.dedicated.nas;

/**
 * Storage partition
 */

public class Partition { 

	private java.lang.String protocol;
	private java.lang.String partitionName;
	private long size;

	public Partition() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public Partition protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getPartitionName() { 
		return this.partitionName;
	} 

	public void setPartitionName(java.lang.String partitionName) { 
		this.partitionName = partitionName;
	} 

	public Partition partitionName(java.lang.String partitionName) { 
		this.partitionName = partitionName;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public Partition size(long size) { 
		this.size = size;
		return this;
	} 

}
