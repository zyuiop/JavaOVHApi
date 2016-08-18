package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server partitions informations
 */

public class RtmPartition { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage;
	private java.lang.String mountPoint;
	private java.lang.String partition;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inodeUsage;

	public RtmPartition() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getUsage() { 
		return this.usage;
	} 

	public void setUsage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage) { 
		this.usage = usage;
	} 

	public RtmPartition usage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue usage) { 
		this.usage = usage;
		return this;
	} 

	public java.lang.String getMountPoint() { 
		return this.mountPoint;
	} 

	public void setMountPoint(java.lang.String mountPoint) { 
		this.mountPoint = mountPoint;
	} 

	public RtmPartition mountPoint(java.lang.String mountPoint) { 
		this.mountPoint = mountPoint;
		return this;
	} 

	public java.lang.String getPartition() { 
		return this.partition;
	} 

	public void setPartition(java.lang.String partition) { 
		this.partition = partition;
	} 

	public RtmPartition partition(java.lang.String partition) { 
		this.partition = partition;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getInodeUsage() { 
		return this.inodeUsage;
	} 

	public void setInodeUsage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inodeUsage) { 
		this.inodeUsage = inodeUsage;
	} 

	public RtmPartition inodeUsage(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue inodeUsage) { 
		this.inodeUsage = inodeUsage;
		return this;
	} 

}
