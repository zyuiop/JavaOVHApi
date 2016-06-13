package net.zyuiop.ovhapi.impl.objects.iploadbalancing;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.Ip;
/**
 * Your IP load balancing
 */

public class IpImpl implements Ip { 

	private java.lang.String zone;
	private java.lang.String serviceName;
	private java.lang.String ipLoadbalancing;
	private java.lang.String state;

	public IpImpl() {
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

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public IpImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getIpLoadbalancing() { 
		return this.ipLoadbalancing;
	} 

	public void setIpLoadbalancing(java.lang.String ipLoadbalancing) { 
		this.ipLoadbalancing = ipLoadbalancing;
	} 

	public IpImpl ipLoadbalancing(java.lang.String ipLoadbalancing) { 
		this.ipLoadbalancing = ipLoadbalancing;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public IpImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
