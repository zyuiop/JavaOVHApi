package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing the server's hardware RAID configuration
 */

public class HardwareRaidProfile { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidController[] controllers;

	public HardwareRaidProfile() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidController[] getControllers() { 
		return this.controllers;
	} 

	public void setControllers(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidController[] controllers) { 
		this.controllers = controllers;
	} 

	public HardwareRaidProfile controllers(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidController[] controllers) { 
		this.controllers = controllers;
		return this;
	} 

}
