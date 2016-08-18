package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * RAID controller configuration
 */

public class HardwareRaidController { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidDiskGroup[] disks;
	private java.lang.String model;
	private java.lang.String type;

	public HardwareRaidController() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidDiskGroup[] getDisks() { 
		return this.disks;
	} 

	public void setDisks(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidDiskGroup[] disks) { 
		this.disks = disks;
	} 

	public HardwareRaidController disks(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidDiskGroup[] disks) { 
		this.disks = disks;
		return this;
	} 

	public java.lang.String getModel() { 
		return this.model;
	} 

	public void setModel(java.lang.String model) { 
		this.model = model;
	} 

	public HardwareRaidController model(java.lang.String model) { 
		this.model = model;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public HardwareRaidController type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
