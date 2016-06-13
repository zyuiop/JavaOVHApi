package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmPci;
/**
 * A structure describing informations about server PCI devices
 */

public class RtmPciImpl implements RtmPci { 

	private java.lang.String bus;
	private java.lang.String device;

	public RtmPciImpl() {
	}

	public java.lang.String getBus() { 
		return this.bus;
	} 

	public void setBus(java.lang.String bus) { 
		this.bus = bus;
	} 

	public RtmPciImpl bus(java.lang.String bus) { 
		this.bus = bus;
		return this;
	} 

	public java.lang.String getDevice() { 
		return this.device;
	} 

	public void setDevice(java.lang.String device) { 
		this.device = device;
	} 

	public RtmPciImpl device(java.lang.String device) { 
		this.device = device;
		return this;
	} 

}
