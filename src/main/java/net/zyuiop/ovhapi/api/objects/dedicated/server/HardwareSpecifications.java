package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about this dedicated server
 */

public class HardwareSpecifications { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memorySize;
	private java.lang.String processorArchitecture;
	private net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareSpecificationsDisk[] diskGroups;
	private java.lang.String defaultHardwareRaidType;
	private java.lang.String processorName;
	private java.lang.String description;
	private long numberOfProcessors;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue[] usbKeys;
	private long coresPerProcessor;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue defaultHardwareRaidSize;
	private java.lang.String motherboard;

	public HardwareSpecifications() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getMemorySize() { 
		return this.memorySize;
	} 

	public void setMemorySize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memorySize) { 
		this.memorySize = memorySize;
	} 

	public HardwareSpecifications memorySize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue memorySize) { 
		this.memorySize = memorySize;
		return this;
	} 

	public java.lang.String getProcessorArchitecture() { 
		return this.processorArchitecture;
	} 

	public void setProcessorArchitecture(java.lang.String processorArchitecture) { 
		this.processorArchitecture = processorArchitecture;
	} 

	public HardwareSpecifications processorArchitecture(java.lang.String processorArchitecture) { 
		this.processorArchitecture = processorArchitecture;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareSpecificationsDisk[] getDiskGroups() { 
		return this.diskGroups;
	} 

	public void setDiskGroups(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareSpecificationsDisk[] diskGroups) { 
		this.diskGroups = diskGroups;
	} 

	public HardwareSpecifications diskGroups(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareSpecificationsDisk[] diskGroups) { 
		this.diskGroups = diskGroups;
		return this;
	} 

	public java.lang.String getDefaultHardwareRaidType() { 
		return this.defaultHardwareRaidType;
	} 

	public void setDefaultHardwareRaidType(java.lang.String defaultHardwareRaidType) { 
		this.defaultHardwareRaidType = defaultHardwareRaidType;
	} 

	public HardwareSpecifications defaultHardwareRaidType(java.lang.String defaultHardwareRaidType) { 
		this.defaultHardwareRaidType = defaultHardwareRaidType;
		return this;
	} 

	public java.lang.String getProcessorName() { 
		return this.processorName;
	} 

	public void setProcessorName(java.lang.String processorName) { 
		this.processorName = processorName;
	} 

	public HardwareSpecifications processorName(java.lang.String processorName) { 
		this.processorName = processorName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public HardwareSpecifications description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getNumberOfProcessors() { 
		return this.numberOfProcessors;
	} 

	public void setNumberOfProcessors(long numberOfProcessors) { 
		this.numberOfProcessors = numberOfProcessors;
	} 

	public HardwareSpecifications numberOfProcessors(long numberOfProcessors) { 
		this.numberOfProcessors = numberOfProcessors;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue[] getUsbKeys() { 
		return this.usbKeys;
	} 

	public void setUsbKeys(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue[] usbKeys) { 
		this.usbKeys = usbKeys;
	} 

	public HardwareSpecifications usbKeys(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue[] usbKeys) { 
		this.usbKeys = usbKeys;
		return this;
	} 

	public long getCoresPerProcessor() { 
		return this.coresPerProcessor;
	} 

	public void setCoresPerProcessor(long coresPerProcessor) { 
		this.coresPerProcessor = coresPerProcessor;
	} 

	public HardwareSpecifications coresPerProcessor(long coresPerProcessor) { 
		this.coresPerProcessor = coresPerProcessor;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getDefaultHardwareRaidSize() { 
		return this.defaultHardwareRaidSize;
	} 

	public void setDefaultHardwareRaidSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue defaultHardwareRaidSize) { 
		this.defaultHardwareRaidSize = defaultHardwareRaidSize;
	} 

	public HardwareSpecifications defaultHardwareRaidSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue defaultHardwareRaidSize) { 
		this.defaultHardwareRaidSize = defaultHardwareRaidSize;
		return this;
	} 

	public java.lang.String getMotherboard() { 
		return this.motherboard;
	} 

	public void setMotherboard(java.lang.String motherboard) { 
		this.motherboard = motherboard;
	} 

	public HardwareSpecifications motherboard(java.lang.String motherboard) { 
		this.motherboard = motherboard;
		return this;
	} 

}
