package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server disks informations
 */

public class RtmDisk { 

	private java.lang.String disk;
	private java.lang.String model;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue temperature;

	public RtmDisk() {
	}

	public java.lang.String getDisk() { 
		return this.disk;
	} 

	public void setDisk(java.lang.String disk) { 
		this.disk = disk;
	} 

	public RtmDisk disk(java.lang.String disk) { 
		this.disk = disk;
		return this;
	} 

	public java.lang.String getModel() { 
		return this.model;
	} 

	public void setModel(java.lang.String model) { 
		this.model = model;
	} 

	public RtmDisk model(java.lang.String model) { 
		this.model = model;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public RtmDisk capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getTemperature() { 
		return this.temperature;
	} 

	public void setTemperature(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue temperature) { 
		this.temperature = temperature;
	} 

	public RtmDisk temperature(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue temperature) { 
		this.temperature = temperature;
		return this;
	} 

}
