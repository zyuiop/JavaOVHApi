package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Disk attached to a RAID controller
 */

public class HardwareRaidDiskGroup { 

	private java.lang.String[] names;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue speed;
	private java.lang.String type;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;

	public HardwareRaidDiskGroup() {
	}

	public java.lang.String[] getNames() { 
		return this.names;
	} 

	public void setNames(java.lang.String[] names) { 
		this.names = names;
	} 

	public HardwareRaidDiskGroup names(java.lang.String[] names) { 
		this.names = names;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getSpeed() { 
		return this.speed;
	} 

	public void setSpeed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue speed) { 
		this.speed = speed;
	} 

	public HardwareRaidDiskGroup speed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue speed) { 
		this.speed = speed;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public HardwareRaidDiskGroup type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public HardwareRaidDiskGroup capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

}
