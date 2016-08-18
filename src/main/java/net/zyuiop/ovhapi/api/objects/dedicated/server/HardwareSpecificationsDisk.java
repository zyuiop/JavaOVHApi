package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server disks
 */

public class HardwareSpecificationsDisk { 

	private long numberOfDisks;
	private java.lang.String diskType;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize;
	private java.lang.String raidController;

	public HardwareSpecificationsDisk() {
	}

	public long getNumberOfDisks() { 
		return this.numberOfDisks;
	} 

	public void setNumberOfDisks(long numberOfDisks) { 
		this.numberOfDisks = numberOfDisks;
	} 

	public HardwareSpecificationsDisk numberOfDisks(long numberOfDisks) { 
		this.numberOfDisks = numberOfDisks;
		return this;
	} 

	public java.lang.String getDiskType() { 
		return this.diskType;
	} 

	public void setDiskType(java.lang.String diskType) { 
		this.diskType = diskType;
	} 

	public HardwareSpecificationsDisk diskType(java.lang.String diskType) { 
		this.diskType = diskType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getDiskSize() { 
		return this.diskSize;
	} 

	public void setDiskSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize) { 
		this.diskSize = diskSize;
	} 

	public HardwareSpecificationsDisk diskSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskSize) { 
		this.diskSize = diskSize;
		return this;
	} 

	public java.lang.String getRaidController() { 
		return this.raidController;
	} 

	public void setRaidController(java.lang.String raidController) { 
		this.raidController = raidController;
	} 

	public HardwareSpecificationsDisk raidController(java.lang.String raidController) { 
		this.raidController = raidController;
		return this;
	} 

}
