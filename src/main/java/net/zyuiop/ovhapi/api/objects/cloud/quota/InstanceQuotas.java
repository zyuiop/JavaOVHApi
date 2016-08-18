package net.zyuiop.ovhapi.api.objects.cloud.quota;

/**
 * InstanceQuotas
 */

public class InstanceQuotas { 

	private long maxInstances;
	private long maxCores;
	private long maxRam;
	private long usedInstances;
	private long usedRAM;
	private long usedCores;

	public InstanceQuotas() {
	}

	public long getMaxInstances() { 
		return this.maxInstances;
	} 

	public void setMaxInstances(long maxInstances) { 
		this.maxInstances = maxInstances;
	} 

	public InstanceQuotas maxInstances(long maxInstances) { 
		this.maxInstances = maxInstances;
		return this;
	} 

	public long getMaxCores() { 
		return this.maxCores;
	} 

	public void setMaxCores(long maxCores) { 
		this.maxCores = maxCores;
	} 

	public InstanceQuotas maxCores(long maxCores) { 
		this.maxCores = maxCores;
		return this;
	} 

	public long getMaxRam() { 
		return this.maxRam;
	} 

	public void setMaxRam(long maxRam) { 
		this.maxRam = maxRam;
	} 

	public InstanceQuotas maxRam(long maxRam) { 
		this.maxRam = maxRam;
		return this;
	} 

	public long getUsedInstances() { 
		return this.usedInstances;
	} 

	public void setUsedInstances(long usedInstances) { 
		this.usedInstances = usedInstances;
	} 

	public InstanceQuotas usedInstances(long usedInstances) { 
		this.usedInstances = usedInstances;
		return this;
	} 

	public long getUsedRAM() { 
		return this.usedRAM;
	} 

	public void setUsedRAM(long usedRAM) { 
		this.usedRAM = usedRAM;
	} 

	public InstanceQuotas usedRAM(long usedRAM) { 
		this.usedRAM = usedRAM;
		return this;
	} 

	public long getUsedCores() { 
		return this.usedCores;
	} 

	public void setUsedCores(long usedCores) { 
		this.usedCores = usedCores;
	} 

	public InstanceQuotas usedCores(long usedCores) { 
		this.usedCores = usedCores;
		return this;
	} 

}
