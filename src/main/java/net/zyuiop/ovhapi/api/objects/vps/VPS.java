package net.zyuiop.ovhapi.api.objects.vps;

/**
 * VPS Virtual Machine
 */

public class VPS { 

	private java.lang.String cluster;
	private long memoryLimit;
	private java.lang.String netbootMode;
	private java.lang.String zone;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.vps.Model model;
	private java.lang.String[] monitoringIpBlocks;
	private java.lang.String keymap;
	private java.lang.String state;
	private long vcore;
	private java.lang.String offerType;
	private boolean slaMonitoring;
	private java.lang.String displayName;

	public VPS() {
	}

	public java.lang.String getCluster() { 
		return this.cluster;
	} 

	public void setCluster(java.lang.String cluster) { 
		this.cluster = cluster;
	} 

	public VPS cluster(java.lang.String cluster) { 
		this.cluster = cluster;
		return this;
	} 

	public long getMemoryLimit() { 
		return this.memoryLimit;
	} 

	public void setMemoryLimit(long memoryLimit) { 
		this.memoryLimit = memoryLimit;
	} 

	public VPS memoryLimit(long memoryLimit) { 
		this.memoryLimit = memoryLimit;
		return this;
	} 

	public java.lang.String getNetbootMode() { 
		return this.netbootMode;
	} 

	public void setNetbootMode(java.lang.String netbootMode) { 
		this.netbootMode = netbootMode;
	} 

	public VPS netbootMode(java.lang.String netbootMode) { 
		this.netbootMode = netbootMode;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public VPS zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VPS name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.vps.Model getModel() { 
		return this.model;
	} 

	public void setModel(net.zyuiop.ovhapi.api.objects.vps.Model model) { 
		this.model = model;
	} 

	public VPS model(net.zyuiop.ovhapi.api.objects.vps.Model model) { 
		this.model = model;
		return this;
	} 

	public java.lang.String[] getMonitoringIpBlocks() { 
		return this.monitoringIpBlocks;
	} 

	public void setMonitoringIpBlocks(java.lang.String[] monitoringIpBlocks) { 
		this.monitoringIpBlocks = monitoringIpBlocks;
	} 

	public VPS monitoringIpBlocks(java.lang.String[] monitoringIpBlocks) { 
		this.monitoringIpBlocks = monitoringIpBlocks;
		return this;
	} 

	public java.lang.String getKeymap() { 
		return this.keymap;
	} 

	public void setKeymap(java.lang.String keymap) { 
		this.keymap = keymap;
	} 

	public VPS keymap(java.lang.String keymap) { 
		this.keymap = keymap;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public VPS state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getVcore() { 
		return this.vcore;
	} 

	public void setVcore(long vcore) { 
		this.vcore = vcore;
	} 

	public VPS vcore(long vcore) { 
		this.vcore = vcore;
		return this;
	} 

	public java.lang.String getOfferType() { 
		return this.offerType;
	} 

	public void setOfferType(java.lang.String offerType) { 
		this.offerType = offerType;
	} 

	public VPS offerType(java.lang.String offerType) { 
		this.offerType = offerType;
		return this;
	} 

	public boolean getSlaMonitoring() { 
		return this.slaMonitoring;
	} 

	public void setSlaMonitoring(boolean slaMonitoring) { 
		this.slaMonitoring = slaMonitoring;
	} 

	public VPS slaMonitoring(boolean slaMonitoring) { 
		this.slaMonitoring = slaMonitoring;
		return this;
	} 

	public java.lang.String getDisplayName() { 
		return this.displayName;
	} 

	public void setDisplayName(java.lang.String displayName) { 
		this.displayName = displayName;
	} 

	public VPS displayName(java.lang.String displayName) { 
		this.displayName = displayName;
		return this;
	} 

}
