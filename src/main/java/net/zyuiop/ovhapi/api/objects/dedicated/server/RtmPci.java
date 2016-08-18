package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server PCI devices
 */

public class RtmPci { 

	private java.lang.String bus;
	private java.lang.String device;

	public RtmPci() {
	}

	public java.lang.String getBus() { 
		return this.bus;
	} 

	public void setBus(java.lang.String bus) { 
		this.bus = bus;
	} 

	public RtmPci bus(java.lang.String bus) { 
		this.bus = bus;
		return this;
	} 

	public java.lang.String getDevice() { 
		return this.device;
	} 

	public void setDevice(java.lang.String device) { 
		this.device = device;
	} 

	public RtmPci device(java.lang.String device) { 
		this.device = device;
		return this;
	} 

}
