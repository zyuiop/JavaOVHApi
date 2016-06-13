package net.zyuiop.ovhapi.impl.objects.dedicated.nas;

import net.zyuiop.ovhapi.api.objects.dedicated.nas.Partition;
/**
 * Storage partition
 */

public class PartitionImpl implements Partition { 

	private java.lang.String protocol;
	private java.lang.String partitionName;
	private long size;

	public PartitionImpl() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public PartitionImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getPartitionName() { 
		return this.partitionName;
	} 

	public void setPartitionName(java.lang.String partitionName) { 
		this.partitionName = partitionName;
	} 

	public PartitionImpl partitionName(java.lang.String partitionName) { 
		this.partitionName = partitionName;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public PartitionImpl size(long size) { 
		this.size = size;
		return this;
	} 

}
