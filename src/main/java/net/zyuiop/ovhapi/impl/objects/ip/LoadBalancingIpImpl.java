package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.LoadBalancingIp;
/**
 * Your load balancing IP
 */

public class LoadBalancingIpImpl implements LoadBalancingIp { 

	private java.lang.String ssl;
	private java.lang.String[] zone;
	private java.lang.String ipLoadBalancing;
	private java.lang.String serviceName;
	private java.lang.String state;
	private java.lang.String stickiness;

	public LoadBalancingIpImpl() {
	}

	public java.lang.String getSsl() { 
		return this.ssl;
	} 

	public void setSsl(java.lang.String ssl) { 
		this.ssl = ssl;
	} 

	public LoadBalancingIpImpl ssl(java.lang.String ssl) { 
		this.ssl = ssl;
		return this;
	} 

	public java.lang.String[] getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String[] zone) { 
		this.zone = zone;
	} 

	public LoadBalancingIpImpl zone(java.lang.String[] zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getIpLoadBalancing() { 
		return this.ipLoadBalancing;
	} 

	public void setIpLoadBalancing(java.lang.String ipLoadBalancing) { 
		this.ipLoadBalancing = ipLoadBalancing;
	} 

	public LoadBalancingIpImpl ipLoadBalancing(java.lang.String ipLoadBalancing) { 
		this.ipLoadBalancing = ipLoadBalancing;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public LoadBalancingIpImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public LoadBalancingIpImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getStickiness() { 
		return this.stickiness;
	} 

	public void setStickiness(java.lang.String stickiness) { 
		this.stickiness = stickiness;
	} 

	public LoadBalancingIpImpl stickiness(java.lang.String stickiness) { 
		this.stickiness = stickiness;
		return this;
	} 

}
