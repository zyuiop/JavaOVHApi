package net.zyuiop.ovhapi.impl.objects.iploadbalancing.ip;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.ip.ProbeIp;
/**
 * ProbeIp mapping
 */

public class ProbeIpImpl implements ProbeIp { 

	private java.lang.String zone;
	private java.lang.String[] ip;

	public ProbeIpImpl() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public ProbeIpImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String[] getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String[] ip) { 
		this.ip = ip;
	} 

	public ProbeIpImpl ip(java.lang.String[] ip) { 
		this.ip = ip;
		return this;
	} 

}
