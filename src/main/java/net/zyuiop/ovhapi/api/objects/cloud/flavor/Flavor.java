package net.zyuiop.ovhapi.api.objects.cloud.flavor;

/**
 * Flavor
 */

public class Flavor { 

	private long outboundBandwidth;
	private long disk;
	private java.lang.String name;
	private java.lang.String region;
	private java.lang.String osType;
	private long vcpus;
	private java.lang.String type;
	private java.lang.String id;
	private long inboundBandwidth;
	private long ram;

	public Flavor() {
	}

	public long getOutboundBandwidth() { 
		return this.outboundBandwidth;
	} 

	public void setOutboundBandwidth(long outboundBandwidth) { 
		this.outboundBandwidth = outboundBandwidth;
	} 

	public Flavor outboundBandwidth(long outboundBandwidth) { 
		this.outboundBandwidth = outboundBandwidth;
		return this;
	} 

	public long getDisk() { 
		return this.disk;
	} 

	public void setDisk(long disk) { 
		this.disk = disk;
	} 

	public Flavor disk(long disk) { 
		this.disk = disk;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Flavor name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Flavor region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getOsType() { 
		return this.osType;
	} 

	public void setOsType(java.lang.String osType) { 
		this.osType = osType;
	} 

	public Flavor osType(java.lang.String osType) { 
		this.osType = osType;
		return this;
	} 

	public long getVcpus() { 
		return this.vcpus;
	} 

	public void setVcpus(long vcpus) { 
		this.vcpus = vcpus;
	} 

	public Flavor vcpus(long vcpus) { 
		this.vcpus = vcpus;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Flavor type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Flavor id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public long getInboundBandwidth() { 
		return this.inboundBandwidth;
	} 

	public void setInboundBandwidth(long inboundBandwidth) { 
		this.inboundBandwidth = inboundBandwidth;
	} 

	public Flavor inboundBandwidth(long inboundBandwidth) { 
		this.inboundBandwidth = inboundBandwidth;
		return this;
	} 

	public long getRam() { 
		return this.ram;
	} 

	public void setRam(long ram) { 
		this.ram = ram;
	} 

	public Flavor ram(long ram) { 
		this.ram = ram;
		return this;
	} 

}
