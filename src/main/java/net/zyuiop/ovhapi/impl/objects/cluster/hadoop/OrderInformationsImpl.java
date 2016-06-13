package net.zyuiop.ovhapi.impl.objects.cluster.hadoop;

import net.zyuiop.ovhapi.api.objects.cluster.hadoop.OrderInformations;
/**
 * Detailed information on the order of one Hadoop Cluster
 */

public class OrderInformationsImpl implements OrderInformations { 

	private long minimumOrderableNodes;
	private long maximumOrderableNodes;

	public OrderInformationsImpl() {
	}

	public long getMinimumOrderableNodes() { 
		return this.minimumOrderableNodes;
	} 

	public void setMinimumOrderableNodes(long minimumOrderableNodes) { 
		this.minimumOrderableNodes = minimumOrderableNodes;
	} 

	public OrderInformationsImpl minimumOrderableNodes(long minimumOrderableNodes) { 
		this.minimumOrderableNodes = minimumOrderableNodes;
		return this;
	} 

	public long getMaximumOrderableNodes() { 
		return this.maximumOrderableNodes;
	} 

	public void setMaximumOrderableNodes(long maximumOrderableNodes) { 
		this.maximumOrderableNodes = maximumOrderableNodes;
	} 

	public OrderInformationsImpl maximumOrderableNodes(long maximumOrderableNodes) { 
		this.maximumOrderableNodes = maximumOrderableNodes;
		return this;
	} 

}
