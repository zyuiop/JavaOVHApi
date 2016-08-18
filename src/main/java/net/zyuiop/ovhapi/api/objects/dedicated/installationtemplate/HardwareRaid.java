package net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate;

/**
 * Hardware RAID defined in this partitioning scheme
 */

public class HardwareRaid { 

	private long step;
	private java.lang.String[] disks;
	private java.lang.String mode;
	private java.lang.String name;

	public HardwareRaid() {
	}

	public long getStep() { 
		return this.step;
	} 

	public void setStep(long step) { 
		this.step = step;
	} 

	public HardwareRaid step(long step) { 
		this.step = step;
		return this;
	} 

	public java.lang.String[] getDisks() { 
		return this.disks;
	} 

	public void setDisks(java.lang.String[] disks) { 
		this.disks = disks;
	} 

	public HardwareRaid disks(java.lang.String[] disks) { 
		this.disks = disks;
		return this;
	} 

	public java.lang.String getMode() { 
		return this.mode;
	} 

	public void setMode(java.lang.String mode) { 
		this.mode = mode;
	} 

	public HardwareRaid mode(java.lang.String mode) { 
		this.mode = mode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HardwareRaid name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
