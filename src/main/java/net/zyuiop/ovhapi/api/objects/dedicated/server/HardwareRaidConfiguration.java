package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Simulated result of how the hardware RAID template will be configured on this server
 */

public class HardwareRaidConfiguration { 

	private java.lang.String mode;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize;
	private java.lang.String type;
	private long diskSpanSize;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;
	private long diskCount;

	public HardwareRaidConfiguration() {
	}

	public java.lang.String getMode() { 
		return this.mode;
	} 

	public void setMode(java.lang.String mode) { 
		this.mode = mode;
	} 

	public HardwareRaidConfiguration mode(java.lang.String mode) { 
		this.mode = mode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HardwareRaidConfiguration name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getDiskSize() { 
		return this.diskSize;
	} 

	public void setDiskSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize) { 
		this.diskSize = diskSize;
	} 

	public HardwareRaidConfiguration diskSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize) { 
		this.diskSize = diskSize;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public HardwareRaidConfiguration type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getDiskSpanSize() { 
		return this.diskSpanSize;
	} 

	public void setDiskSpanSize(long diskSpanSize) { 
		this.diskSpanSize = diskSpanSize;
	} 

	public HardwareRaidConfiguration diskSpanSize(long diskSpanSize) { 
		this.diskSpanSize = diskSpanSize;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public HardwareRaidConfiguration capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

	public long getDiskCount() { 
		return this.diskCount;
	} 

	public void setDiskCount(long diskCount) { 
		this.diskCount = diskCount;
	} 

	public HardwareRaidConfiguration diskCount(long diskCount) { 
		this.diskCount = diskCount;
		return this;
	} 

}
