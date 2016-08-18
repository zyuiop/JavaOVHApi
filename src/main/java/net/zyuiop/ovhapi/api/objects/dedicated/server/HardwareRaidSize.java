package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing the server's resulting layout after RAID configuration
 */

public class HardwareRaidSize { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidConfiguration[] configurations;

	public HardwareRaidSize() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidConfiguration[] getConfigurations() { 
		return this.configurations;
	} 

	public void setConfigurations(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidConfiguration[] configurations) { 
		this.configurations = configurations;
	} 

	public HardwareRaidSize configurations(net.zyuiop.ovhapi.api.objects.dedicated.server.HardwareRaidConfiguration[] configurations) { 
		this.configurations = configurations;
		return this;
	} 

}
