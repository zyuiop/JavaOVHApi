package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp;
/**
 * Backends attached to your IP load balancing
 */

public class LoadBalancingBackendIpImpl implements LoadBalancingBackendIp { 

	private java.lang.String mainBackendIp;
	private java.lang.String zone;
	private java.lang.String backend;
	private long weight;
	private java.lang.String probe;

	public LoadBalancingBackendIpImpl() {
	}

	public java.lang.String getMainBackendIp() { 
		return this.mainBackendIp;
	} 

	public void setMainBackendIp(java.lang.String mainBackendIp) { 
		this.mainBackendIp = mainBackendIp;
	} 

	public LoadBalancingBackendIpImpl mainBackendIp(java.lang.String mainBackendIp) { 
		this.mainBackendIp = mainBackendIp;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public LoadBalancingBackendIpImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getBackend() { 
		return this.backend;
	} 

	public void setBackend(java.lang.String backend) { 
		this.backend = backend;
	} 

	public LoadBalancingBackendIpImpl backend(java.lang.String backend) { 
		this.backend = backend;
		return this;
	} 

	public long getWeight() { 
		return this.weight;
	} 

	public void setWeight(long weight) { 
		this.weight = weight;
	} 

	public LoadBalancingBackendIpImpl weight(long weight) { 
		this.weight = weight;
		return this;
	} 

	public java.lang.String getProbe() { 
		return this.probe;
	} 

	public void setProbe(java.lang.String probe) { 
		this.probe = probe;
	} 

	public LoadBalancingBackendIpImpl probe(java.lang.String probe) { 
		this.probe = probe;
		return this;
	} 

}
