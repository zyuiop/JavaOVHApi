package net.zyuiop.ovhapi.impl.objects.dedicated.installationtemplate;

import net.zyuiop.ovhapi.api.objects.dedicated.installationtemplate.HardwareRaid;
/**
 * Hardware RAID defined in this partitioning scheme
 */

public class HardwareRaidImpl implements HardwareRaid { 

	private long step;
	private java.lang.String[] disks;
	private java.lang.String mode;
	private java.lang.String name;

	public HardwareRaidImpl() {
	}

	public long getStep() { 
		return this.step;
	} 

	public void setStep(long step) { 
		this.step = step;
	} 

	public HardwareRaidImpl step(long step) { 
		this.step = step;
		return this;
	} 

	public java.lang.String[] getDisks() { 
		return this.disks;
	} 

	public void setDisks(java.lang.String[] disks) { 
		this.disks = disks;
	} 

	public HardwareRaidImpl disks(java.lang.String[] disks) { 
		this.disks = disks;
		return this;
	} 

	public java.lang.String getMode() { 
		return this.mode;
	} 

	public void setMode(java.lang.String mode) { 
		this.mode = mode;
	} 

	public HardwareRaidImpl mode(java.lang.String mode) { 
		this.mode = mode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HardwareRaidImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
