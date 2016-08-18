package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Detailed information on a node consumption of a Hadoop Cluster
 */

public class NodeConsumption { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity;
	private java.lang.String nodeProfile;
	private java.lang.String hostname;

	public NodeConsumption() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
	} 

	public NodeConsumption quantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public java.lang.String getNodeProfile() { 
		return this.nodeProfile;
	} 

	public void setNodeProfile(java.lang.String nodeProfile) { 
		this.nodeProfile = nodeProfile;
	} 

	public NodeConsumption nodeProfile(java.lang.String nodeProfile) { 
		this.nodeProfile = nodeProfile;
		return this;
	} 

	public java.lang.String getHostname() { 
		return this.hostname;
	} 

	public void setHostname(java.lang.String hostname) { 
		this.hostname = hostname;
	} 

	public NodeConsumption hostname(java.lang.String hostname) { 
		this.hostname = hostname;
		return this;
	} 

}
