package net.zyuiop.ovhapi.api.objects.ip.loadbalancingip;

/**
 * LoadBalancingPort mapping
 */

public class LoadBalancingPort { 

	private long srcPort;
	private long dstPort;

	public LoadBalancingPort() {
	}

	public long getSrcPort() { 
		return this.srcPort;
	} 

	public void setSrcPort(long srcPort) { 
		this.srcPort = srcPort;
	} 

	public LoadBalancingPort srcPort(long srcPort) { 
		this.srcPort = srcPort;
		return this;
	} 

	public long getDstPort() { 
		return this.dstPort;
	} 

	public void setDstPort(long dstPort) { 
		this.dstPort = dstPort;
	} 

	public LoadBalancingPort dstPort(long dstPort) { 
		this.dstPort = dstPort;
		return this;
	} 

}
