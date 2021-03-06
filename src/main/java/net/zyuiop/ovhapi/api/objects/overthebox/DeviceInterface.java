package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Infos about a network interface
 */

public class DeviceInterface { 

	private java.lang.String publicIp;
	private java.lang.String multipathStatus;
	private java.lang.String ip;
	private java.lang.String gateway;
	private java.lang.String name;
	private java.lang.String[] dnsServers;
	private java.lang.String netmask;

	public DeviceInterface() {
	}

	public java.lang.String getPublicIp() { 
		return this.publicIp;
	} 

	public void setPublicIp(java.lang.String publicIp) { 
		this.publicIp = publicIp;
	} 

	public DeviceInterface publicIp(java.lang.String publicIp) { 
		this.publicIp = publicIp;
		return this;
	} 

	public java.lang.String getMultipathStatus() { 
		return this.multipathStatus;
	} 

	public void setMultipathStatus(java.lang.String multipathStatus) { 
		this.multipathStatus = multipathStatus;
	} 

	public DeviceInterface multipathStatus(java.lang.String multipathStatus) { 
		this.multipathStatus = multipathStatus;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DeviceInterface ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getGateway() { 
		return this.gateway;
	} 

	public void setGateway(java.lang.String gateway) { 
		this.gateway = gateway;
	} 

	public DeviceInterface gateway(java.lang.String gateway) { 
		this.gateway = gateway;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DeviceInterface name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String[] getDnsServers() { 
		return this.dnsServers;
	} 

	public void setDnsServers(java.lang.String[] dnsServers) { 
		this.dnsServers = dnsServers;
	} 

	public DeviceInterface dnsServers(java.lang.String[] dnsServers) { 
		this.dnsServers = dnsServers;
		return this;
	} 

	public java.lang.String getNetmask() { 
		return this.netmask;
	} 

	public void setNetmask(java.lang.String netmask) { 
		this.netmask = netmask;
	} 

	public DeviceInterface netmask(java.lang.String netmask) { 
		this.netmask = netmask;
		return this;
	} 

}
