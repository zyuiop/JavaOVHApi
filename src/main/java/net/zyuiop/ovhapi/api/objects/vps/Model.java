package net.zyuiop.ovhapi.api.objects.vps;

/**
 * A structure describing characteristics of a VPS model
 */

public class Model { 

	private long maximumAdditionnalIp;
	private java.lang.String[] datacenter;
	private long disk;
	private java.lang.String offer;
	private java.lang.String version;
	private java.lang.String name;
	private java.lang.String[] availableOptions;
	private long memory;
	private long vcore;

	public Model() {
	}

	public long getMaximumAdditionnalIp() { 
		return this.maximumAdditionnalIp;
	} 

	public void setMaximumAdditionnalIp(long maximumAdditionnalIp) { 
		this.maximumAdditionnalIp = maximumAdditionnalIp;
	} 

	public Model maximumAdditionnalIp(long maximumAdditionnalIp) { 
		this.maximumAdditionnalIp = maximumAdditionnalIp;
		return this;
	} 

	public java.lang.String[] getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String[] datacenter) { 
		this.datacenter = datacenter;
	} 

	public Model datacenter(java.lang.String[] datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public long getDisk() { 
		return this.disk;
	} 

	public void setDisk(long disk) { 
		this.disk = disk;
	} 

	public Model disk(long disk) { 
		this.disk = disk;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public Model offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public Model version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Model name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String[] getAvailableOptions() { 
		return this.availableOptions;
	} 

	public void setAvailableOptions(java.lang.String[] availableOptions) { 
		this.availableOptions = availableOptions;
	} 

	public Model availableOptions(java.lang.String[] availableOptions) { 
		this.availableOptions = availableOptions;
		return this;
	} 

	public long getMemory() { 
		return this.memory;
	} 

	public void setMemory(long memory) { 
		this.memory = memory;
	} 

	public Model memory(long memory) { 
		this.memory = memory;
		return this;
	} 

	public long getVcore() { 
		return this.vcore;
	} 

	public void setVcore(long vcore) { 
		this.vcore = vcore;
	} 

	public Model vcore(long vcore) { 
		this.vcore = vcore;
		return this;
	} 

}
