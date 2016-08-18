package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Detailed information on a Hadoop Cluster consumption
 */

public class ClusterConsumption { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity;

	public ClusterConsumption() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
	} 

	public ClusterConsumption quantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
		return this;
	} 

}
