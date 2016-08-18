package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server raid volume port informations
 */

public class RtmRaidVolumePort { 

	private java.lang.String syncprogress;
	private java.lang.String disk;
	private java.lang.String serial;
	private java.lang.String status;
	private java.lang.String model;
	private java.lang.String port;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;

	public RtmRaidVolumePort() {
	}

	public java.lang.String getSyncprogress() { 
		return this.syncprogress;
	} 

	public void setSyncprogress(java.lang.String syncprogress) { 
		this.syncprogress = syncprogress;
	} 

	public RtmRaidVolumePort syncprogress(java.lang.String syncprogress) { 
		this.syncprogress = syncprogress;
		return this;
	} 

	public java.lang.String getDisk() { 
		return this.disk;
	} 

	public void setDisk(java.lang.String disk) { 
		this.disk = disk;
	} 

	public RtmRaidVolumePort disk(java.lang.String disk) { 
		this.disk = disk;
		return this;
	} 

	public java.lang.String getSerial() { 
		return this.serial;
	} 

	public void setSerial(java.lang.String serial) { 
		this.serial = serial;
	} 

	public RtmRaidVolumePort serial(java.lang.String serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public RtmRaidVolumePort status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getModel() { 
		return this.model;
	} 

	public void setModel(java.lang.String model) { 
		this.model = model;
	} 

	public RtmRaidVolumePort model(java.lang.String model) { 
		this.model = model;
		return this;
	} 

	public java.lang.String getPort() { 
		return this.port;
	} 

	public void setPort(java.lang.String port) { 
		this.port = port;
	} 

	public RtmRaidVolumePort port(java.lang.String port) { 
		this.port = port;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public RtmRaidVolumePort capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

}
