package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Detailed information on the order of one Hadoop Cluster
 */

public class OrderInformations { 

	private long minimumOrderableNodes;
	private long maximumOrderableNodes;

	public OrderInformations() {
	}

	public long getMinimumOrderableNodes() { 
		return this.minimumOrderableNodes;
	} 

	public void setMinimumOrderableNodes(long minimumOrderableNodes) { 
		this.minimumOrderableNodes = minimumOrderableNodes;
	} 

	public OrderInformations minimumOrderableNodes(long minimumOrderableNodes) { 
		this.minimumOrderableNodes = minimumOrderableNodes;
		return this;
	} 

	public long getMaximumOrderableNodes() { 
		return this.maximumOrderableNodes;
	} 

	public void setMaximumOrderableNodes(long maximumOrderableNodes) { 
		this.maximumOrderableNodes = maximumOrderableNodes;
	} 

	public OrderInformations maximumOrderableNodes(long maximumOrderableNodes) { 
		this.maximumOrderableNodes = maximumOrderableNodes;
		return this;
	} 

}
