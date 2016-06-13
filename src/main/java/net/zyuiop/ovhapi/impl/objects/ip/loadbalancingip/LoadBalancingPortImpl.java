package net.zyuiop.ovhapi.impl.objects.ip.loadbalancingip;

import net.zyuiop.ovhapi.api.objects.ip.loadbalancingip.LoadBalancingPort;
/**
 * LoadBalancingPort mapping
 */

public class LoadBalancingPortImpl implements LoadBalancingPort { 

	private long srcPort;
	private long dstPort;

	public LoadBalancingPortImpl() {
	}

	public long getSrcPort() { 
		return this.srcPort;
	} 

	public void setSrcPort(long srcPort) { 
		this.srcPort = srcPort;
	} 

	public LoadBalancingPortImpl srcPort(long srcPort) { 
		this.srcPort = srcPort;
		return this;
	} 

	public long getDstPort() { 
		return this.dstPort;
	} 

	public void setDstPort(long dstPort) { 
		this.dstPort = dstPort;
	} 

	public LoadBalancingPortImpl dstPort(long dstPort) { 
		this.dstPort = dstPort;
		return this;
	} 

}
