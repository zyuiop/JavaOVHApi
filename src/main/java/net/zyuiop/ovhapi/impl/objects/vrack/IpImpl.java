package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.Ip;
/**
 * IP block in vrack
 */

public class IpImpl implements Ip { 

	private java.lang.String ip;
	private java.lang.String zone;
	private java.lang.String gateway;

	public IpImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public IpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public IpImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getGateway() { 
		return this.gateway;
	} 

	public void setGateway(java.lang.String gateway) { 
		this.gateway = gateway;
	} 

	public IpImpl gateway(java.lang.String gateway) { 
		this.gateway = gateway;
		return this;
	} 

}
