package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Detailed information on a node billing profile
 */

public class NodeBillingProfile { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue CPUFrequency;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue networkBandwidth;
	private long nbCPUThreads;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ramQuantity;
	private java.lang.String nodeProfile;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskCapacity;
	private long nbCPUCores;

	public NodeBillingProfile() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCPUFrequency() { 
		return this.CPUFrequency;
	} 

	public void setCPUFrequency(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue CPUFrequency) { 
		this.CPUFrequency = CPUFrequency;
	} 

	public NodeBillingProfile CPUFrequency(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue CPUFrequency) { 
		this.CPUFrequency = CPUFrequency;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getNetworkBandwidth() { 
		return this.networkBandwidth;
	} 

	public void setNetworkBandwidth(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue networkBandwidth) { 
		this.networkBandwidth = networkBandwidth;
	} 

	public NodeBillingProfile networkBandwidth(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue networkBandwidth) { 
		this.networkBandwidth = networkBandwidth;
		return this;
	} 

	public long getNbCPUThreads() { 
		return this.nbCPUThreads;
	} 

	public void setNbCPUThreads(long nbCPUThreads) { 
		this.nbCPUThreads = nbCPUThreads;
	} 

	public NodeBillingProfile nbCPUThreads(long nbCPUThreads) { 
		this.nbCPUThreads = nbCPUThreads;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getRamQuantity() { 
		return this.ramQuantity;
	} 

	public void setRamQuantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ramQuantity) { 
		this.ramQuantity = ramQuantity;
	} 

	public NodeBillingProfile ramQuantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue ramQuantity) { 
		this.ramQuantity = ramQuantity;
		return this;
	} 

	public java.lang.String getNodeProfile() { 
		return this.nodeProfile;
	} 

	public void setNodeProfile(java.lang.String nodeProfile) { 
		this.nodeProfile = nodeProfile;
	} 

	public NodeBillingProfile nodeProfile(java.lang.String nodeProfile) { 
		this.nodeProfile = nodeProfile;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getDiskCapacity() { 
		return this.diskCapacity;
	} 

	public void setDiskCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskCapacity) { 
		this.diskCapacity = diskCapacity;
	} 

	public NodeBillingProfile diskCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue diskCapacity) { 
		this.diskCapacity = diskCapacity;
		return this;
	} 

	public long getNbCPUCores() { 
		return this.nbCPUCores;
	} 

	public void setNbCPUCores(long nbCPUCores) { 
		this.nbCPUCores = nbCPUCores;
	} 

	public NodeBillingProfile nbCPUCores(long nbCPUCores) { 
		this.nbCPUCores = nbCPUCores;
		return this;
	} 

}
