package net.zyuiop.ovhapi.impl.objects.cloud.quota;

import net.zyuiop.ovhapi.api.objects.cloud.quota.InstanceQuotas;
/**
 * InstanceQuotas
 */

public class InstanceQuotasImpl implements InstanceQuotas { 

	private long maxInstances;
	private long maxCores;
	private long maxRam;
	private long usedInstances;
	private long usedRAM;
	private long usedCores;

	public InstanceQuotasImpl() {
	}

	public long getMaxInstances() { 
		return this.maxInstances;
	} 

	public void setMaxInstances(long maxInstances) { 
		this.maxInstances = maxInstances;
	} 

	public InstanceQuotasImpl maxInstances(long maxInstances) { 
		this.maxInstances = maxInstances;
		return this;
	} 

	public long getMaxCores() { 
		return this.maxCores;
	} 

	public void setMaxCores(long maxCores) { 
		this.maxCores = maxCores;
	} 

	public InstanceQuotasImpl maxCores(long maxCores) { 
		this.maxCores = maxCores;
		return this;
	} 

	public long getMaxRam() { 
		return this.maxRam;
	} 

	public void setMaxRam(long maxRam) { 
		this.maxRam = maxRam;
	} 

	public InstanceQuotasImpl maxRam(long maxRam) { 
		this.maxRam = maxRam;
		return this;
	} 

	public long getUsedInstances() { 
		return this.usedInstances;
	} 

	public void setUsedInstances(long usedInstances) { 
		this.usedInstances = usedInstances;
	} 

	public InstanceQuotasImpl usedInstances(long usedInstances) { 
		this.usedInstances = usedInstances;
		return this;
	} 

	public long getUsedRAM() { 
		return this.usedRAM;
	} 

	public void setUsedRAM(long usedRAM) { 
		this.usedRAM = usedRAM;
	} 

	public InstanceQuotasImpl usedRAM(long usedRAM) { 
		this.usedRAM = usedRAM;
		return this;
	} 

	public long getUsedCores() { 
		return this.usedCores;
	} 

	public void setUsedCores(long usedCores) { 
		this.usedCores = usedCores;
	} 

	public InstanceQuotasImpl usedCores(long usedCores) { 
		this.usedCores = usedCores;
		return this;
	} 

}
