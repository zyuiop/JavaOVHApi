package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Disk;
/**
 * Information about a disk of a VPS Virtual Machine
 */

public class DiskImpl implements Disk { 

	private boolean monitoring;
	private long lowFreeSpaceThreshold;
	private long id;
	private long bandwidthLimit;
	private java.lang.String type;
	private long size;
	private java.lang.String state;

	public DiskImpl() {
	}

	public boolean getMonitoring() { 
		return this.monitoring;
	} 

	public void setMonitoring(boolean monitoring) { 
		this.monitoring = monitoring;
	} 

	public DiskImpl monitoring(boolean monitoring) { 
		this.monitoring = monitoring;
		return this;
	} 

	public long getLowFreeSpaceThreshold() { 
		return this.lowFreeSpaceThreshold;
	} 

	public void setLowFreeSpaceThreshold(long lowFreeSpaceThreshold) { 
		this.lowFreeSpaceThreshold = lowFreeSpaceThreshold;
	} 

	public DiskImpl lowFreeSpaceThreshold(long lowFreeSpaceThreshold) { 
		this.lowFreeSpaceThreshold = lowFreeSpaceThreshold;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DiskImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public long getBandwidthLimit() { 
		return this.bandwidthLimit;
	} 

	public void setBandwidthLimit(long bandwidthLimit) { 
		this.bandwidthLimit = bandwidthLimit;
	} 

	public DiskImpl bandwidthLimit(long bandwidthLimit) { 
		this.bandwidthLimit = bandwidthLimit;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public DiskImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public DiskImpl size(long size) { 
		this.size = size;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public DiskImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
